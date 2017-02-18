package com.weikun.factorymethod;

public interface IProduct {
	public void make();
}
class ProductA implements IProduct{
	@Override
	public void make() {
		// TODO Auto-generated method stub
		System.out.println("生产汉堡");
	}	
}
class ProductB implements IProduct{
	@Override
	public void make() {
		// TODO Auto-generated method stub
		System.out.println("生产薯条");
	}	
}
interface ICreator{
	public IProduct sale();
}

class CreatorA implements ICreator{

	@Override
	public IProduct sale() {
		// TODO Auto-generated method stub
		return new ProductA();
	}
}
class CreatorB implements ICreator{

	@Override
	public IProduct sale() {
		// TODO Auto-generated method stub
		return new ProductB();
	}
}











