package com.yedam.lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LottoApp {

	private Scanner sc = new Scanner(System.in);

	int menu = 0;
	int money = 0;
	int[] lotto = new int[6];
	List<int[]> list = new ArrayList<>();

	public LottoApp() {
		run();
	}

	// 메뉴 선택 로또 프로그램
	private void run() {
		while (menu != 99) {
			System.out.println("메뉴를 선택해주세요.");
			System.out.println("1. 로또 생성 2. 로또 조회 99. 프로그램 종료");
			menu = Integer.parseInt(sc.nextLine());

			switch (menu) {
			case 1:
				makeLotto();
				break;
			case 2:
				showInfo();
				break;
			case 99:
				System.out.println("프로그램 종료");
				break;
			}
		}
	}

	private void showInfo() {
		System.out.println("구매 한 금액> " + money);
		for (int i = 0; i < list.size(); i++) {
			System.out.print((i%5 +1) + "번>");
			for(int j=0 ; j<list.get(i).length;j++) {
				System.out.print(list.get(i)[j] + "  " );
			}
		
		System.out.println();
		
		if((i+1)% 5 == 0) {
			System.out.println("====================");
		}

	}
	}
	private void makeLotto() {
		System.out.println("금액 투입");
		money = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < (money / 1000); i++) {
			makeNumber();
			list.add(lotto);

		}
		System.out.println();

		// 1. 입력한 금액만큼 로또번호 생성
		// 예) 10,000원 -> 6개짜리 번호가 10개
		// list에 저장.

	}

	private void makeNumber() {
		// 로또 번호 6개 만드는거
		// 단, 중복은 발생하면 안된다.
		// 정렬 안해도 됩니다.
		// 잘 되었는지 출력
		lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			int number = (int) (Math.random() * 45 + 1);
			lotto[i] = number;
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i -= 1;

				}
			}
		}
//		for (int j = 0; j < lotto.length; j++) {
//			System.out.print(lotto[j] + " ");

	}

}
