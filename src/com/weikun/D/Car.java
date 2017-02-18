package com.weikun.D;

public abstract class Car {
	public abstract int getR();//得到车轮半径
	public abstract int getSu();//得到车轮转速
	public double compZs(){//计算转速
		return getR()*2*Math.PI*getSu();
	}
}
