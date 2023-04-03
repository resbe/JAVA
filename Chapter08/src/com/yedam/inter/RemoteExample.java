package com.yedam.inter;

public class RemoteExample {
	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Audio();
		rc = new Television();
		
		rc.turnOn();
		rc.setVolume(5);
		rc.setVolume(12);
		rc.setVolume(-5);
		rc.turnOff();
		
		SmartTelevision tv = new SmartTelevision();
		
		//2개의 인터페이스를 상속 =tv
		
		RemoteControl rc2 = tv;
		
		rc2.turnOn();
		rc2.setVolume(4);
		rc.turnOff();
		
//		rc.search("naver");
		
		//인터페이스간 상속으로 이 내용을 쓸 수 있다.
		
		Searchable search = tv;
		
		tv.search("www.navver.com");
		search.turnOff();
		search.setVolume(8);
		search.turnOn();
		
		
		
		
		
		
	}
}
