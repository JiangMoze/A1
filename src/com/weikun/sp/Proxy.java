package com.weikun.sp;

public class Proxy implements Subject {
	private Subject subject;
	
	public Proxy(Subject subject){
		this.subject=subject;
	}
	@Override
	public void go() {
		// TODO Auto-generated method stub
		System.out.println("��������˵go");
		this.subject.go();
		
	}

	@Override
	public void say() {
		// TODO Auto-generated method stub
		System.out.println("��������˵say");
		this.subject.say();
	}

}
