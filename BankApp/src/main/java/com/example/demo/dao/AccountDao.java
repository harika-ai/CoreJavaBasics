package com.example.demo.dao;

public class AccountDao {

	private Long accountId;
	private Long customerId;
	private String accountNUmber;
	private Long balance;

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getAccountNUmber() {
		return accountNUmber;
	}

	public void setAccountNUmber(String accountNUmber) {
		this.accountNUmber = accountNUmber;
	}

	public Long getBalance() {
		return balance;
	}

	public void setBalance(Long balance) {
		this.balance = balance;
	}

}