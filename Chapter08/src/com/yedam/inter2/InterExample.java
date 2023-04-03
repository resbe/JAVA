package com.yedam.inter2;

public class InterExample {

	public static void main(String[] args) {
		InterFaceC ic = new ImplemetnsC();
		ic.methodA();
		ic.methodB();
		ic.methodC();
		
		InterFaceB bc = new ImplemetnsC();
		bc.methodB();
		
		InterFaceA ac = new ImplemetnsC();
		ac.methodA();

	}

}
