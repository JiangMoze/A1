package com.weikun.nio;

import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.CompletionHandler;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.concurrent.Future;

public class E {
	public static void main(String[] args) {
		new E().asyRead1();
	}
	
	public void asyRead1(){
		
		try {
			Path p=Paths.get("c://1.wmv");
			AsynchronousFileChannel fc=AsynchronousFileChannel.open(p);
			
			Future fu=fc.read(ByteBuffer.allocate(1024*1024*100), 0);
			
			while(!fu.isDone()){
				System.out.println("读写中");
			}
			System.out.println("读写完毕");
//			fc.read(ByteBuffer.allocate(1024*1024*100), 0, null, new CompletionHandler<Integer, A>() {
//
//				@Override
//				public void completed(Integer result, A attachment) {
//					// TODO Auto-generated method stub
//					System.out.println("读写完毕");
//				}
//
//				@Override
//				public void failed(Throwable exc, A attachment) {
//					// TODO Auto-generated method stub
//					System.out.println("读取失败");
//				}
//				
//				
//			});
			System.out.println("end");
			fc.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			
		}
	}
	public void asyRead(){
		
		try {
			Path p=Paths.get("c://1.wmv");
			AsynchronousFileChannel fc=AsynchronousFileChannel.open(p);
			
			Future fu=fc.read(ByteBuffer.allocate(1024*1024*1000), 0);
			while(!fu.isDone()){//没读完
				
				System.out.println("ok");
			}
			fc.close();
			System.out.println(fu.get());
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			
		}
	}
	
	public void append(){//FileChancel
		try {
			Path path=Paths.get("c://redis44.txt");
			
			
			FileChannel fc=FileChannel.open(path, StandardOpenOption.APPEND);
			
			fc.write(ByteBuffer.wrap("北京".getBytes()));
			fc.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public void write(){//FileChancel
		try {
			Path path=Paths.get("c://redis44.txt");
			Files.createFile(path);
			
			FileChannel fc=FileChannel.open(path, StandardOpenOption.WRITE);
			
			fc.write(ByteBuffer.wrap("你好".getBytes()));
			fc.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public void read(){//FileChancel
		try {
			Path path=Paths.get("c://redis1.txt");
			ByteBuffer buffer=ByteBuffer.allocate(1024);
			FileChannel fc=FileChannel.open(path, StandardOpenOption.READ);
			
			fc.read(buffer,fc.size()-100);
			buffer.flip();//指针调整到开始位置
			
			Charset c=Charset.forName("utf-8");
			
			System.out.println(c.decode(buffer));
			fc.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
