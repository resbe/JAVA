package com.yedam.poly;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
		//문제 1)
		int a = 10;
		double b = 2.0;
		double plus = a+b;
		double minus = a-b;
		double gob = a*b;
		double nanum = a/b;
		
		System.out.println("더하기 :" + plus);
		System.out.println("빼기 :" + minus);
		System.out.println("곱하기 :" + gob);
		System.out.println("나누기 :" + nanum);

		
		//문제 2)
		int num1 = 10;
		int num2 = 20;
		boolean result;
		
		result = ((num1 > 10) &&(num2 > 10));
		System.out.println(result);
		result = ((num1 > 10) ||(num2 > 10));
		System.out.println(result);
		System.out.println(!result);
		
		//문제 3)
		int [] coinUnit = {500, 100, 50, 10};
		int money = 2680;
		int [] coinCount = new int[4];
		System.out.println("money = " + money);
		for(int i = 0; i < coinUnit.length; i++) {
			coinCount[i] = (int)(money/coinUnit[i]);
			money = money%coinUnit[i];
			System.out.print(coinUnit[i] + " 원 :" + coinCount[i] + "개, ");
		}	System.out.println();
		
		//문제 4)
		 for(int j=2; j<10 ; j++) {
			 for(int i=1; i<=j ; i++) {
				System.out.printf("%d x %d = %-4d", j,i,i*j);
			 }  System.out.println();
		 }
		 
		 //문제5 )
		 Scanner sc = new Scanner(System.in);
		 int size = 0; //주사위 크기
		 int []dice = null;
		 boolean run =true;
		 
		 
		 while(run) {
			 System.out.println("===1.주사위 크기\\ 2.주사위 굴리기 \\ 3.결과 보기 \\ 4.가장 많이 나온 수 \\ 5.종료");
			 System.out.println("메뉴 > ");
			 
			 String selecNo = sc.nextLine();
			 
			 switch(selectNo) {
			 case "1" :
				 System.out.println("주사위 크기> ");
				 size = Integer.parseInt(sc.nextLine());
				 if(size < 5 || size > 10) {
					 System.out.println("5~10사이의 수를 입력하세요.");
				 }
				 break;
			 case "2" :
				 //주사위 크기 설정
				 dice = new int[size];
				 //몇 번 반복했는지
				 int count =0;
				 //5가 언제 나올지 모르기 때문에, while 나올때까지 반복문을 사용하기위함.
				 while(true) {
					 int random = (int)(Math.random()*size)+1;
					 System.out.println(random);
					 //각 주사위 숫자 -> 배열 저장
					 //주사위 숫자 1 2 3 4 5
					 //배	열  0 1 2 3 4 5
					 dice[random-1] = dice[random-1]+1;//dice[random-1]++
					  count++;
					 if(random == 5) {
						 break;
					 }
				 }
				 System.out.println("5가 나올 때까지 주사위를 " + count + "번 굴렸습니다.");
				 break;
				 //만약 주사위의 크기가 5보다 작고 10보다 크다면...?
				 if(size != 0) {
					 //주사위를 돌린다.
				 }else {
					 System.out.println("주사위 크기 재입력하세요.");
				 }
				 
				 break;
			 case "3" :
				 for(int i= 0; i<dice.length; i++) {
					 System.out.println((i+1)+ "은 " + dice[i] + "번 나왔습니다.");
				 }
				 break;
			 case "4" :
				 int max = dice[0];
				 int index = 0;
				 for (int i = 0; i<dice.length; i++) {
					 if(max < dice[i]) {
						 max = dice[i];
						 index = i;
					 }
				 }
				 System.out.println("가장 많이 나온 수는 " + (index+1) + "입니다");
				 break;
			 case "5" :
				 System.out.println("프로그램 종료");
				 break;
				 
				 
			 }
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
//		 boolean run =true;
//			int diceSize = 0;
//			int[] size =null;
//			int count = 0;
//			int x = (int)(Math.random()*diceSize)+1;
//			Scanner sc = new Scanner(System.in);
//			
//			while(run) {
//				System.out.println("===1.주사위 크기\\ 2.주사위 굴리기 \\ 3.결과 보기 \\ 4.가장 많이 나온 수 \\ 5.종료");
//				System.out.println("메뉴> ");
//				
//				int selectNo = Integer.parseInt(sc.nextLine());
//				
//				if(selectNo == 1) {
//					System.out.println("주사위 크기 > ");
//					diceSize = sc.nextInt();
//					sc.nextLine();
//					if(diceSize < 5 || diceSize >10) {
//						 System.out.println("5~10까지의 범위를 지정해 다시설정해주세요");
//						 continue;
//					}
//					size = new int[diceSize];
//				
//				}else if(selectNo ==2) {
//					for(int i=1; i<=x; i++) {
//					  if(size[i] != 5) {
//						  count  += 1;
//					  } 
//					}System.out.println("5가 나올때까지" +count);
//				
//				}else if(selectNo ==3) {
//					for(int i=1; i<=x; i++) {
//						  if(size[i] != 5) {
//							  System.out.println(size[i] + "는" + i + "번 나왔습니다.");
//			
//						  }
//							  
//						  }
//	
//				}else if(selectNo ==4) {
//						
//					
//				}else if(selectNo ==5) {
//					run =false;		
//				}
//			}
//			
//			System.out.println("프로그램 종료");
//	
//		
		
		}
	}


