package com.yedam.inheri;

public class AirPlane {
	//부모 클래쓰 final class가 되면 상속이 안됨.
	public void land() {
		System.out.println("착륙 합니다.");
		
	}
	
	//메소드에 final void가 되도 자식이 final 걸어놓은 메소드를 쓸수 없음.
	public void fly() {
		System.out.println("일반 비행입니다.");
		
	}
	
	public void takeOff() {
		System.out.println("이륙 합니다.");
	}
}
