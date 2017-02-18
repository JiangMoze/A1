package com.weikun.G;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;

public class G {
	public static void main(String[] args) {
		//read();
		//write();
		copy();
	}
	public static void copy(){
		
		try(InputStream fis=new FileInputStream("c://1.wmv");
				OutputStream fos=new FileOutputStream("D://1.wmv")) {
			long start=System.currentTimeMillis();
			byte[] buffer=new byte[1024*1024*10];
			int n=-1;
			while( (n=fis.read(buffer))!=-1){
				fos.write(buffer, 0, n);
			}
			
			
			long end=System.currentTimeMillis();
			
			SimpleDateFormat sdf=new SimpleDateFormat("mm:ss");
			System.out.println(sdf.format(end-start));
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	private static void write(){
		 try (FileOutputStream fos=new FileOutputStream("c://33.txt")){
			 fos.write("哈尔滨---沈阳".getBytes());
			 System.out.println("ok");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	private static void read() {
		//		double d=5.8115;
//		System.out.printf("%-2.0f",d);
		
		try(
				FileInputStream fis=new FileInputStream("c://笔记.txt")
		){
			
			byte[] buffer=new byte[1024];//每次读取的内容
			int n=-1;
			while( (n=fis.read(buffer))!=-1){//还有内容 可以继续读
				System.out.print(new String(buffer));
			}
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
//		FileInputStream fis=null;
//		try {
//			fis=new FileInputStream("");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally{
//			try {
//				fis.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
	}
}
