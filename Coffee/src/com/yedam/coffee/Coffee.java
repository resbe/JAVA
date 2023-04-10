package com.yedam.coffee;

import lombok.Data;

@Data

public class Coffee {
//	COFFEE_MENU    NOT NULL VARCHAR2(30)   
//	COFFEE_PRICED  NOT NULL NUMBER         
//	COFFEE_EMPLAIN          VARCHAR2(1000) 
//	COFFEE_SALES            NUMBER
	
	
	private String coffeeMenu;
	private int coffeePriced;
	private String coffeeExplain;
	private int coffeSales;
}
