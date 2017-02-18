package com.weikun.nio;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class B {
	public static void main(String[] args) {
		new B().getAttribute();
	}
	public void move(){
		Path source=Paths.get("c://3271全家福.rar");
		Path target=Paths.get("f://327全家福.rar");
		try {
			Files.move(source, target,StandardCopyOption.REPLACE_EXISTING );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void getAttribute(){
		Path p=Paths.get("c://8月.png");
		try {
			DosFileAttributeView dos=Files.getFileAttributeView(p,DosFileAttributeView.class);
			DosFileAttributes da=dos.readAttributes();
			System.out.println(da.isReadOnly());
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public void setAttribute(){
		Path p=Paths.get("c://8月.png");
		try {
			DosFileAttributeView dos=Files.getFileAttributeView(p,DosFileAttributeView.class);
			dos.setReadOnly(true);
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	
	
	public void copy(){
		
		Path source=Paths.get("c://327全家福.rar");
		Path target=Paths.get("d://327全家福.rar");
		try {
			Files.copy(source, target,StandardCopyOption.REPLACE_EXISTING );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void walkFiles(){//遍历含子目录的文件
		Path dir=Paths.get("c://doc");
		try {
			Files.walkFileTree(dir, new SimpleFileVisitor<Path>(){

				
				@Override
				public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
					// TODO Auto-generated method stub
					if(file.toString().endsWith(".txt")){
						System.out.println(file.getFileName());
					}
					
					return FileVisitResult.CONTINUE;
				}
				
			});
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void findFiels(){//在指定的目录下找到某个特定后缀的文件s
		
		Path dir=Paths.get("c://");
		
		try {
			DirectoryStream<Path> ps=Files.newDirectoryStream(dir, "*.txt");
			for(Path p :ps){
				System.out.println(p.getFileName());
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
