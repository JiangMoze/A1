package com.weikun.F;

public class D {
	public static void main(String[] args) {
//		new D().mark(new ID(){
//
//			@Override
//			public void go() {
//				// TODO Auto-generated method stub
//				System.out.println("go");
//			}
//			
//			
//			
//			
//		});		
		new D().bark().go();
		
	}
	public void mark(ID i){//�β������ڲ���
		i.go();
	}
	
	public ID bark(){//����ֵ�����ڲ���
		return new ID(){

			@Override
			public void go() {
				// TODO Auto-generated method stub
				System.out.println("go");
			}
			
			
			
		};
	}
}
interface ID{
	public void go();
}
class D1 implements ID{

	@Override
	public void go() {
		// TODO Auto-generated method stub
		System.out.println("go");
	}
	
}