package com.yedam.member;

import java.util.Scanner;

public class CustomerService {

	// 로그인 정보
	public static Customer CustomerInfo = null;
	Scanner sc = new Scanner(System.in);

	// 로그인
	public void login() {
		Customer customer = new Customer();

		System.out.println("ID>");
		int id = Integer.parseInt(sc.nextLine());

		System.out.println("PW>");
		String pw = sc.nextLine();

		customer = CustomerDAO.getInstance().login(id);

		if (customer != null) {
			if (pw.equals(customer.getCustomerPw())) {
				System.out.println("로그인성공");
				CustomerInfo = customer;
			} else {
				System.out.println("아이디 오류");
			}
		}
	}

	public void logout() {
		if (CustomerInfo != null) {
			CustomerInfo = null;
			System.out.println("로그아웃되었습니다.");
		}
	}

	public void customerAdd() {

		System.out.println("ID>");
		int customerId = Integer.parseInt(sc.nextLine());
		System.out.println("PW>");
		String customerPw = sc.nextLine();
		System.out.println("이름>");
		String customerName = sc.nextLine();

		Customer customer = new Customer();

		customer.setCustomerId(customerId);
		customer.setCustomerPw(customerPw);
		customer.setCustomerName(customerName);

		CustomerDAO.getInstance().customerAdd(customer);

	}

}
