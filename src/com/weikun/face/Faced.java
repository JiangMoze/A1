package com.weikun.face;

public class Faced {//门面设计模式
	public void test(){
		ModelA a=new ModelA();
		a.test();
		ModelB b=new ModelB();
		b.test();
	}

}
