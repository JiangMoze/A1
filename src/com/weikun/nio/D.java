package com.weikun.nio;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

public class D {
	public static void main(String[] args) {
		watchDel();
		watchModify();
	}
	private static void watchModify() {
		
		try {
			
			WatchService ws1=FileSystems.getDefault().newWatchService();			
			Path p1=Paths.get("c://");			
			p1.register(ws1, StandardWatchEventKinds.ENTRY_MODIFY);
			
			boolean flag=false;
			while(!flag){				
				WatchKey k1=ws1.take();
				
				for(WatchEvent we  :k1.pollEvents() ){
					if(we.kind()==StandardWatchEventKinds.ENTRY_MODIFY){
						System.out.println("发生改变了！");
					}
					
				}
				
				k1.reset();
				flag=true;
			}
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static void watchDel() {
		try {
			
			WatchService ws1=FileSystems.getDefault().newWatchService();			
			Path p1=Paths.get("c://");			
			p1.register(ws1, StandardWatchEventKinds.ENTRY_DELETE);
			
			boolean flag=false;
			while(!flag){				
				WatchKey k1=ws1.take();
				
				for(WatchEvent we  :k1.pollEvents() ){
					if(we.kind()==StandardWatchEventKinds.ENTRY_DELETE){
						System.out.println("发生删除了！");
					}
					
				}
				k1.reset();
				flag=true;
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
