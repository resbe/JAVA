package com.yedam.coffee;

import java.util.List;
import java.util.Scanner;

public class CoffeeService {
	Scanner sc = new Scanner(System.in);
	
	public static Coffee coffeeInfo = null;
	
	
	
	//1. 메뉴 조회
	public void getCoffeeList() {
		List<Coffee> list = CoffeeDAO.getInstance().getCoffeeList();
		
		for(Coffee coffee : list) {
			System.out.println("메뉴 : " + coffee.getCoffeeMenu() + "가격 : " + coffee.getCoffeePriced());
		}
	
	}
	
	
	//2. 메뉴 상세 조회
	
	public void getCOFFEE() {
		System.out.println("메뉴 입력>");
		String coffee_menu = sc.nextLine();
		Coffee coffee = CoffeeDAO.getInstance().getCoffee(coffee_menu);
		
		if(coffee == null) {
			System.out.println("커피가 존재하지 않습니다.");
		}else {
			System.out.println("메뉴 : " + coffee.getCoffeeMenu() + "가격 : " + coffee.getCoffeePriced() + "\t설명 : " + coffee.getCoffeeExplain());	
		}
	}
	
	
	//3.메뉴 등록
	
	public void coffeeAdd() {
		Coffee coffee = new Coffee();
		
		System.out.println("메뉴 입력> ");
		String coffeeName = sc.nextLine();
		System.out.println("가격 입력> ");
		int coffeePriced = Integer.parseInt(sc.nextLine());
		System.out.println("설명 입력> ");
		String coffeeExplain =sc.nextLine();
		
		coffee.setCoffeeMenu(coffeeName);
		coffee.setCoffeePriced(coffeePriced);
		coffee.setCoffeeExplain(coffeeExplain);
		
		int result = CoffeeDAO.getInstance().coffeeAdd(coffee);
		
		if(result > 0) {
			System.out.println("메뉴 입력 성공");
			}else {
				System.out.println("메뉴 입력 실패");
		}
	}
	
	//5.메뉴 삭제
	public void coffeeDelete() {
		System.out.println("메뉴 입력> ");
		String coffeeMenu = sc.nextLine();
		int result = CoffeeDAO.getInstance().coffeeDelete(coffeeMenu);
			if(result> 0) {
				System.out.println("삭제 완료");
				if(coffeeMenu.equals(coffeeInfo.getCoffeeMenu())){
					coffeeInfo = null;
				}
			}else {
				System.out.println("삭제 실패");
			}
				
	}
	
	
}
