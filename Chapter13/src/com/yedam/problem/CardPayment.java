package com.yedam.problem;

public class CardPayment implements Payment {
	double cardRatio;
	
	CardPayment(double cardRatio){
		this.cardRatio = cardRatio;
	}

	@Override
	public int online(int price) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int offline(int price) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		
	}
	
	
}
