package com.weikun.C;

public class TestStatic {
	public static int count=10;//��̬������,��ʵ������ʱ�򲢲���ı侲̬���ԡ�
	public TestStatic() {
		++count;
	}
	public  int getCount() {//��̬�෽��
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
