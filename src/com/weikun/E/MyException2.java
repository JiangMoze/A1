package com.weikun.E;

public class MyException2 extends Exception {
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "���������"+this.old+"̫С�ˣ�";
	}
	int old;
	public MyException2(int old){
		this.old=old;
	}
}
