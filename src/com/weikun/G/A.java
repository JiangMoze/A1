package com.weikun.G;
import java.text.SimpleDateFormat;
import java.util.*;
public class A {
	public static void main(String[] args) {
//		long l=System.currentTimeMillis();
//		System.out.println(l);
//		Date d=new Date();
//		//年--月--日 小时 ：分钟：秒
//		System.out.println(d.getDay());
//		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss D W z");
//		sdf.setTimeZone(TimeZone.getTimeZone("GMT+8"));
//		System.out.println(sdf.format(d));
//		System.out.println(sdf.format(l));
//		
		Calendar c=Calendar.getInstance(TimeZone.getTimeZone("GMT+8"));
		System.out.println(c.get(Calendar.YEAR)+"---"+
		(c.get(Calendar.MONTH)+1)+"--"+c.get(Calendar.DAY_OF_MONTH));
		
		
		
	}
}
