package com.yedam.homework0403;

public class PortableNotebook implements Notebook, Tablet {

	
	
	@Override
	public void watchVideo() {
		System.out.println( "'문서 프로그램'을 통해 문서를 작성.");
		
	}

	@Override
	public void useApp() {
		System.out.println("'인터넷 브라우저'를 통해 인터넷을 검색.");
		
	}

	@Override
	public void writeDocumentaion() {
		System.out.println("'영상종류'를 시청.");
		
	}

	@Override
	public void searchInternet() {
		// TODO Auto-generated method stub
		
	}

}
