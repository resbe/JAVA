package com.yedam.account;

import java.sql.Date;

import lombok.Data;

@Data


public class Account {
	private int accountId;
	private int customerId;
	private int balance;
	private Date credate;
	
	private String customerName;
}
