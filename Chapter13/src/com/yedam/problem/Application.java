package com.yedam.problem;

public class Application {

	public static void main(String[] args) {
		Card card = new Card("5432-4567-9534-3657",20251203,253);
		card.showCardInfo();
		TossCard tosscard = new TossCard("신빛용","5432-4567-9534-3657",20251203,253);
		tosscard.showCardInfo();
		DGBCard dgbcard = new DGBCard("신빛용","5432-4567-9534-3657",20251203,253);
		dgbcard.showCardInfo();
	}

}
