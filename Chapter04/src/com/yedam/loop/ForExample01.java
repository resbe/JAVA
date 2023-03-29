package com.yedam.loop;

import java.util.Scanner;

public class ForExample01 {

	public static void main(String[] args) {
		int sum = 0;
		sum = sum +1;
		sum = sum +2;
		sum = sum +3;
		sum = sum +4;
		sum = sum +5;
		//1~5까지의 합
		System.out.println(sum);
		
		for(int i= 1; i<=5; i++) {
			sum = sum +1;
		}
		
		//1~100사이의 짝수,홀수 구하기
		//짝수 => 2 4 6 8 10 12......
		for(int i=1; i<=100; i++) {
			if(i%2 == 0) {
				System.out.println(i +"는 짝수");
			}else {
				System.out.println(i +"는 홀수");
			}
		}
		
		//입력한 숫자에 대한 구구단 출력
		
		//구구단만 출력 -> 입력 구구단 출력
		
		//2x1 = x 
		for(int i=1; i<=9; i++) {
			System.out.println("2 X" + i+"=" + (2*i));

		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("구구단 입력>");
		int gugu = sc.nextInt();
		
		for(int i=1; i<=9; i ++) {
			System.out.println(gugu + " x " +1 + " = " + (gugu*i));;
		}
		
		//입력한 값에 대한 총합, 평균, 최대값, 데이터 받을 개수 스캐너 활용해서 데이터 입력
		//총합 : 입력 받자 마자 총합이라는 변수에 누적 합계
		//평균 : 총합 / 데이터 입력 개수
		//최대값 : 입력한 데이터와 기존에 들어 있는 데이터 비교 더 큰거
		//최소값 : 입력한 데이터와 기존에 들어 있는 데이터 비교 더 작은거
		
		int total = 0;
		double avg = 0;
		int max = 0;
		int min = 0;
		
		//데이터 입력
		System.out.println("데이터 입력 개수>");
		
		//입력할 데이터 갯수 입력 받음
		int count = sc.nextInt();
		
		for(int i=0; i<count; i++) {
		//	System.out.println("데이터 입력>");
			int data = sc.nextInt();
			//총합 : total
			//total = total + data;
			total += data;
			
			//최대값, 최소값 초기값 설정
			if(i ==0 ) {
				max = data;
				min = data;
			} else {
				if(max <data) {
					max = data;
				}
				if(min > data) {
					min = data;
				}
			}
		}
		
		//반복문 결과 출력
		System.out.println("총합 :" + total);
		System.out.println("평균 : " + (total/(double)count));
		System.out.println("최대값 :" + max + " 최소값 " +min);
		
		//up&down
		
		//임의 랜덤값 (1~100)사이의 하나의 정수를 추출해서
		//5번 기회안에 해당하는 랜덤 값을 맞추는 프로그램 구현.
		
		//예시) 랜덤 값 50
		// 입력 값 : 30
		// => up
		// 입력 값 : 70
		// => down
		//정답 일 경우
		//=> 정답, 몇번의 기회만에 맞추셨습니다.
		// 정답을 맞추지 못할 경우
		//실패 하였습니다.
		
		int randomNo = (int)(Math.random()*100)+1;
		
		Scanner randomsc =new Scanner(System.in);
		
		
		
		
		for(int j=1;j <= 5;j++) {
			System.out.println("데이터 입력");
			int countNo = randomsc.nextInt();
			if (randomNo > countNo) {
				System.out.println("up");
				
			}else if(randomNo <countNo) {
				System.out.println("down");
			}else{
				System.out.println("정답,"+(j)+"만에 맞추셨습니다");
				break;
				}
			if(j == 4) {
				System.out.println("실패하였습니다");
			}
	}
				
			
			
		
	}

}
