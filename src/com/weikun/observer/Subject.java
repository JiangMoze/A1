package com.weikun.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {//��������
	
	private List<Observer> list=new ArrayList<Observer>();
	public void attach(Observer o){//��Ⱥ
		list.add(o);
	}
	public void detach(Observer o){//�Ƴ�Ⱥ
		list.remove(o);
	}
	public void Notify(){//֪ͨȺ��Ϣ
		
		for(Observer o  :list){
			o.update();
		}
	}
}
