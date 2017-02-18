package com.weikun.abstractfactory;

public abstract class AbstractFactory {

}
abstract class AbstractProductA {

}
abstract class AbstractProductB {

}
class ConcreateFactory extends AbstractFactory{
	public  ProductA makeA(){
		return new ProductA();
	}
	
	public  ProductB makeB(){
		return new ProductB();
	}
}
class ProductA extends AbstractProductA{
	
}
class ProductB extends AbstractProductB{
	
}