package com.weikun.nio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;

public class C {
	public static void main(String[] args) {
		new C().readFile1();
	}
	public void writeFile(){
		
		Path p=Paths.get("c://redis55.txt");
		
		
		try {
			Files.createFile(p);
			BufferedWriter br=Files.newBufferedWriter(p,StandardCharsets.UTF_8,StandardOpenOption.WRITE);
			br.write("你好中国");
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void readFile1(){//简单读
		Path p=Paths.get("c://redis55.txt");
		try {
			byte[] buffer=Files.readAllBytes(p);
			System.out.println(new String(buffer,"utf-8"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void readFile(){
		
		
		Path p=Paths.get("c://redis55.txt");
		
		
		try {
			BufferedReader br=Files.newBufferedReader(p,StandardCharsets.UTF_8);
			String line="";
			while((line=br.readLine())!=null){
				
				System.out.println(line);
			}
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
