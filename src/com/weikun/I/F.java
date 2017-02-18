package com.weikun.I;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;



public class F {
	public static void main(String[] args) {
		
		InputStream is=F.class.getClassLoader().getResourceAsStream("db.properties");
		Properties pro=new Properties();
		
		try {
			pro.load(is);
			
			Set <Entry<Object,Object>> e=pro.entrySet();
			Iterator<Entry <Object ,Object>> it=e.iterator();
			
			while(it.hasNext()){
				Entry <Object ,Object> en=it.next();
				System.out.println(en.getKey()+"="+en.getValue());
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
