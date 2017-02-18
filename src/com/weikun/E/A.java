package com.weikun.E;

import java.util.Date;

public class A {
	public static void main(String[] args) {
		//System.out.println(args[0]);
		//System.out.println(args[1]);
		try {
			Date d=null;			
			System.out.println(d.getDate());			
			
		}catch (NullPointerException e) {
			// TODO: handle exception
			
			System.out.println(e.getMessage());
		}catch (Exception e) {
			// TODO: handle exception
			
			e.printStackTrace();
		}finally{
			
			System.out.println("ok");
		}
		
	}
}
