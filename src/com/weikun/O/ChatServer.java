package com.weikun.O;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
	public static void main(String[] args) {
		ServerSocket server=null;
		Socket client=null;
		BufferedReader br=null;
		System.out.println("服务器启动！");
		try {
			server=new ServerSocket(9081);
			
			
			client=server.accept();
			
			br=new BufferedReader(new InputStreamReader(client.getInputStream()));
		
			while(true){
				String line=br.readLine();
				if(line.trim().toLowerCase().equals("q")){
					System.out.println("88!");
					break;
				}else{
					System.out.println("客户端说："+line);
				}
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				br.close();
				client.close();
				server.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
	}
}
