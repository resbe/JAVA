package com.yedam.inter;

public class MyClass {
	//인터페이스를 사용하는 위치
	//1. 필드
	RemoteControl rc =new Television();
	
	//2. 생성자
	public MyClass() {
		
	}
	
	public MyClass(RemoteControl rc) {
		//ex) rc = new Audio(),,, rc = new Television()
		this.rc =rc;
		this.rc.turnOn();
		this.rc.turnOff();
		
	}
	
	//3.메소드
	
	public void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOff();
		rc.turnOn();
	}
	
	
	//4.메소드 2
	public void methodB(RemoteControl rc) {
		rc.turnOff();
		rc.turnOn();
	}
	
}
