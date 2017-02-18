package com.weikun.C;

public class TestStatic {
	public static int count=10;//静态类属性,在实例化的时候并不会改变静态属性。
	public TestStatic() {
		++count;
	}
	public  int getCount() {//静态类方法
		return count;	
	}
	public static void main(String args[]) {
		TestStatic ts1=new TestStatic();
		System.out.println(ts1.count);//11

		TestStatic ts2=new TestStatic();
		System.out.println(ts2.count);//12
		//System.out.println(TestStatic.count);//12
//
		System.out.println(ts2.getCount());//12
		TestStatic ts3=new TestStatic();//
		System.out.println(ts3.count);//13
                 
	} 
}
