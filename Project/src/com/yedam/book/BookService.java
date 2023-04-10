package com.yedam.book;

import java.util.Scanner;

public class BookService {

	Scanner sc = new Scanner(System.in);
	
	//책 제목 검색
	public void getBookName() {
		System.out.println("책 이름>");
		String bookName = sc.nextLine();
		Book book = BookDAO.getInstance().getBookName(bookName);
		
		if(book == null){
			System.out.println("해당 책은 존재하지 않습니다.");
		}else {
			System.out.println("책이름 : " + book.getBookName());
			System.out.println("저자 : " + book.getBookWriter());
			System.out.println("가격 : " + book.getBookPriced());
			System.out.println("위치 : " + book.getBookLocation());
		}
	}
	
	
	//책 
	public void getBookWriter() {
		System.out.println("책 이름>");
		String bookWriter = sc.nextLine();
		Book book = BookDAO.getInstance().getBookWriter(bookWriter);
		
		if(book == null){
			System.out.println("해당 책은 존재하지 않습니다.");
		}else {
			System.out.println("책이름 : " + book.getBookName());
			System.out.println("저자 : " + book.getBookWriter());
			System.out.println("가격 : " + book.getBookPriced());
			System.out.println("위치 : " + book.getBookLocation());
		}
	}
	
}


