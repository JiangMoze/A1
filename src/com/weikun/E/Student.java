package com.weikun.E;

public class Student extends Person {
	@Override
	public void go() {
		// TODO Auto-generated method stub
		System.out.println("student---go");
	}
	public void mark(){
		System.out.println("student---mark");
	}
	
	public void plan(Animal a){//2形参多态
		a.bark();
	}
	
	public Animal make(int i){//3返回值多态
		if(i==1){
			return new Dog();
		}else{
			return new Cat();
		}
		
	}
	public static void main(String[] args) {
		Student s=new Student();
		s.go();
		Cat c=new Cat();
		s.plan(c);
		
		s.plan(new Dog());
		s.make(1).bark();
		
		s.make(2).bark();
		
//		Person p=new Person();
//		p.go();
//		
//		Person p1=new Student();//1虚方法调用，必须继承
//		p1.go();
//		((Student)p1).mark();//
		
		
		
	}
}


abstract class Animal{
	public abstract void bark();
}
class Dog extends Animal{
	public void bark(){
		System.out.println("dog-bark");
	}
}
class Cat extends Animal{
	public void bark(){
		System.out.println("cat-bark");
	}
}