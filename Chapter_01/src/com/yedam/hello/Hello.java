package com.yedam.hello;

public class Hello {

	//문제1)
	public static void main(String[] args) {
		int lvar1 = 37;
		int lvar2 = 91;
	System.out.printf("변수명 1: %d", lvar1);
	System.out.printf("변수명 2: %d", lvar2);
		
	//문제2)
		int result1 = lvar1 +lvar2;
		int result2 = lvar2 - lvar1;
		int result3 = lvar1 * lvar2;
		double result4 = (double) lvar2/lvar1;
	System.out.println(result1);
	System.out.println(result2);
	System.out.println(result3);
	System.out.println(result4);
	
	//문제3
	
	short var1 = 128;
	String var2 = "B";
	int var3 = 44032;
	long var4 = 100000000000L;
	double var5 = 43.93106;
	double var6 = 301.3;
	
	System.out.printf("%d,byte",var1);
	System.out.printf("\n%s,String",var2);
	System.out.printf("\n%5d,int",var3);
	System.out.printf("\n%12d,long",var4);
	System.out.printf("\n%-10.6f,double",var5);
	System.out.printf("\n%-10.2f,double",var6);
	
	//문제 4
	byte a = 35;
	byte b = 25;
	int c = 463;
	long d = 1000L;
	
	long result5  =  a + c + d;
	System.out.println(\nresult5);
	 
	
	
	}
}