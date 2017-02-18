package com.weikun.factorymethod;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICreator a=new CreatorA();
		
		a.sale().make();
		
		ICreator a1=new CreatorB();
		
		a1.sale().make();
		
	}

}
