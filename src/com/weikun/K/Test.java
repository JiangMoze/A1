package com.weikun.K;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a=new Account("123456",800);
		
		DrawThread t=new DrawThread("¼×",800,a);
		
		DrawThread t1=new DrawThread("ÒÒ",800,a);
		t.start();
		t1.start();
	}

}
