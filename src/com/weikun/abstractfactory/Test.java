package com.weikun.abstractfactory;

public class Test {
	public static void main(String[] args) {
		ConcreateFactory cf=new ConcreateFactory();
		ProductA a=cf.makeA();
		
		
		ProductB b=cf.makeB();
	}
}
