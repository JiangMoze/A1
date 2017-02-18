package com.weikun.F;

public class B {
	public void go(){//方法的内部类
		int i=100;
		class B0{
			public void mo(){
				System.out.println("ok");
			}
		}
		new B0().mo();
		
	}

}
