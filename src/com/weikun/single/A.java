package com.weikun.single;

public class A {
	 //1�Ȱѹ�����˽��
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
