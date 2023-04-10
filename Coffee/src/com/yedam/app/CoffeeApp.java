package com.yedam.app;

import java.util.Scanner;

import com.yedam.coffee.CoffeeService;

public class CoffeeApp {
	
	int menu = 0;
	CoffeeService cs = new CoffeeService();
	Scanner sc = new Scanner(System.in); 
	public CoffeeApp() {
		run();
	}
	
	private void run() {
		while(true) {
			System.out.println("1.메뉴 조회 | 2. 메뉴 상세 조회 | 3. 메뉴 등록 | 4. 판매 | 5. 메뉴 삭제 | 6.매출 | 7. 종료");
			System.out.println("메뉴 입력>");
			int menu = Integer.parseInt(sc.nextLine());
			if(menu == 1) {
				cs.getCoffeeList();
			}else if(menu == 2) {
				cs.getCOFFEE();
			}else if(menu ==3) {
				cs.coffeeAdd();
			}else if(menu == 5) {
				cs.coffeeDelete();
			}else if(menu == 7)
				System.out.println("end of prog");
		}
	}
	
}
