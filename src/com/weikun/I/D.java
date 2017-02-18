package com.weikun.I;

import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class D {
	public static void main(String[] args) {
		
		Hashtable <String,Integer>t=new Hashtable<String,Integer>();
		t.put("Эѕ", 2);
		t.put("ед", 4);
		//t.put(null, 8);
		
		Enumeration<Integer> en=t.elements();
		
		while(en.hasMoreElements()){
			System.out.println(en.nextElement());
		}
		
		HashMap<String ,Integer> map=new HashMap<String ,Integer>();
		map.put("A", 100);
		map.put("B", 200);
		
		map.put("C", 300);
		map.put("D", 400);
		map.put(null, null);
		Collection<Integer> cs=map.values();
		
		Iterator<Integer> it=cs.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		Set<String> keys=map.keySet();
		
		Iterator<String> it1=keys.iterator();
		
		while(it1.hasNext()){
			String key=it1.next();
			System.out.println(key+":"+map.get(key));
		}
		
		
		Set<Entry<String,Integer>> s=map.entrySet();
		
		Iterator <Entry<String,Integer>>it2=s.iterator();
		while(it2.hasNext()){
			Entry<String,Integer> es=it2.next();
			
			System.out.println(es.getValue());
		}
		
		
	}
}
