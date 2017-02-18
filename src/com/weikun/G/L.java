package com.weikun.G;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class L {
	public static void main(String[] args) {

		int a=0;
		int b=1;
		int c=2;
		int d=2;
		int e=2;
		int f=2;
		int g=2;
		ByteArrayOutputStream bos=new ByteArrayOutputStream();

		bos.write(a);
		bos.write(b);
		bos.write(c);
		bos.write(d);
		bos.write(e);
		bos.write(f);
		bos.write(g);
		byte[] buffer=bos.toByteArray();
		for(int i=0;i<buffer.length;i++){

			System.out.println(buffer[i]);
		}

		ByteArrayInputStream bis=new ByteArrayInputStream(buffer);
		int n=-1;


		while((n=bis.read())!=-1){
			System.out.println(n);
		}




	}
}
