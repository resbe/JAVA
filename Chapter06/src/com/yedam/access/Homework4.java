package com.yedam.access;

import java.util.Scanner;

import com.yedam.oop.Student;

public class Homework4 {

	public static void main(String[] args) {
			// 문제2) 다음은 키보드로부터 상품 수와 상품 가격을 입력받아서
			// 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합을 구하는 프로그램을 작성하세요.
			// 1) 메뉴는 다음과 같이 구성하세요.
			// 1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료
			// 2) 입력한 상품 수만큼 상품명과 해당 가격을 입력받을 수 있도록 구현하세요.
			// 3) 제품별 가격을 출력하세요.
			//	출력예시, "상품명 : 가격"
			// 4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
			// 5) 종료 시에는 프로그램을 종료한다고 메세지를 출력하도록 구현하세요.
			
			 		Scanner sc = new Scanner(System.in);
			
			 			int productCount = 0;
			 			Product[] productAry = null;
			
			 			while(true) {
			 				System.out.println("1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료");
			 				System.out.println("메뉴 입력> ");
			 				String selectNo = sc.nextLine();
				
			 					if(selectNo.equals("1")) {
			 						System.out.println("상품 수 입력> ");
			 						productCount = Integer.parseInt(sc.nextLine());
			 					}else if(selectNo.equals("2")) {
			 						productAry = new Product[productCount];
			 						for(int i=0; i<productAry.length; i++) {
			 							productAry[i] = new Product();
			 						System.out.println("상품 입력> ");
			 						System.out.println("가격 입력> ");
			 						String name = sc.nextLine();
			 						int price = Integer.parseInt(sc.nextLine());
			 						productAry[i].productName = name;
			 						productAry[i].productPrice = price;
			 						}
			 					}else if(selectNo.equals("3")) {
			 						for(int i=0; i<productAry.length; i++) {
			 						System.out.println(productAry[i].productName + " : " +productAry[i].productPrice);
			 								 						}
			 					}else if(selectNo.equals("4")) {
			 						int max = 0;
			 						int sum = 0;
			 						for(int i = 0 ; i < productAry.length ; i++) {
			 							sum += productAry[i].productPrice;
			 								if( productAry[i].productPrice > max) {
			 									max = productAry[i].productPrice;
			 								}
			 									
			 						}for(int i = 0 ; i < productAry.length ; i++) {
			 							if(productAry[i].productPrice == max) {
			 								System.out.println("최고가제품명 :" +  productAry[i].productName);
			 								System.out.println(sum-max + "원");
			 							}
			 						}
			 					}else if(selectNo.equals("5")) {
			 						System.out.println("프로그램 종료");
			 						break;
			 					}else {
			 						System.out.println("없는 메뉴입니다. 다시 입력하세요.");	
			 						
			 						
		}

	}
	}
}

