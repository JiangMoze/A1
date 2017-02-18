package com.weikun.J;

public class B implements Runnable {
	public static void main(String[] args) {
		B b=new B();
		
		Thread t=new Thread(b);
		t.setName("A");
		t.start();
		
		
		B b1=new B();
		
		Thread t1=new Thread(b1);
		t1.setName("B");
		t1.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}

}
