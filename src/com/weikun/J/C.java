package com.weikun.J;

public class C {
	public static void main(String[] args) {
		new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0;i<10;i++){
					System.out.println(Thread.currentThread().getName()+":"+i);
				}
			}
			
			
			
		}).start();
		new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0;i<10;i++){
					System.out.println(Thread.currentThread().getName()+":"+i);
				}
			}
			
			
			
		}).start();
	}
}
