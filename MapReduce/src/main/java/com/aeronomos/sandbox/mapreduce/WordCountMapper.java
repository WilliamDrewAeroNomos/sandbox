/**
 * 
 */
package com.aeronomos.sandbox.mapreduce;

import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class WordCountMapper extends Mapper<Object, Text, Text, IntWritable> {

	private final IntWritable ONE = new IntWritable(1);
	private Text word = new Text();

	public void map(Object key, Text value, Context context)
			throws IOException, InterruptedException {

		String line = value.toString();
		
		StringTokenizer st = new StringTokenizer(line, "- \t\n\r\f,.:;?![]'()\"");

		while (st.hasMoreTokens()) {
			word.set(st.nextToken().toLowerCase());
			context.write(word, ONE);
		}
		// for (String str : csv) {
		// word.set(str);
		// context.write(word, ONE);
		// }
	}
}
