package com.yedam.exception;

public class Application02 {
	public static void main(String[] args) {
		try{
			findClass();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("클래스가 존재 하지 않습니다.");
		}
	}
	
	public static void findClass() throws ClassNotFoundException{
		Class clazz = Class.forName("java.lang.String2");
	}
	
	
	
}	