package com.weikun.P;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerFile {//发送文件
	public static void main(String[] args) {
		
		Socket client=null;
		ServerSocket server=null;
		DataInputStream dis=null;
		DataOutputStream dos=null;
		try {
			server=new ServerSocket(8228);
			File file=new File("c://8月.png");
			dis=new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
			
			client=server.accept();
			
			dos=new DataOutputStream(client.getOutputStream());
			//由于可能会有中文，所以先写文件名
			dos.writeUTF(file.getName());
			dos.flush();
			
			int n=-1;
			byte[] buffer=new byte[1024];
			while( (n=dis.read(buffer)) !=-1){
				
				dos.write(buffer, 0, n);
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				dos.flush();
				dos.close();
				dis.close();
				client.close();
				server.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
