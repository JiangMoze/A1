package com.weikun.single;

public class A {
	 //1先把构造器私有
	private static A a;
	
	private A(){
		
	}
	public static synchronized A getInstance(){
		
		if(a==null){
			a=new A();
			
		}
		return a;
	}
}
