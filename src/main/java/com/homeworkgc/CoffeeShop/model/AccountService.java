package com.homeworkgc.CoffeeShop.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class AccountService {
	
	private List<UserAccount> accounts = new ArrayList<>();
	
	// add accounts
	public void addAccount(UserAccount account) {
		accounts.add(account);
	}
}
