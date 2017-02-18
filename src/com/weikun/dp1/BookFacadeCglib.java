package com.weikun.dp1;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class BookFacadeCglib implements MethodInterceptor {
	
	
	
	public Object getObject(Class obj){
		
				
		Enhancer en=new Enhancer();//增强剂
		en.setSuperclass(obj);
		en.setCallback(this);
		
		return en.create();
		
		
	}
	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
		// TODO Auto-generated method stub
		
		System.out.println("前");
		arg3.invokeSuper(arg0, arg2);
		System.out.println("后");
		
		return null;
	}

}
