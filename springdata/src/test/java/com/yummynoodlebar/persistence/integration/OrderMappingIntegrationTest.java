package com.yummynoodlebar.persistence.integration;

import javax.persistence.EntityManager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.yummynoodlebar.config.JPAConfiguration;
import com.yummynoodlebar.persistence.domain.fixture.JPAAssertions;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { JPAConfiguration.class })
@Transactional
@TransactionConfiguration(defaultRollback = true)
public class OrderMappingIntegrationTest {

	@Autowired
	EntityManager manager;

	@Test
	public void thatItemCustomMappingWorks() throws Exception {

		JPAAssertions.assertTableExists(manager, "NOODLE_ORDERS");
		JPAAssertions.assertTableExists(manager, "ORDER_ORDER_ITEMS");

		JPAAssertions.assertTableHasColumn(manager, "NOODLE_ORDERS", "ORDER_ID");
		JPAAssertions.assertTableHasColumn(manager, "NOODLE_ORDERS",
				"SUBMISSION_DATETIME");
	}

}