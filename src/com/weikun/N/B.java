package com.weikun.N;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class B {
	public static void main(String[] args) {
		
		ExecutorService es=Executors.newCachedThreadPool();//�����������̣߳�ֱ�����ܱ��ظ����õ�
				//Executors.newSingleThreadExecutor();//ֻ��һ���̳߳�
				//Executors.newFixedThreadPool(10);//�̶��̳߳�
		
		for(int i=0;i<20;i++){
			
			es.execute(new Runnable(){

				@Override
				public void run() {
					// TODO Auto-generated method stub
					System.out.println(Thread.currentThread().getName()+"��ִ���ˣ���");
				}
				
				
				
			});
		}
		
		
		
		es.shutdown();//�̹߳ر�
		
		
		try {
			es.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);
			System.out.println("���Ѿ����׹ر�");;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
