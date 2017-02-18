package com.weikun.I;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class A {
	public static void main(String[] args) {
		iterator1();
		
		
	}
	private static void iterator2() {
		
		Vector<String> v=new Vector<String>();
		v.addElement("rose");
		v.addElement("mike");
		v.addElement("jack");
		
		Enumeration<String> e=v.elements();
		
		while( e.hasMoreElements()){
			Object o=e.nextElement();
			System.out.println(o);
			
		}
		
	}
	private static void iterator1() {
		List<String> list=new ArrayList<String>();//多态		
		list.add("MIKE");
		list.add("ROSE");
		
		Iterator<String> it=list.iterator();//单向链表
		
		while(it.hasNext()){
			
			System.out.println(it.next());
		}
		System.out.println("--------");
		
		ListIterator<String> it1=list.listIterator();	//双向链表			
				
		while(it1.hasNext()){
			Object o=it1.next();
			System.out.println(o);
		}
		
		while(it1.hasPrevious()){
			Object o=it1.previous();
			System.out.println(o);
		}
		System.out.println("--------");
		
		for(int i=0;i<list.size();i++){
			Object o=list.get(i);
			System.out.println(o);
			
		}
		for(int i=list.size()-1;i>=0;i--){
			Object o=list.get(i);
			System.out.println(o);
			
		}
		System.out.println("--------");
		
		for(Object o :list ){
			System.out.println(o);
			
		}
		System.out.println("--------");
		
		
		Object [] os=list.toArray();
		
		for(int i=0;i<os.length;i++){
			System.out.println(os[i]);
		}
	}
}

