package com.yedam.coffee;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class CoffeeDAO extends DAO{
	private static CoffeeDAO coffeeDao = null;
	
	private CoffeeDAO() {
		
	}
	
	public static CoffeeDAO getInstance() {
		if(coffeeDao == null) {
			coffeeDao = new CoffeeDAO();
			
		}
		return coffeeDao;
		}
	
	//1.메뉴 조회
	
	public List<Coffee> getCoffeeList(){
		List<Coffee> list = new ArrayList<>();
		Coffee coffee = null;
		try {
			conn();
			String sql = "SELECT * FROM coffee";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				coffee = new Coffee();
				
				coffee.setCoffeeMenu(rs.getString("coffee_menu"));
				coffee.setCoffeePriced(rs.getInt("coffee_priced"));
				list.add(coffee);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}
	
	//2.상세 조회
	public Coffee getCoffee(String coffee_menu) {
		Coffee coffee = null;
		try {
			conn();
			
			String sql = "SELECT * FROM coffee WHERE coffee_menu =?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, coffee_menu);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				coffee = new Coffee();
				
				coffee.setCoffeeMenu(rs.getString("coffee_menu"));
				coffee.setCoffeePriced(rs.getInt("coffee_priced"));
				coffee.setCoffeeExplain(rs.getString("coffee_explain"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return coffee;
	}
	
	
	//3.메뉴 등록
	public int coffeeAdd(Coffee coffee) {
		int result =0;
		try {
			conn();
			String sql ="INSER INTO coffee values(?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,coffee.getCoffeeMenu());
			pstmt.setInt(2, coffee.getCoffeePriced());
			pstmt.setString(3, coffee.getCoffeeExplain());
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		
		
		return result;
		
	}
	
	//5.메뉴 삭제
	public int coffeeDelete(String coffee_name) {
		int result = 0;
		try {
			conn();
			String sql = "deletge from coffee where coffee_name = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, coffee_name);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	//매출
	
	

}
