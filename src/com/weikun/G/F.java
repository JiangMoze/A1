package com.weikun.G;

public class F {//fleetclone
	public static void main(String[] args) {
		Professor pro=new Professor("ÄÐ",10);
		
		Person p=new Person(100,"MIKE",pro);		
		Person p1;
		try {
			p1 = (Person)p.clone();
			System.out.println(p1.getPro().getSex());
			
			p.getPro().setSex("Å®");
			
			System.out.println(p1.getPro().getSex());
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}
class Professor implements Cloneable{
	 
	private String sex;
	private int old;
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getOld() {
		return old;
	}
	public void setOld(int old) {
		this.old = old;
	}
	public Professor(String sex, int old) {
		super();
		this.sex = sex;
		this.old = old;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
class Person implements Cloneable{
	
	private Professor pro;
	
	public Professor getPro() {
		return pro;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Person p=(Person)super.clone();
		p.pro=(Professor)this.pro.clone();
		return p;
	}
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Person(int age, String name,Professor pro) {
		super();
		this.pro=pro;
		this.age = age;
		this.name = name;
	}
	
}