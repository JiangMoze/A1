package com.weikun.C;

public class G extends G0 implements IG {

	@Override
	public void go() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mark() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void plan() {
		// TODO Auto-generated method stub
		
	}	
}
abstract class G0{
	abstract void plan();
}

interface IG extends IG1 {
	int age=200;
	void mark();
}
interface IG1{
	void go();
}