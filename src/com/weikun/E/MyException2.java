package com.weikun.E;

public class MyException2 extends Exception {
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "你的岁数是"+this.old+"太小了！";
	}
	int old;
	public MyException2(int old){
		this.old=old;
	}
}
