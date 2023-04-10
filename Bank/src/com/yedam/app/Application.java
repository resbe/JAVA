package com.yedam.app;

import java.util.Scanner;

import com.yedam.member.CustomerService;

public class Application {
	
	Scanner sc = new Scanner(System.in);
	CustomerService cs = new CustomerService();
	public Application() {
		run();
	}
	
	int menuNo =0;
	private void run() {
		while(true) {
		System.out.println("1.로그인 | 2.종료");
		menuNo = Integer.parseInt(sc.nextLine());
		
		if(menuNo ==1) {
			//로그인 시도 메소드
			cs.login();
			if(CustomerService.CustomerInfo != null) {
				new ManageMent();
			}
		
		}else if(menuNo ==2){
			System.out.println("프로그램 종료");
			break;
		}
		
		
		}
	}
	
	
	
	
}
