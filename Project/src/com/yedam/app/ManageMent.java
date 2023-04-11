package com.yedam.app;

import java.util.Scanner;

import com.yedam.book.BookService;
import com.yedam.consumer.ConsumerService;

public class ManageMent {
	public ManageMent() {
		bookStore();
	}

	ConsumerService cs = new ConsumerService();

	int menu = 0;
	Scanner sc = new Scanner(System.in);
	BookService bs = new BookService(); 
	private void bookStore() {
		while (true) {
			menu();
			if (ConsumerService.ConsumerInfo.getUserGrade().equals("C")) {
				if (menu == 1) {
					SearchMenu();
				} else if (menu == 2) {

				} else if (menu == 3) {
					cs.logout();
					break;
				}
			} else if (ConsumerService.ConsumerInfo.getUserGrade().equals("C")) {
				if (menu == 1) {
					
				} else if (menu == 2) {

				} else if (menu == 3) {
					cs.logout();
					break;
				}
			}

		}
	}
	
	
	

	private void menu() {
		if (ConsumerService.ConsumerInfo.getUserGrade().equals("C")) {
			System.out.println("1. 책 찾기 | 2.마이페이지 | 3. 로그아웃 ");
		} else if (ConsumerService.ConsumerInfo.getUserGrade().equals("B")) {
			System.out.println("1. 도서 검색 | 2. BEST 도서 검색 | 3.로그아웃");
		}
		System.out.println("입력>");
		menu = Integer.parseInt(sc.nextLine());
	}
	
	public void SearchMenu() {
		System.out.println("1. 도서 검색 | 2. BEST 도서 검색 | 3. 뒤로가기");
		menu = Integer.parseInt(sc.nextLine());
		while(true) {
		if(menu == 1) {
			getLastBookMenu();
		}else if(menu == 2) {
		
		System.out.println("장르 검색 > ");	
		}else {
			break;
			}
		}
	}
	public void getLastBookMenu() {
		System.out.println("1. 도서제목 검색 | 2. 저자 검색 | 3. 장르 검색 | 4. 뒤로가기");
		int search = Integer.parseInt(sc.nextLine());
		while(true) {
		if(search == 1) {
			bs.getBookName();
			choiceMenu();
		}else if(search == 2) {
			bs.getBookWriter();
		}else if(search == 3) {
			bs.getBookGenre();
		}else {
			break;
		}
	}
	}	
	public void choiceMenu() {
		System.out.println("고유번호를 입력해주세요");
		
	}
		
	public void myPage() {
		System.out.println("1. 구매내역 | 2. MY정보보기 | 3.MY 정보 수정 | 4. 뒤로가기 ");
		menu = Integer.parseInt(sc.nextLine());
		while(true) {
		if(menu == 1) {
		
		}else if(menu == 2) {
		
		}else if(menu == 3){
		
		}else if(menu ==4) {
			break;
	
		}
	}
	}
	
	
			
}
