package com.weikun.single;

public class B {
	private B(){
		
	}
	private static class B0{
		
		public static B INSTANCE=new B(); 
	}
	public static B getInstance(){
		
		return B0.INSTANCE;
	}
}
