package com.weikun.G;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
public class J {
	public static void main(String[] args) {
		in3();
	}	
	public static void in3(){
		try(	
				BufferedReader r=new BufferedReader(new InputStreamReader(System.in))) {
			boolean flag=true;
			while(flag){
				String result=r.readLine();
				if(result.trim().toLowerCase().equals("q")){
					flag=false;
				}else{
					System.out.println(result);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public static void in2(){
		InputStream is=System.in;
		byte[] buffer=new byte[1024];
		boolean flag=true;
		while(flag){
			try {
				is.read(buffer);
				String result=new String(buffer);
				if(result.trim().toLowerCase().equals("q")){
					flag=false;
				}else{
					System.out.println(result);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			is.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static void in1(){
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		while(flag){
			String result=sc.nextLine();			
			if(result.toLowerCase().equals("q")){
				flag=false;
			}else{
				System.out.println(result);
			}
		}
		sc.close();
	}
}
