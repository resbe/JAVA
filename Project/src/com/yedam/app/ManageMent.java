package com.yedam.app;

import java.util.Scanner;

import com.yedam.consumer.ConsumerService;

public class ManageMent {
	public ManageMent() {
		bookStore();
	}
	
	ConsumerService cs = new ConsumerService();
	
	
	int menu = 0;
	Scanner sc = new Scanner(System.in);
	
	private void bookStore() {
		while(true) {
			menu();
			if(ConsumerService.ConsumerInfo.getUserGrade().equals("C")){
				if(menu == 1) {
					
				}else if(menu ==2) {
					
				}else if(menu == 3) {
				cs.logout;
					break;
				}
			}else if(ConsumerService.ConsumerInfo.getUserGrade().equals("C")) {
				if(menu == 1) {
					
				
			}else if(menu ==2) {
				
				break;
			}
}

		}
	}
}
