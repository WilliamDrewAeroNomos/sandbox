package com.yummynoodlebar.persistence.domain.fixture;

import java.util.Arrays;
import java.util.List;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.index.IndexInfo;

import com.mongodb.DBObject;

/**
 * 
 * 
 * @author <a href=mailto:support@aeronomos.org>aeronomos</a>
 * 
 *         $Id: $
 * 
 */
public class MongoAssertions {

	private MongoOperations ops;

	public static MongoAssertions usingMongo(final MongoOperations ops) {
		MongoAssertions assertions = new MongoAssertions();
		assertions.ops = ops;
		return assertions;
	}

	public CollectionAssertions collections(final String name) {
		return new CollectionAssertions(name);
	}

	/**
	 * 
	 * 
	 * @author <a href=mailto:support@aeronomos.org>aeronomos</a>
	 * 
	 *         $Id: $
	 * 
	 */
	public class CollectionAssertions {

		private String collection;

		/**
		 * 
		 * @param name
		 */
		CollectionAssertions(final String name) {
			this.collection = name;
		}

		/**
		 * 
		 * @param fields
		 * @return
		 */
		public boolean hasIndexOn(String... fields) {
			List<IndexInfo> indexes = ops.indexOps(collection).getIndexInfo();
			for (IndexInfo info : indexes) {
				if (info.isIndexForFields(Arrays.asList(fields))) {
					return true;
				}
			}
			return false;
		}

		/**
		 * 
		 * @return
		 */
		public DocumentAssertions first() {
			return new DocumentAssertions(ops.getCollection(collection).findOne());
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
	public class DocumentAssertions {
		DBObject document;

		/**
		 * 
		 * @param document
		 */
		public DocumentAssertions(DBObject document) {
			this.document = document;
		}

		public boolean hasField(final String name) {
			return document.containsField(name);
		}

		public Object fieldContent(final String name) {
			return document.get(name);
		}
	}

}
