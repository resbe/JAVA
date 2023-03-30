package com.yedam.oop;

public class Book {
	//book이라는 클래스는 아래의 정보를 가집니다.
	//책이름, 책종류, 가격, 도서번호, 출판사
	
	String bookname;
	String kind = "학습서";
	int price;
	String isbn;
	String company;
	
	//생상자는 3개정도 생성
	
	//1) 기본 생성자
	Book() {
		
	}
	
	//2) 모든 데이터를 초기화할 수 있는 생성자
	Book(String booname,String kind, int price ,String isbn, String company){
		this.bookname = bookname;
		this.kind = kind;
		this.price = price;
		this.isbn = isbn;
		this.company = company;
		
	}
	
	//3) 책이름, 책가격, 도서번호를 받아오는 생성자
	Book(String bookname,int price, String isbn) {
		this.bookname = bookname;
		this.price = price;
		this.isbn = isbn;
	}
	//메소드는 getInfo() 메소드 가짐.
	void getInfo() {
		System.out.println("# 책 이름 :" + bookname);
		System.out.println("# 내용");
		System.out.println("1) 종류 : " + kind);
		System.out.println("2) 가격 : " + price);
		System.out.println("3) 출판사 : " + company);
		System.out.println("4) 도서번호 : " + isbn);
	}
	//getInfo() 메소드를 클래스 외부에서 실행하였을때,
	//다음과 같은 출력물이 나오도록 구현.
	//객체.getInfo()
	// # 책 이름 : 혼자 공부하는 자바
	// # 내용
	// 1) 종류 : 학습서
	// 2) 가격 : 24000원
	// 3) 출판사 : 한빛 미디어
	// 4) 도서번호 : yedam001
	
	// # 책 이름 : HTML
	// # 내용
	// 1) 종류 : 학습서
	// 2) 가격 : 15000원
	// 3) 출판사 : 길벗
	// 4) 도서번호 : yedam002
	
	// # 책 이름 : JavaScript
	// # 내용
	// 1) 종류 : 학습서
	// 2) 가격 : 20000원
	// 3) 출판사 : 길벗
	// 4) 도서번호 : yedam003
	
}
