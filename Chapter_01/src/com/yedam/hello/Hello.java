package com.yedam.hello;

public class Hello {

	//����1)
	public static void main(String[] args) {
		int lvar1 = 37;
		int lvar2 = 91;
	System.out.printf("������ 1: %d", lvar1);
	System.out.printf("������ 2: %d", lvar2);
		
	//����2)
		int result1 = lvar1 +lvar2;
		int result2 = lvar2 - lvar1;
		int result3 = lvar1 * lvar2;
		double result4 = (double) lvar2/lvar1;
	System.out.println(result1);
	System.out.println(result2);
	System.out.println(result3);
	System.out.println(result4);
	
	//����3)
	
	short var1 = 128;
	String var2 = "B";
	int var3 = 44032;
	long var4 = 100000000000L;
	double var5 = 43.93106;
	double var6 = 301.3;
	
	System.out.printf("%d,byte\n",var1);
	System.out.printf("%s,String\n",var2);
	System.out.printf("%5d,int\n",var3);
	System.out.printf("%12d,long\n",var4);
	System.out.printf("%-10.6f,double\n",var5);
	System.out.printf("%-10.2f,double\n",var6);
	
	//����4)
	byte a = 35;
	byte b = 25;
	int c = 463;
	long d = 1000L;
	
	long result5  =  a + c + d;
	System.out.println(result5);
	
	int result6 = a + b + c;
	System.out.println(result6);
	
	double e = 45.31;
	double result7 = c + d + e;
	System.out.println(result7);	
	
	//����5)
	
	int intValue1 = 24;
	int intValue2 = 3;
	int intValue3 = 8;
	int intValue4 = 10;
	char charValue = 'A';
	String strValue = "����";
	
	
	String result8 = "" + charValue + (intValue1 + intValue2) + intValue3 + (String) strValue + (double) intValue4 ; 
	System.out.println(result8);
	}
}