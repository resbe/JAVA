package com.yedam.homework0403;

public class RPGgame implements Keypad{

	public RPGgame() {
		System.out.println("RPGgame실행");
	}
	
	@Override
	public void leftUpButton() {
		System.out.println("캐릭터가 위쪽으로 이동한다");
		
	}

	@Override
	public void leftDownButton() {
		System.out.println("캐릭터가 아래쪽으로 이동한다");
		
	}

	@Override
	public void rightUpButton() {
		System.out.println( NORMAL_MODE){
			System.out.println("캐릭터가 한칸단위로 점프한다.");
		}
		System.out.println( HARD_MODE){
			System.out.println("캐릭터가 두칸단위로 점프한다.");
		}
		
	}

	@Override
	public void rightDownButton() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changeMode() {
		// TODO Auto-generated method stub
		
	}
	