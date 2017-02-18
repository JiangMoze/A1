package com.weikun.dp;

import java.lang.reflect.Proxy;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IAnimal c=new Cat();
		MyProxy my=new MyProxy(c);
		
		Object o=Proxy.newProxyInstance(
				c.getClass().getClassLoader(), 
				c.getClass().getInterfaces(), 
				my);
		
		if(o instanceof IAnimal){
			IAnimal a=(IAnimal)o;
			a.go();
			a.say();
		}
		
	}

}
