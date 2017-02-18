package com.weikun.G;

import java.io.File;
import java.io.IOException;

public class N {
	public static void main(String[] args) {
//		File file=new File("c://1.txt");
//		File file1=new File("src/1.txt");
//		File file2=new File("src","1.txt");
//		System.out.println(file1.length());
//		File file3=new File("c://weikun");
//		
//			file3.mkdir();
		new N().getPath("c://");
	}
	public void getPath(String s){
		File file=new File(s);
		if(file.isDirectory()){
			File fs[]=file.listFiles();//把当前目录下的所有文件，目录
			for(int i=0;i<fs.length;i++){
				if(fs[i].isDirectory()){
					this.getPath(fs[i].getAbsolutePath());
				}else{
					System.out.println(fs[i].getAbsolutePath());
				}
			}
			
		}
		
		
	}
}
