package com.weikun.J;

public class A extends Thread{
	public static void main(String[] args) {
		A a=new A();
		a.setName("A");
		
		//a.setPriority(Thread.NORM_PRIORITY+2);
		
		a.start();
		
		
		A a1=new A();
		a1.setName("B");
		
		//a1.setPriority(Thread.NORM_PRIORITY+3);
		a1.start();
		
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<1000;i++){
			//if(i==5){
				try {
					Thread.currentThread().yield();
					Thread.currentThread().sleep(10);
					
					
//					
				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			//}
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}
