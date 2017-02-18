package com.weikun.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {//抽象主题
	
	private List<Observer> list=new ArrayList<Observer>();
	public void attach(Observer o){//进群
		list.add(o);
	}
	public void detach(Observer o){//移出群
		list.remove(o);
	}
	public void Notify(){//通知群消息
		
		for(Observer o  :list){
			o.update();
		}
	}
}
