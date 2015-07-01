/**
 * 
 */
package com.yummynoodlebar.persistence.integration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import com.mongodb.Mongo;
import com.yummynoodlebar.persistence.domain.fixture.MongoAssertions;
import com.yummynoodlebar.persistence.domain.fixture.PersistenceFixture;

/**
 * 
 * @author <a href=mailto:support@aeronomos.org>aeronomos</a>
 * 
 *         $Id: $
 * 
 */
public class MenuItemMappingIntegrationTest {

	MongoOperations mongo;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		mongo =
				new MongoTemplate(new SimpleMongoDbFactory(new Mongo(), "yummynoodle"));

		mongo.dropCollection("menu");
	}

	@Test
	public void thatItemIsInsertedIntoCollectionHasCorrectIndexes()
			throws Exception {
		mongo.insert(PersistenceFixture.standardItem());

		assertEquals(1, mongo.getCollection("menu").count());

		assertTrue(MongoAssertions.usingMongo(mongo).collections("menu")
				.hasIndexOn("_id"));
		assertTrue(MongoAssertions.usingMongo(mongo).collections("menu")
				.hasIndexOn("itemName"));
	}

	@Test
	public void thatItemCustomMappingWorks() throws Exception {
		mongo.insert(PersistenceFixture.standardItem());

		assertTrue(MongoAssertions.usingMongo(mongo).collections("menu").first()
				.hasField("itemName"));

	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

}
