package com.weikun.E;

public class D {
	public static void main(String[] args) {
		new D().check();
		
	}
	
	public void check(){
		int old=1;
		
		if(old>89){
			try {
				throw new MyException1(old);
			} catch (MyException1 e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
		}else if(old<18){
			try {
				throw new MyException2(old);
			} catch (MyException2 e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
		}else{
			System.out.println("你可以看了");
			
		}
		
	}
}
