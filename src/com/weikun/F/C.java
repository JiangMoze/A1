package com.weikun.F;

public class C implements IC {

	@Override
	public void mo() {
		// TODO Auto-generated method stub
		new C1().go();
	}

}
interface IC {
	public void mo();
	class C1{
		public void go(){
			System.out.println("go");
		}
	}
}