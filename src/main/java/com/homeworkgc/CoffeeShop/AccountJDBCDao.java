package com.homeworkgc.CoffeeShop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AccountJDBCDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<UserAccount> findAllAccounts() {
		return jdbcTemplate.query("select * from users", new BeanPropertyRowMapper<UserAccount>(UserAccount.class));
	}
	
	public int addAccount(String firstname, String lastname, String email, String password) {
		String addQuery = "insert into users(firstname, lastname, email, password) values(?,?,?,?)";
		return jdbcTemplate.update(addQuery, firstname, lastname, email, password);
	}
}
