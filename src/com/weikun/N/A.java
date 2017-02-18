package com.weikun.N;

public class A implements Runnable {
	public static void main(String[] args) {
		new A().go();
	}
	public void go(){
		
		ThreadGroup a=new ThreadGroup("A��");
		ThreadGroup b=new ThreadGroup(a,"B��");
		
		Thread t=new Thread(a,this);
		
		t.start();
		
		
		Thread t2=new Thread(a,this);
		
		t2.start();
		
		Thread t1=new Thread(b,this);
		
		t1.start();
		
		Thread [] tt=new Thread[b.activeCount()];//��������һ���ж��ٸ��̵߳�����
		
		
		int count=b.enumerate(tt);
		
		for(int i=0;i<count;i++){
			System.out.println("---->"+tt[i].getName());
			
		}
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++){
			
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
		System.out.println(Thread.currentThread().getName() + 
				" finished executing.");
	}

}
