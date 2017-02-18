package com.weikun.E;

public class C extends C0 {
	public static void main(String[] args) {
		new C().go();
	}
	public void go(){
		int i=100;
		if(i==100){
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			
		}
	}
	@Override
	public void mark () throws Exception,RuntimeException{
		
	}
	
}
class C0{
	public void mark () throws Exception{
		
	}
}
