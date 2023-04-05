package com.yedam.problem;

public class DGBCard extends Card {
	static String company = "대구은행";
	String cardStaff;
	
	DGBCard(String cardStaff,String cardNo,int validDate,int CVC){
		super(cardNo,validDate,CVC);
		this.cardStaff = cardStaff;
	}
	
	@Override
	public void showCardInfo() {
		super.showCardInfo();
		System.out.println("\n담당직원 - " + cardStaff + company);
	}
}
