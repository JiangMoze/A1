package com.weikun.E;

public class MyException1 extends Exception {
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "���������"+this.old+"̫���ˣ�";
	}
	int old;
	public MyException1(int old){
		this.old=old;
	}
}
