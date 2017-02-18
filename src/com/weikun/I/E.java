package com.weikun.I;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class E {
	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<String,Integer>();		
		map.put("A", 100);
		map.put("B", 200);
		map.put("C", 300);
		map.put("D", 400);
		map.put("E", 500);
		List<Entry<String, Integer>> list=new ArrayList<Entry<String, Integer>>(map.entrySet());
		
		
		Collections.sort(list, new Comparator<Entry<String, Integer>>(){

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				//return o1.getValue()-o2.getValue();
				return o1.getKey().compareTo(o2.getKey());
			}
			
		});
		
		for(Entry<String,Integer> e:list){
			System.out.println(e.getKey());
		}
		
//		Collection<Integer> c=map.values();
//		Iterator<Integer> it=c.iterator();
//		while(it.hasNext()){
//			System.out.println(it.next());
//		}
		
		
		
		
	}
}
