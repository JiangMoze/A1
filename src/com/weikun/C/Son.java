package com.weikun.C;

public class Son extends Parent{
	
	{//��̬��
		
		System.out.println(4);
	}
	static{//��̬��
		age=400;
		System.out.println(5);
	}
	Son(){//������ inner class
		
		System.out.println(6);
	}
	public static void main(String[] args) {
		System.out.println(new Son().age);
	}
}
class Parent{
	static int age=100;
	{//��̬��
		
		System.out.println(1);
	}
	static{//��̬��
		age=700;
		System.out.println(2);
	}
	Parent(){//������ inner class
		
		System.out.println(3);
	}
}