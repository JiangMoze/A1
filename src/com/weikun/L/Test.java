package com.weikun.L;

import java.util.Timer;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Timer timer=new Timer();
		int imgCount=20;
		MyTask t=new MyTask(imgCount,timer);
		System.out.println("��ʼ������Ϸ��");
		timer.schedule(t, 0, 1000);
		
		
	}

}
