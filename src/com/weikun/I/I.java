package com.weikun.I;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.weikun.A.Animal;

public class I {
	
	public static void go(String name,int ... a){
		int sum=0;
		for(int i=0;i<a.length;i++){
			sum+=a[i];
			
		}
		System.out.println(sum);
	}
	
	
	public static void main(String[] args) {
		//go("狗",1,2,3,4,5,6);
		//go(1,2,3);
		//reflectCon2();
		//reflectMethod();
		reflectArray();
	}
	private static void reflectArray(){
		try {
			
			Object o=Array.newInstance(String.class, 3);
			
			Array.set(o, 0, "A");
			Array.set(o, 1, "B");
			Array.set(o, 2, "C");
			
			System.out.println(Array.get(o, 1));
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	private static void reflectField(){
		
		String str="org.weikun.A.Animal";
		try {
			Class <?>c=Class.forName(str);
			Object o=c.newInstance();
			
			//Field fs[]=c.getFields();//非private
			
			Field name=c.getDeclaredField("name");
			name.setAccessible(true);
			name.set(o, "鱼");
			
			System.out.println(name.get(o));
			
//			Field fs[]=c.getDeclaredFields();
//			
//			for(Field f:fs){
//				System.out.println(f.getName());
//			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	private static void reflectMethod(){
		String str="org.weikun.A.Animal";
		try {
			Class <?>c=Class.forName(str);
			Object o=c.newInstance();
			
			Method m=c.getMethod("setName",String.class );
			
			m.invoke(o, "猪");
			
			Method m1=c.getMethod("getName");
			
			System.out.println(m1.invoke(o));
//			Method ms[]=c.getMethods();
//					
//			for(Method m :ms){
//				System.out.println(m.getName());
//			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	private static void reflectCon2() {//非默认构造器
		
		String str="org.weikun.A.Animal";
		try {
			
			Class <?>c=Class.forName(str);
			Constructor co=c.getConstructor(int.class,String.class);
			
			Object o=co.newInstance(100,"鹦鹉");
			
			Animal a=(Animal)o;
			System.out.println(a.getName());
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

	private static void reflectCon() {//默认构造器
		String str="org.weikun.A.Animal";
		
		try {
			Class <?> c=Class.forName(str);
			
			Object o=c.newInstance();
			Animal a=(Animal)o;
			a.setName("猫");
			
			System.out.println(a.getName());
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
