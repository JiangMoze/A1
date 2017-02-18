package com.weikun.decorator;

public class MathGirl extends GirlDecorator {
	private Girl g;
	public MathGirl(Girl g){
		this.g=g;
		
	}
	
	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return  g.getDesc()+"ปแสýัง";
	}

}
