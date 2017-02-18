package com.weikun.G;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class H {
	public static void main(String[] args) {
		new H().copy();
	}
	public static void copy(){
		try (Reader r=new FileReader("c://33.txt");
				Writer w=new FileWriter("d://33.txt")){
			
			char[] buffer=new char[1024];
			int n=-1;
			while( (n=r.read(buffer))!=-1){
				
				w.write(buffer, 0, n);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public static void write(){
		try (Writer w=new FileWriter("c://33.txt",true)){			
			w.write("ÄãºÃ£¬¡£ÈÕ±¾");		
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	public static void read(){
		try (Reader r=new FileReader("c://mysql.txt")){
			
			char [] buffer=new char[1024];//1.1k
			
			int n=-1;
			while( (n=r.read(buffer))!=-1 ){
			
				System.out.println(new String(buffer));
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
	}
}
