package com.weikun.J;

public class D extends Thread {
	public static void main(String[] args) {
		D d=new D();
		d.setName("A");
		d.start();
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++){
			if(i==50){
				D0 d1=new D0();
				d1.setName("B");
				d1.start();
				try {
					d1.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}//sleep wait join
			}
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}


class D0 extends Thread{
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++){
			
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
	
	
}
