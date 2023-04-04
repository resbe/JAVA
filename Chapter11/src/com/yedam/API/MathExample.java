package com.yedam.API;

import java.util.Random;

public class MathExample {
	public static void main(String[] args) {

	int v1 = Math.abs(-5);
	System.out.println(v1);
	double v2 = Math.abs(-3.1);
	System.out.println(v2);
	
	double v3 = Math.ceil(5.3);
	System.out.println(v3);
	double v4 = Math.ceil(-5.3);
	System.out.println(v4);
	
	double v5 = Math.floor(5.3);
	System.out.println(v5);
	double v6 = Math.floor(-5.3);
	System.out.println(v6);
	
	int v7 = Math.max(5,  9);
	System.out.println(v7);
	
	int v8 = Math.min(5, 9);
	System.out.println(v8);
	
	double v9 = Math.random();
	System.out.println(v9);
	
	double v10 = Math.rint(8.5);
	System.out.println(v10);
	
	double v11 = Math.rint(7.5);
	System.out.println(v11);
	
	//rint = 정수자리가 짝수일때 내림, 정수자리가 홀수일때 올림
	
	double v12 = Math.rint(3.5);
	System.out.println(v12);
	
	double v13 = Math.round(5.4);
	System.out.println(v13);
	
	//Random()
	
	Random random = new Random(System.currentTimeMillis());
	System.out.println(random.nextDouble());
	
	
	
	
	
	}	
}
