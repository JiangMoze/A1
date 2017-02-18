package com.weikun.C;

import com.weikun.A.A;

public class B {
	static{
		System.out.println(1);
	}
	B(){
		System.out.println(3);
	}
	public static void main(String[] args) {
		B a=new B();
		
	}
	{
		System.out.println(2);
		
	}
}
