package com.weikun.E;

public class MyException1 extends Exception {
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "你的岁数是"+this.old+"太老了！";
	}
	int old;
	public MyException1(int old){
		this.old=old;
	}
}
