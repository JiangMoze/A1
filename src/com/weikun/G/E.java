package com.weikun.G;

import java.util.Arrays;

public class E {
	public static void main(String[] args) {
		Dog [] a={
				new Dog(12,"MIKE"),
				new Dog(10,"Jack"),
				new Dog(10,"Alice")
				
		};
		Arrays.sort(a);
		System.out.println(Arrays.binarySearch(a, new Dog(10,"Jack")));
		for(Dog d :a){
			System.out.println(d.getName());
		}
		
//		int [] a={4,1,2,3,5};
		
//		for(int i :a){
//			System.out.println(i);
//		}
	}
}
class Dog implements Comparable{
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
	public Dog(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		
		Dog d=((Dog)o);
		
		return this.age- d.age==0?this.name.compareTo(d.name):this.age- d.age;
	}
	
}
class Cat extends Dog{

	public Cat(int age, String name) {
		super(age, name);
		// TODO Auto-generated constructor stub
	}
	
}