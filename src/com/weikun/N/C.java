package com.weikun.N;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class C {
	public static void main(String[] args) {

		ExecutorService es=Executors.newFixedThreadPool(6);


		List<Future<String>> list=new ArrayList<Future<String>>();

		try {
			for(int i=0;i<10;i++){
				Future <String > fu=es.submit(new MyCall());
				System.out.println(fu.get());
				//list.add(fu);
			}
			es.shutdown();

			es.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);
			for(Future fu1 :list){
				System.out.println(fu1.get());
				System.out.println("彻底执行完毕了！");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class MyCall implements Callable<String>{

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub

		System.out.println("执行call了");
		return Thread.currentThread().getName()+"call";
	}


}
