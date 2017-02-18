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
	
	public void plan(Animal a){//2�βζ�̬
		a.bark();
	}
	
	public Animal make(int i){//3����ֵ��̬
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
//		Person p1=new Student();//1�鷽�����ã�����̳�
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