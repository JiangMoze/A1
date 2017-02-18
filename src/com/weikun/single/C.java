package com.weikun.single;

public class C {
	private volatile static C a;
	
	private C(){
		
	}
	public static  C getInstance(){
		
		if(a==null){
			synchronized (C.class) {
				if(a==null){
					a=new C();
				}
				
			}
			
			
		}
		return a;
	}
}
