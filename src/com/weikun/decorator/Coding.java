package com.weikun.decorator;

public class Coding extends GirlDecorator{
	
	private Girl g;
	public Coding(Girl g){
		this.g=g;
	}
	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return g.getDesc()+"»á±àÂë£¡";
	}
	
	
	
}
