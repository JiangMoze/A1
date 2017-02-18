package com.weikun.C;

public class Son extends Parent{
	
	{//¶¯Ì¬¿é
		
		System.out.println(4);
	}
	static{//¾²Ì¬¿é
		age=400;
		System.out.println(5);
	}
	Son(){//¹¹ÔìÆ÷ inner class
		
		System.out.println(6);
	}
	public static void main(String[] args) {
		System.out.println(new Son().age);
	}
}
class Parent{
	static int age=100;
	{//¶¯Ì¬¿é
		
		System.out.println(1);
	}
	static{//¾²Ì¬¿é
		age=700;
		System.out.println(2);
	}
	Parent(){//¹¹ÔìÆ÷ inner class
		
		System.out.println(3);
	}
}