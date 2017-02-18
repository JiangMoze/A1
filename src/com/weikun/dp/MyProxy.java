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
			System.out.println("被拦截的方法:" + method.getName()); 
			System.out.println("预处理.");
			return method.invoke(obj, args);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}finally{
			System.out.println("善后处理.");
		}
		// TODO Auto-generated method stub
		return null;
		
		
		
	}

}
