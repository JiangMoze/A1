package com.weikun.G;

import java.io.File;
import java.io.RandomAccessFile;

public class K {
	public static void main(String[] args) {
		new K().merge();
	}
	public void merge(){//mix combine
		File file=new File("c://1.wmv");
		try (RandomAccessFile r=new RandomAccessFile("c://2.wmv","r");
				RandomAccessFile w=new RandomAccessFile(file,"rw");){
			w.seek(file.length());//
			
			int n=-1;
			byte[] buffer=new byte[1024];
			
			while((n=r.read(buffer))!=-1){
				w.write(buffer, 0, n);
			}
			System.out.println("ºÏ²¢Íê±Ï");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public void copy(){
		
		try (RandomAccessFile r=new RandomAccessFile("c://1.wmv","r");
				RandomAccessFile w=new RandomAccessFile("d://2.wmv","rw");
				){
			int n=-1;
			byte[] buffer=new byte[1024];
			while((n=r.read(buffer))!=-1){
				w.write(buffer, 0, n);
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
