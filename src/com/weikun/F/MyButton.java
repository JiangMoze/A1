/*
	�����ڲ���Ķ����÷�
  event
*/
package com.weikun.F;
public  class MyButton {
	public static void main(String [] args){					
		OnClickListener my1=new OnClickListener(){
				public void OnClick(){
				 	System.out.println("���������ڲ��࣡");
				}
			
			
		};
		
		my1.OnClick();
		
		//�β������ڲ���
		MyButton my=new MyButton();
		my.setOnClickListener(new OnClickListener(){
				public void OnClick(){
				 	System.out.println("�β������ڲ��࣡");
				}
		});
		//����ֵ�����ڲ���
		OnClickListener t=my.go();
		t.OnClick();//ִ�и÷���ֵ�������ڲ���
	}	
	
	public void  setOnClickListener(OnClickListener l){
		l.OnClick();//���������ڲ���ĸ÷���			
	}
	public OnClickListener go(){
		return new OnClickListener(){
			public void OnClick(){				
				System.out.println("����ֵ�����ڲ��࣡");
			}			
		};
	}	
}
interface OnClickListener{	
	void OnClick();
}



