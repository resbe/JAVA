package com.yedam.array;

public class Example07 {

	public static void main(String[] args) {
		System.out.println(args.length);
		if(args.length>0) {
			for(int i = 0; i<args.length; i ++) {
				System.out.println(args[i]);
			}
		}
	}

}
