package com.aeronomos.sandbox.avroexample;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

import org.apache.avro.file.DataFileStream;
import org.apache.avro.generic.GenericDatumReader;
import org.apache.avro.generic.GenericRecord;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;

public class SmallFilesRead {

	private static final String FIELD_FILENAME = "filename";
	private static final String FIELD_CONTENTS = "contents";

	public static void readFromAvro(InputStream is) throws IOException {
		DataFileStream<Object> reader = // <co id="ch02_smallfileread_comment1"/>
				new DataFileStream<Object>(is, new GenericDatumReader<Object>());

		int recordCount = 0;

		for (Object o : reader) { // <co id="ch02_smallfileread_comment2"/>
			GenericRecord r = (GenericRecord) o; // <co
																						// id="ch02_smallfileread_comment3"/>
			System.out
					.println( // <co id="ch02_smallfileread_comment4"/>
					r.get(FIELD_FILENAME)
							+ ": "
							+ DigestUtils.md5Hex(((ByteBuffer) r.get(FIELD_CONTENTS)).array()));

			recordCount++;
		}
		IOUtils.cleanup(null, is);

		IOUtils.cleanup(null, reader);

		System.out.println("Record count [" + recordCount + "]");
	}

	public static void main(String... args) throws Exception {
		Configuration config = new Configuration();
		FileSystem hdfs = FileSystem.get(config);

		Path destFile = new Path(args[0]);

		InputStream is = hdfs.open(destFile);
		readFromAvro(is);
	}
}