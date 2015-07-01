/**
 * 
 */
package com.aeronomos.sandbox.mapreduce;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

/**
 * 
 * @author wdrew
 */
public class WordCountReducer extends
		Reducer<Text, IntWritable, Text, IntWritable> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.hadoop.mapreduce.Reducer#reduce(KEYIN, java.lang.Iterable,
	 * org.apache.hadoop.mapreduce.Reducer.Context)
	 */
	@Override
	protected void reduce(Text text, Iterable<IntWritable> values, Context context)
			throws IOException, InterruptedException {

		int sum = 0;

		for (IntWritable value : values) {
			sum += value.get();
		}
		context.write(text, new IntWritable(sum));
	}

}
