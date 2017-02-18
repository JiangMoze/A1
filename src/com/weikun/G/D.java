package com.weikun.G;

public class D {
	int year;
	String name;
	
	public D(int year, String name) {
		super();
		this.year = year;
		this.name = name;
	}

	public static void main(String[] args) {
		D d=new D(10,"mike");
		D d1=new D(10,"mike");
		System.out.println(d.equals(d1));
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(this==obj){
			return true;
		}
		if(obj==null){
			return false;
		}
		if(this.getClass()!=obj.getClass()){
			return false;
		}
		
		D d1=(D)obj;
		
			
		
		
		
		return this.year==d1.year&&this.name.equals(d1.name);
	}
}
