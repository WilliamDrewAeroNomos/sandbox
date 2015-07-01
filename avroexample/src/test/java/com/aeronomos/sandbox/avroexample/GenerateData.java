package com.aeronomos.sandbox.avroexample;

import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.avro.file.DataFileWriter;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.specific.SpecificDatumWriter;
import org.junit.Before;
import org.junit.Test;

import com.aeronomos.sandbox.avroexample.model.User;

public class GenerateData {
	public static final String[] NAMES = { "Bill", "Andy", "Amy", "Al", "Dwayne",
			"Joe", "Sean", "Angelo", "Spike" };
	public static final String[] COLORS = { "red", "orange", "yellow", "green",
			"blue", "purple", "black", "white", "mauve", "shit" };
	public static final int USERS = 2000;
	public static final String PATH = "./target/input/users2.avro";

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void generateTestData() {

		// Open data file
		File file = new File(PATH);
		if (file.getParentFile() != null) {
			file.getParentFile().mkdirs();
		}
		DatumWriter<User> userDatumWriter =
				new SpecificDatumWriter<User>(User.class);
		DataFileWriter<User> dataFileWriter =
				new DataFileWriter<User>(userDatumWriter);
		try {
			dataFileWriter.create(User.SCHEMA$, file);
		} catch (IOException e) {
			fail(e.getLocalizedMessage());
		}

		// Create random users
		try {
			User user;
			Random random = new Random();
			for (int i = 0; i < USERS; i++) {
				user =
						new User(NAMES[random.nextInt(NAMES.length)], random.nextInt(),
								COLORS[random.nextInt(COLORS.length)]);
				dataFileWriter.append(user);
				System.out.println(user);
			}
			dataFileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
