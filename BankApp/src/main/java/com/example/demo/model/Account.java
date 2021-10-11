package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ACCOUNT_TABLE")
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long accountId;
	@Column(name = "CUSTOMER_ID")
	private Long customerId;
	@Column(name = "ACCOUNT_NUMBER")
	private String accountNUmber;
	@Column(name = "Balance")
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
