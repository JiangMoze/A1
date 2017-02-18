package com.weikun.L;

import java.util.Timer;
import java.util.TimerTask;

public class MyTask extends TimerTask {
	private int imgCur=0;//游戏默认加载当前图片序号
	private int imgCount=0;//游戏图片的总个数
	private Timer timer;//计数器
	public MyTask(){};
	public MyTask(int imgCount, Timer timer) {
		super();
		
		this.imgCount = imgCount;
		this.timer = timer;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(++imgCur<=imgCount){//证明还需要继续加载
			System.out.print("你现在加载的是第"+imgCur+"张图片！\n");
			
			
		}else{
			timer.cancel();//关闭计数器
			System.out.print("进入游戏！");
		}
	}

}
