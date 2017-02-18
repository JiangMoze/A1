package com.weikun.G;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class I {
	
	public static void main(String[] args) {
		new I().copy();
		
		
	}
	public void copy(){
		try(BufferedInputStream bis=new BufferedInputStream(new FileInputStream("c://1.wmv"),1024*1024);
				BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("d://2.wmv"))) {
			byte[] buffer	=new byte[1024*1024];
			int n=-1;
			while((n=bis.read(buffer))!=-1){
				bos.write(buffer, 0, n);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
