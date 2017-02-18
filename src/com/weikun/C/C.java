package com.weikun.C;

import com.weikun.A.A;

public  class C extends A{
	
	static String country="中国";//类属性
	static int old=100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		C c=new C();
//		c.mark();
//		System.out.println(c.old);
//		
//		System.out.println(new C().old);
		
		
		C c=new C();
		c.plan();
		
		C.plan();
		
	}
	public  void mark(){
		old=200;
	}
	public static void plan(){//类方法
		
	}
	C(){
		
	}

}
