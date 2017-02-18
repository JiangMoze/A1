package com.weikun.observer;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteSubject s=new ConcreteSubject();
		s.setMsg("≥‘∑π¡À!");
		ConcreteObserver a=new ConcreteObserver(s,"A");
		s.attach(a);
		ConcreteObserver b=new ConcreteObserver(s,"B");

		s.attach(b);



		ConcreteObserver c=new ConcreteObserver(s,"C");

		s.attach(c);


		ConcreteObserver d=new ConcreteObserver(s,"D");

		s.attach(d);
		
		
		s.Notify();
	}

}
