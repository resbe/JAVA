package com.yedam.member;

import lombok.Data;

@Data

public class Customer {
	private int customerId;
	private String customerPw;
	private String customerName;
//	private int accountId;
	private String customerGrade;
	
	//join 할 때 customer 테이블에 있는 cutomer_name을 저장하기 위해
	//필드 추가
	private String cutomerName;
	
}
