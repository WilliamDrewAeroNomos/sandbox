package com.yummynoodlebar.persistence.integration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yummynoodlebar.config.MongoConfiguration;
import com.yummynoodlebar.persistence.domain.MenuItem;
import com.yummynoodlebar.persistence.domain.fixture.PersistenceFixture;
import com.yummynoodlebar.persistence.repository.MenuItemRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { MongoConfiguration.class })
public class MenuItemRespositoryIntegrationTest {

	@Autowired
	MenuItemRepository menuItemRepository;

	@Autowired
	MongoOperations mongo;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		mongo.dropCollection("menu");
	}

	@After
	public void tearDown() throws Exception {
		mongo.dropCollection("menu");
	}

	@Test
	public void thatItemIsInsertedIntoRepo() {

		assertEquals(0, mongo.getCollection("menu").count());

		menuItemRepository.save(PersistenceFixture.standardItem());
		menuItemRepository.save(PersistenceFixture.eggFriedRice());
		menuItemRepository.save(PersistenceFixture.standardItem());

		assertEquals(3, mongo.getCollection("menu").count());

		Iterable<MenuItem> iter = menuItemRepository.findAll();

		for (MenuItem item : iter) {
			assertNotNull(item);
			System.out.println("MenuItem : " + item.toString());
			System.out.println("Description : " + item.getDescription());
		}
	}

	@Test
	public void thatItemFoundByIngredientsName() {

		assertEquals(0, mongo.getCollection("menu").count());

		menuItemRepository.save(PersistenceFixture.standardItem());
		menuItemRepository.save(PersistenceFixture.eggFriedRice());
		menuItemRepository.save(PersistenceFixture.standardItem());

		List<MenuItem> list = menuItemRepository.findByIngredientsNameIn("Peanuts");

		assertEquals(2, list.size());
	}

	@Test
	public void analyseIngredientsByPopularity() {

		assertEquals(0, mongo.getCollection("menu").count());

		menuItemRepository.save(PersistenceFixture.standardItem());
		menuItemRepository.save(PersistenceFixture.standardItem());
		menuItemRepository.save(PersistenceFixture.standardItem());
		menuItemRepository.save(PersistenceFixture.eggFriedRice());
		menuItemRepository.save(PersistenceFixture.eggFriedRice());

		Map<String, Integer> ingredientCountMap =
				menuItemRepository.analyseIngredientsByPopularity();

		assertEquals(5, (int) ingredientCountMap.get("Egg"));
		assertEquals(3, (int) ingredientCountMap.get("Noodles"));
		assertEquals(3, (int) ingredientCountMap.get("Peanuts"));
		assertEquals(2, (int) ingredientCountMap.get("Rice"));
	}

}
