package com.weikun.D;

public abstract class Car {
	public abstract int getR();//�õ����ְ뾶
	public abstract int getSu();//�õ�����ת��
	public double compZs(){//����ת��
		return getR()*2*Math.PI*getSu();
	}
}
