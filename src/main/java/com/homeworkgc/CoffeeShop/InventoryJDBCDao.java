package com.homeworkgc.CoffeeShop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class InventoryJDBCDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<Inventory> findAllItems() {
		return jdbcTemplate.query("select * from items", new BeanPropertyRowMapper<Inventory>(Inventory.class));
	}
	
	
}
