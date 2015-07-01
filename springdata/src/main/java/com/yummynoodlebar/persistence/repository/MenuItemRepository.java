package com.yummynoodlebar.persistence.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.yummynoodlebar.persistence.domain.MenuItem;

public interface MenuItemRepository extends CrudRepository<MenuItem, String>,
		AnalyseIngredients {

	public List<MenuItem> findByIngredientsNameIn(String... name);

}
