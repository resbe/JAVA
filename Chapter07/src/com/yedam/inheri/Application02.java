package com.yedam.inheri;

public class Application02 {

	public static void main(String[] args) {
		//자식 클래스 객체
		DmbCellPhone dmb = new DmbCellPhone(1, "white", "자바폰");
		
		//자식 클래스 객체 dmb2
		DmbCellPhone dmb2 = new DmbCellPhone(2, "black","디바폰");
		
		System.out.println(dmb.model);
		System.out.println(dmb2.model);
		
		//부모 클래스 메소드 사용
		dmb.powerOn();
		dmb.powerOff();
		dmb.bell();
		dmb.hangUp();
		
		//자식 클래스 메소드 사용
		dmb.turnOnDmb();
		dmb.turnOffDmb();

	}

}
