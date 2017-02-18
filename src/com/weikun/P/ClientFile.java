package com.weikun.P;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ClientFile {
	public static void main(String[] args) {
		Socket client=null;
		
		DataInputStream dis=null;
		DataOutputStream dos=null;
		try {
			
			client=new Socket("127.0.0.1",8228);
			dis=new DataInputStream(client.getInputStream());
			
			String filename=dis.readUTF();
			File file=new File("d://"+filename);
			
			dos=new DataOutputStream(new FileOutputStream(file));
			int n=-1;
			byte[] buffer=new byte[1024];
			while( (n=dis.read(buffer)) !=-1){
				dos.write(buffer, 0, n);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try {
				dos.flush();
				dos.close();
				dis.close();
				client.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
