package com.yedam.book;

import com.yedam.common.DAO;

public class BookDAO extends DAO {
	
	private static BookDAO bookDao = null;
	
	private BookDAO() {
		
	}
	
	public static BookDAO getInstance() {
		if(bookDao == null) {
			bookDao = new BookDAO();
		}
		return bookDao;
	}
	
	public Book getsearchBook(String bookName) {
		Book book = null;
		
		
		conn();
		
		String sql = "SELECT bookName,bookWriter,bookGenre,bookPriced,bookLocation FROM employees WHERE bookName =?";
		
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, bookName);
		
		rs = pstmt.executeQuery();
		
		if(rs.next()) {
			book = new Book();
			
			book.setBookName(rs.getString("bookName"));
			book.setBookWriter(rs.getString("bookWriter"));
			book.setBookGenre(rs.getString("bookGenre"));
			book.setBookPriced(rs.getInt("bookPriced"));
			book.setBookLocation(rs.getString("bookLocation"));
			
		}
		
		
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		disconn();
		}
		return book;

		}
	}
	
	
	//책 제목 검색
	public Book getBookName(String bookName) {
		Book book = null;
		try {
			conn();
			
			String sql = "SELECT bookName,bookWriter,bookGenre,bookPriced,bookLocation FROM employees WHERE bookName =?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bookName);
			
			if(
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				book = new Book();
				
				book.setBookName(rs.getString("bookName"));
				book.setBookWriter(rs.getString("bookWriter"));
				book.setBookGenre(rs.getString("bookGenre"));
				book.setBookPriced(rs.getInt("bookPriced"));
				book.setBookLocation(rs.getString("bookLocation"));
				
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return book;

		}
	
	//책 작가 검색
	public Book getBookWriter(String bookWriter) {
		Book book = null;
		try {
			conn();
			
			String sql = "SELECT bookName,bookWriter,bookGenre,bookPriced,bookLocation FROM employees WHERE bookWriter =?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bookWriter);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				book = new Book();
				
				book.setBookName(rs.getString("bookName"));
				book.setBookWriter(rs.getString("bookWriter"));
				book.setBookGenre(rs.getString("bookGenre"));
				book.setBookPriced(rs.getInt("bookPriced"));
				book.setBookLocation(rs.getString("bookLocation"));
				
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return book;

		}
	
	//책 장르 검색
	public Book getBookGenre(String bookGenre) {
		Book book = null;
		try {
			conn();
			
			String sql = "SELECT bookName,bookWriter,bookGenre,bookPriced,bookLocation FROM employees WHERE bookWriter =?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bookGenre);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				book = new Book();
				
				book.setBookName(rs.getString("bookName"));
				book.setBookWriter(rs.getString("bookWriter"));
				book.setBookGenre(rs.getString("bookGenre"));
				book.setBookPriced(rs.getInt("bookPriced"));
				book.setBookLocation(rs.getString("bookLocation"));
				
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return book;

		}
	
	//책 장르 검색
	public Book getBestBookGenre(String bookGenre) {
		Book book = null;
		try {
			conn();
			
			String sql = "SELECT bookName,bookWriter,bookGenre,bookPriced,bookLocation FROM employees WHERE bookWriter =?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bookGenre);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				book = new Book();
				
				book.setBookName(rs.getString("bookName"));
				book.setBookWriter(rs.getString("bookWriter"));
				book.setBookGenre(rs.getString("bookGenre"));
				book.setBookPriced(rs.getInt("bookPriced"));
				book.setBookLocation(rs.getString("bookLocation"));
				
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return book;

		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
