package com.weikun.sp;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject s=new ConcreateSubject();
		Proxy p=new Proxy(s);
		p.go();
		p.say();
		
		
	}

}
