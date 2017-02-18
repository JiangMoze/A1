package com.weikun.I;

import java.util.Iterator;
import java.util.LinkedList;

public class B {
	public static void main(String[] args) {
		
		LinkedList <String>list=new LinkedList<String>();
		list.add("A");
		list.addFirst("B");
		list.push("G");
		
		list.addLast("C");
		
		list.offer("D");
		list.offerFirst("E");
		list.push("H");
		list.offerLast("F");
		
		
		Iterator<String> it=list.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		System.out.println("----------");
		System.out.println(list.remove());
		System.out.println(list.removeLast());
		System.out.println(list.removeFirst());
		System.out.println(list.poll());
		System.out.println(list.pollFirst());
		System.out.println(list.pollLast());
//		
		System.out.println(list.peekFirst());
		System.out.println(list.peekLast());		
//		
//		
		System.out.println(list.pop());
		System.out.println(list.pop());
	}
}
