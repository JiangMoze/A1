package com.weikun.command;

public class Test {
	public static void main(String[] args) {
		Receiver r=new Receiver();
		Command c=new ConcreteCommand(r);
		Invoker i=new Invoker(c);
		i.go();	
	}
}
