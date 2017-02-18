/*
	匿名内部类的多种用法
  event
*/
package com.weikun.F;
public  class MyButton {
	public static void main(String [] args){					
		OnClickListener my1=new OnClickListener(){
				public void OnClick(){
				 	System.out.println("对象匿名内部类！");
				}
			
			
		};
		
		my1.OnClick();
		
		//形参匿名内部类
		MyButton my=new MyButton();
		my.setOnClickListener(new OnClickListener(){
				public void OnClick(){
				 	System.out.println("形参匿名内部类！");
				}
		});
		//返回值匿名内部类
		OnClickListener t=my.go();
		t.OnClick();//执行该返回值的匿名内部类
	}	
	
	public void  setOnClickListener(OnClickListener l){
		l.OnClick();//激活匿名内部类的该方法			
	}
	public OnClickListener go(){
		return new OnClickListener(){
			public void OnClick(){				
				System.out.println("返回值匿名内部类！");
			}			
		};
	}	
}
interface OnClickListener{	
	void OnClick();
}



