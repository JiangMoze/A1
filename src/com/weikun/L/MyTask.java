package com.weikun.L;

import java.util.Timer;
import java.util.TimerTask;

public class MyTask extends TimerTask {
	private int imgCur=0;//��ϷĬ�ϼ��ص�ǰͼƬ���
	private int imgCount=0;//��ϷͼƬ���ܸ���
	private Timer timer;//������
	public MyTask(){};
	public MyTask(int imgCount, Timer timer) {
		super();
		
		this.imgCount = imgCount;
		this.timer = timer;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(++imgCur<=imgCount){//֤������Ҫ��������
			System.out.print("�����ڼ��ص��ǵ�"+imgCur+"��ͼƬ��\n");
			
			
		}else{
			timer.cancel();//�رռ�����
			System.out.print("������Ϸ��");
		}
	}

}
