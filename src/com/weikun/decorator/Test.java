package com.weikun.decorator;

public class Test {
	public static void main(String[] args) {
		ChineseGirl g=new ChineseGirl();
		System.out.println(g.getDesc());
		
		
		Coding c=new Coding(g);
		
		System.out.println(c.getDesc());
		
		
		MathGirl m=new MathGirl(c);
		System.out.println(m.getDesc());
	}
}
