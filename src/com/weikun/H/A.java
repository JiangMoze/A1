package com.weikun.H;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A {
	public static void main(String[] args) {
		//98 98.01 0.11 0.8981
		System.out.println(Pattern.matches("^[0-9]+(\\.[0-9]{2,3})?$", "0.898"));
		
		Pattern p=Pattern.compile("^[0-9]+(\\.[0-9]{2,3})?$");
		Matcher m=p.matcher("0.898");
		
		System.out.println(m.matches());
		
//		String str="Hello,Java";
//		//贪婪模式的正则:数量表示符(*)会一种匹配下去，所以该字符串前面所有单词字符都被它匹配到，直到遇到空格
//		System.out.println(str.replaceFirst("\\w{2,3}", "■"));//■,Java
//		//勉强模式的正则：数量表示符(*)会尽量匹配最少字符，即匹配0个字符。
//		System.out.println(str.replaceFirst("\\w{2,3}?", "■"));//■Hello,Java
	}
}	
