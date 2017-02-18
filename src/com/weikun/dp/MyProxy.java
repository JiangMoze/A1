package com.weikun.dp;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyProxy implements InvocationHandler {
	private Object obj;
	public MyProxy(Object obj){
		this.obj=obj;
	}
	
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		try {
			System.out.println("�����صķ���:" + method.getName()); 
			System.out.println("Ԥ����.");
			return method.invoke(obj, args);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}finally{
			System.out.println("�ƺ���.");
		}
		// TODO Auto-generated method stub
		return null;
		
		
		
	}

}
