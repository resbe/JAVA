package com.yedam.loop;

public class ForExample02 {

	public static void main(String[] args) {
		//중첩 반복문
		//2단 ~ 9단 중첩
		for(int i = 0; i<9; i++) {
			for(int j=0; j<=9; j++){
				System.out.println(i + " * " + j + " = " +(j*i));
			}
		}
		//공포의 별찍기
		//*****
		//*****
		//*****
		//*****
		//*****
		
		for (int i =1 ; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//*			1줄 1개
		//**		2줄 2개
		//***		3줄 3게
		//****
		//*****
		
		for(int i=1; i<=5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//***** 
		//****
		//***
		//**
		//*
		for(int i=1; i<=5; i++) {
			for(int j=5; j>i-1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//for(int i =5; i>=0; i--){
		//	for(int j=1; j>0; j--){
		//		System.out.print("*");
		//  }
		//  System.out.println();
		
		
	}

}
