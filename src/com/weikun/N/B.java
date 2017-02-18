package com.weikun.N;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class B {
	public static void main(String[] args) {
		
		ExecutorService es=Executors.newCachedThreadPool();//开辟任意多个线程，直到有能被重复利用的
				//Executors.newSingleThreadExecutor();//只有一个线程池
				//Executors.newFixedThreadPool(10);//固定线程池
		
		for(int i=0;i<20;i++){
			
			es.execute(new Runnable(){

				@Override
				public void run() {
					// TODO Auto-generated method stub
					System.out.println(Thread.currentThread().getName()+"被执行了！！");
				}
				
				
				
			});
		}
		
		
		
		es.shutdown();//线程关闭
		
		
		try {
			es.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);
			System.out.println("池已经彻底关闭");;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
