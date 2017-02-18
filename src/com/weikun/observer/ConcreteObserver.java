package com.weikun.observer;

public class ConcreteObserver extends Observer {
	private String name;
	private ConcreteSubject subject;
	public ConcreteObserver(ConcreteSubject subject,String name){
		this.subject=subject;
		this.name=name;
		
		
		
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		String msg=subject.getMsg();
		System.out.println("作为"+name+"已经看到了:"+msg);
		
	}

}
