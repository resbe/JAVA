package com.yedam.array;

import java.util.Scanner;

public class Example05 {

	public static void main(String[] args) {
		// 최대값과 최대값의 인덱스 구하기
		int[] array = {10,50,70,20,30,80,40};
				
		int max = array[0];
		int maxIndex = 0;
		
		
		for(int i=0; i<array.length; i++) {
			if(max < array[i]) {
				max = array[i];
				maxIndex = i;
			}
		}System.out.println("최대값 : " + max + "최대값 위치 :" + maxIndex);
	
		
		
		///201p 6번
		
		boolean run =true;
		int studentNum = 0;
		int[] scores =null;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 \\ 2.점수입력 \\ 3.점수리스트 \\ 4.분석 \\ 5.종료");
			System.out.println("--------------------------------------------");
			System.out.println("선택> ");
			
			int selectNo = Integer.parseInt(sc.nextLine());
			
			if(selectNo == 1) {
				System.out.println("학생수> ");
				studentNum = sc.nextInt();
				sc.nextLine();
				if(studentNum < 5 || studentNum >10) {
					 System.out.println("5~10까지의 범위를 설정해주세요");
					 continue;
				}
				scores = new int[studentNum];
			
			}else if(selectNo ==2) {
			
				for(int i=0; i<studentNum; i++) {
				 System.out.println("scores[" + i + "] > ");
				 scores[i] = sc.nextInt();
				 sc.nextLine();
				}
			
			}else if(selectNo ==3) {
				
				for(int i=0; i<studentNum; i++) {
					System.out.println("scores[" + i + "] > " +scores[i]);
				}
			}else if(selectNo ==4) {
				int maxscore = scores[0];
				int sum = 0;
				double avg = 0;
				for(int i=0; i<scores.length; i++) {
						sum = sum + scores[i];
						avg = (double)sum/scores.length;
					if(maxscore < scores[i]){
						maxscore = scores[i];
					}
							
				}
				System.out.println("최고 점수" + maxscore);
				System.out.println("평균 점수:" + avg);	
			}else if(selectNo ==5) {
				run =false;		
			}
		}
		
		System.out.println("프로그램 종료");

	}

}

