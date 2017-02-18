package com.weikun.nio;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class A {
	public static void main(String[] args) {
		Path p=Paths.get("c://redis.txt");
		System.out.println(p.getParent());
		System.out.println(p.getFileName());
		
		Path p1=FileSystems.getDefault().getPath(".//.//3000soft//g.sql//99");
		Path p2=FileSystems.getDefault().getPath("1.txt");
		System.out.println(p1.getFileName());
		System.out.println(p1.getNameCount());//filename的目录层数
		
		System.out.println(p1.subpath(0, 3));//[0,3)
		
		System.out.println(p1.normalize());
		
		try {
			System.out.println(p2.toRealPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(p2.resolve("360"));//合并目录
		
	}
}
