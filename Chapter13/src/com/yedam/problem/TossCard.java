package com.yedam.problem;

public class TossCard extends Card {

	
	
	String cardStaff;
	static String company = "Toss";
	
	public TossCard(String cardStaff,String cardNo,int validDate,int CVC){
		super(cardNo,validDate,CVC);
		this.cardStaff = cardStaff;
	}
	
	@Override
	public void showCardInfo() {
		System.out.println("\n카드정보 - Card NO : " + cardNo + ", 유효기간 : " +validDate + "\n담당직원 - " + cardStaff + company);
		
	}


}
