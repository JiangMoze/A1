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
//		//̰��ģʽ������:������ʾ��(*)��һ��ƥ����ȥ�����Ը��ַ���ǰ�����е����ַ�������ƥ�䵽��ֱ�������ո�
//		System.out.println(str.replaceFirst("\\w{2,3}", "��"));//��,Java
//		//��ǿģʽ������������ʾ��(*)�ᾡ��ƥ�������ַ�����ƥ��0���ַ���
//		System.out.println(str.replaceFirst("\\w{2,3}?", "��"));//��Hello,Java
	}
}	
