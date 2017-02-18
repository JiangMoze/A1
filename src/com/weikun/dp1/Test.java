package com.weikun.dp1;

public class Test {
	public static void main(String[] args) {
		
		BookFacadeCglib bf=new BookFacadeCglib();
		BookFacadeImpl1 o=(BookFacadeImpl1)bf.getObject(BookFacadeImpl1.class);
		o.addBook();
		
	}
}
