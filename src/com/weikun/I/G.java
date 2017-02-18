package com.weikun.I;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class G {
	public static void main(String[] args) {
		Set<String> s=new HashSet<String>();
		
		s.add("A");
		s.add("B");
		s.add("C");
		s.add("D");
		
		Iterator<String> it=s.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}
}
