package com.aeronomos.sandbox.avroexample;

import java.io.IOException;

import org.apache.avro.Schema;
import org.apache.avro.mapred.AvroKey;
import org.apache.avro.mapreduce.AvroJob;
import org.apache.avro.mapreduce.AvroKeyInputFormat;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;

import com.aeronomos.sandbox.avroexample.model.User;

/**
 * 
 * 
 * @author <a href=mailto:support@aeronomos.org>aeronomos</a>
 * 
 *         $Id: $
 * 
 */
public class MapReduceColorCount extends Configured implements Tool {

	/**
	 * 
	 * 
	 * @author <a href=mailto:support@aeronomos.org>aeronomos</a>
	 * 
	 *         $Id: $
	 * 
	 */
	public static class ColorCountMapper extends
			Mapper<AvroKey<User>, NullWritable, Text, IntWritable> {

		@Override
		public void map(AvroKey<User> key, NullWritable value, Context context)
				throws IOException, InterruptedException {

			CharSequence color = key.datum().getFavoriteColor();
			if (color == null) {
				color = "none";
			}
			context.write(new Text(color.toString()), new IntWritable(1));
		}
	}

	/**
	 * 
	 * 
	 * @author <a href=mailto:support@aeronomos.org>aeronomos</a>
	 * 
	 *         $Id: $
	 * 
	 */
	public static class ColorCountReducer extends
			Reducer<Text, IntWritable, CharSequence, Integer> {

		@Override
		public void reduce(Text key, Iterable<IntWritable> values, Context context)
				throws IOException, InterruptedException {

			int sum = 0;
			for (IntWritable value : values) {
				sum += value.get();
			}
			System.out.println("Color [" + key.toString() + " = [" + sum + "]");

			context.write((key.toString()), (Integer) sum);
		}
	}

	public int run(String[] args) throws Exception {
		if (args.length != 2) {
			System.err
					.println("Usage: MapReduceColorCount <input path> <output path>");
			return -1;
		}

		Job job = new Job(getConf());
		job.setJarByClass(MapReduceColorCount.class);
		job.setJobName("Color Count");

		FileInputFormat.setInputPaths(job, new Path(args[0]));
		FileOutputFormat.setOutputPath(job, new Path(args[1]));

		job.setMapperClass(ColorCountMapper.class);
		job.setInputFormatClass(AvroKeyInputFormat.class);
		job.setMapOutputKeyClass(Text.class);
		job.setMapOutputValueClass(IntWritable.class);
		AvroJob.setInputKeySchema(job, User.getClassSchema());

		job.setReducerClass(ColorCountReducer.class);

		// job.setOutputFormatClass(AvroKeyValueOutputFormat.class);
		// AvroJob.setOutputKeySchema(job, Schema.create(Schema.Type.STRING));
		// AvroJob.setOutputValueSchema(job, Schema.create(Schema.Type.INT));

		AvroJob.setOutputKeySchema(job, Schema.create(Schema.Type.STRING));
		AvroJob.setOutputValueSchema(job, Schema.create(Schema.Type.INT));

		return (job.waitForCompletion(true) ? 0 : 1);
	}

	public static void main(String[] args) throws Exception {
		int res = ToolRunner.run(new MapReduceColorCount(), args);
		System.exit(res);
	}
}
