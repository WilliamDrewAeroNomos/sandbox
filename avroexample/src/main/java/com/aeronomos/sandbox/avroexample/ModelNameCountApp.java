package com.aeronomos.sandbox.avroexample;

import java.io.File;

import org.apache.avro.Schema;
import org.apache.avro.Schema.Type;
import org.apache.avro.mapred.AvroJob;
import org.apache.avro.mapred.Pair;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.mapred.FileInputFormat;
import org.apache.hadoop.mapred.FileOutputFormat;
import org.apache.hadoop.mapred.JobClient;
import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.util.Tool;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.aeronomos.sandbox.avroexample.model.Automobile;

/**
 * 
 * 
 * @author <a href=mailto:support@aeronomos.org>aeronomos</a>
 * 
 *         $Id: $
 * 
 */
public class ModelNameCountApp extends Configured implements Tool {

	private static final Logger LOG = LoggerFactory
			.getLogger(ModelNameCountApp.class.getName());

	private static final String JOB_NAME = "ModelNameCountJob";

	@Override
	public int run(String[] args) throws Exception {

		Configuration conf = getConf();

		System.out.println(conf);

		JobConf job = new JobConf(conf, ModelNameCountApp.class);
		System.out.println(job);
		job.setJobName(JOB_NAME);

		FileInputFormat.setInputPaths(job, new Path(args[0]));
		FileOutputFormat.setOutputPath(job, new Path(args[1]));

		AvroJob.setMapperClass(job, ModelCountMapper.class);
		AvroJob.setReducerClass(job, ModelCountReducer.class);

		AvroJob.setInputSchema(job, Automobile.getClassSchema());
		AvroJob
				.setOutputSchema(
						job,
						Pair.getPairSchema(Schema.create(Type.STRING),
								Schema.create(Type.INT)));

		JobClient.runJob(job);

		return 0;

	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		if (args == null || args.length != 2) {
			throw new IllegalArgumentException(
					"Two parameters must be supplied to the command, "
							+ "input directory and output directory.");
		}

		new File(args[0]).mkdir();
		new File(args[1]).mkdir();

		int result = 0;

		try {
			result = new ModelNameCountApp().run(args);
		} catch (Exception e) {
			result = -1;
			LOG.error("An error occurred while trying to run the example", e);
		}

		if (result == 0) {
			LOG.info("SUCCESS");
		} else {
			LOG.error("FAILED");
		}

	}
}
