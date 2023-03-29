package com.yedam.reference;

public class Example01 {
	public static void main(String[] args) {
		//stack영역에 intVal가 생성되어 10이라는 데이터가 저장.
		int intVal = 10;
		
		//참조타입
		//stack영역에 array가 생성(참조: [I@182decdb)되고 다음과 같은 주소가
		//저장 되어 있다.
		int[] array = {1,2,3,4,5,6};
		int[] array2 = {1,2,3,4,5,6};
		int[] array3 = null;
		
		System.out.println(array);
		System.out.println(array2);
		System.out.println(array == array2);
		System.out.println(array3);
		
		
		
	}
}
