package com.aeronomos.hadoopinaction;

import java.io.IOException;
import java.util.Iterator;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.FileInputFormat;
import org.apache.hadoop.mapred.FileOutputFormat;
import org.apache.hadoop.mapred.JobClient;
import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.mapred.KeyValueTextInputFormat;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.Mapper;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reducer;
import org.apache.hadoop.mapred.Reporter;
import org.apache.hadoop.mapred.TextOutputFormat;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;

/**
 * 
 * @author williamdrew
 * 
 */
public class CitationHistogram extends Configured implements Tool {

	private enum CITE_LEVEL {
		HIGH(100), MEDIUM(50), LOW(5);

		private int level;

		CITE_LEVEL(final int level) {
			this.level = level;
		}
	}

	/**
	 * 
	 * @author williamdrew
	 * 
	 */
	public static class MapClass extends MapReduceBase implements
			Mapper<Text, Text, IntWritable, IntWritable> {

		private final static IntWritable uno = new IntWritable(1);
		private IntWritable citationCount = new IntWritable();

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.apache.hadoop.mapred.Mapper#map(java.lang.Object,
		 * java.lang.Object, org.apache.hadoop.mapred.OutputCollector,
		 * org.apache.hadoop.mapred.Reporter)
		 */
		public void map(Text key, Text value,
				OutputCollector<IntWritable, IntWritable> output,
				Reporter reporter) throws IOException {

			try {
				citationCount.set(Integer.parseInt(value.toString()));
				output.collect(citationCount, uno);
			} catch (NumberFormatException nfe) {
				reporter.setStatus(nfe.getLocalizedMessage());
			}
		}
	}

	/**
	 * 
	 * @author williamdrew
	 * 
	 */
	public static class Reduce extends MapReduceBase implements
			Reducer<IntWritable, IntWritable, IntWritable, IntWritable> {

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.apache.hadoop.mapred.Reducer#reduce(java.lang.Object,
		 * java.util.Iterator, org.apache.hadoop.mapred.OutputCollector,
		 * org.apache.hadoop.mapred.Reporter)
		 */
		public void reduce(IntWritable key, Iterator<IntWritable> values,
				OutputCollector<IntWritable, IntWritable> output,
				Reporter reporter) throws IOException {

			int count = 0;
			while (values.hasNext()) {
				count += values.next().get();
			}
			if (count > 1) {
				output.collect(key, new IntWritable(count));
				// reporter.setStatus("Patent cited [" + count + "] times");
				if (count >= CITE_LEVEL.HIGH.level) {
					reporter.incrCounter(CITE_LEVEL.HIGH, 1L);
				} else if ((count >= CITE_LEVEL.MEDIUM.level)
						&& (count < CITE_LEVEL.HIGH.level)) {
					reporter.incrCounter(CITE_LEVEL.MEDIUM, 1L);
				} else {
					reporter.incrCounter(CITE_LEVEL.LOW, 1L);
				}
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.hadoop.util.Tool#run(java.lang.String[])
	 */
	public int run(String[] args) throws Exception {
		Configuration conf = getConf();

		JobConf job = new JobConf(conf, CitationHistogram.class);

		Path in = new Path(args[0]);
		Path out = new Path(args[1]);
		FileInputFormat.setInputPaths(job, in);
		FileOutputFormat.setOutputPath(job, out);

		job.setJobName("CitationHistogram");
		job.setMapperClass(MapClass.class);
		job.setReducerClass(Reduce.class);

		job.setInputFormat(KeyValueTextInputFormat.class);
		job.setOutputFormat(TextOutputFormat.class);
		job.setOutputKeyClass(IntWritable.class);
		job.setOutputValueClass(IntWritable.class);

		job.set("key.value.separator.in.input.line", ",");
		job.set("keep.failed.tasks.files", "true");
		JobClient.runJob(job);

		return 0;
	}

	/**
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		int res = ToolRunner.run(new Configuration(), new CitationHistogram(),
				args);

		System.exit(res);
	}
}
