package com.aeronomos.sandbox.avroexample;

import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;

import org.apache.avro.file.DataFileReader;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.avro.specific.SpecificDatumWriter;
import org.junit.Before;
import org.junit.Test;

import com.aeronomos.sandbox.avroexample.model.Automobile;

public class ModelCountMapperTest {

	private static final int AUTO_CAPACIITY = 2;
	private static final int MODEL_YEAR = 2014;
	private static final String CADILLAC = "Cadillac";
	private static final String GMC = "General Motors";
	private static final File outputFile = new File("output/autos.avro");

	@Before
	public void setUp() throws Exception {

		if (outputFile.exists()) {
			outputFile.delete();
		}

		new File("target/avro").mkdir();

		DatumWriter<Automobile> datumWriter =
				new SpecificDatumWriter<Automobile>(Automobile.class);
		DataFileWriter<Automobile> fileWriter =
				new DataFileWriter<Automobile>(datumWriter);

		Automobile auto = null;

		auto =
				Automobile.newBuilder().setMake(GMC).setModelName(CADILLAC)
						.setModelYear(MODEL_YEAR).setPassengerCapacity(AUTO_CAPACIITY)
						.build();

		try {
			fileWriter.create(auto.getSchema(), outputFile);
			fileWriter.append(auto);

			auto =
					Automobile.newBuilder().setMake("Ford").setModelName("Leaf")
							.setModelYear(MODEL_YEAR).setPassengerCapacity(1).build();
			fileWriter.append(auto);

			fileWriter.close();
		} catch (IOException e) {
			fail(e.getLocalizedMessage());
		}

	}

	@Test
	public void testDeserialize() {

		DatumReader<Automobile> datumReader =
				new SpecificDatumReader<Automobile>(Automobile.class);
		try {
			DataFileReader<Automobile> fileReader =
					new DataFileReader<Automobile>(outputFile, datumReader);
			Automobile auto = null;

			while (fileReader.hasNext()) {

				auto = fileReader.next(auto);

				// assertEquals(GMC, auto.getMake().toString());
				// assertEquals(CADILLAC, auto.getModelName().toString());
				// assertEquals(Integer.valueOf(MODEL_YEAR), auto.getModelYear());
				// assertEquals(Integer.valueOf(AUTO_CAPACIITY),
				// auto.getPassengerCapacity());

				System.out.println(auto.getSchema().getName() + " " + auto);
				System.out.println("Full name : " + auto.getSchema().getFullName());
			}

			fileReader.close();

		} catch (IOException e) {
			fail(e.getLocalizedMessage());
		}
	}

}
