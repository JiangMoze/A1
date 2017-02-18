package com.weikun.O;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {
	public static void main(String[] args) {
		Socket client=null;
		PrintWriter out=null;
		Scanner sc=null;
		try {
			client=new Socket("127.0.0.1",9081);//localhost
			out=new PrintWriter(client.getOutputStream(),true);
			sc=new Scanner(System.in);
			while(sc.hasNext()){
				String line=sc.nextLine();
				
				out.println(line);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			
			try {
				client.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sc.close();
		}
				
	}
}
