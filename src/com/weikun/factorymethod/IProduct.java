package com.weikun.factorymethod;

public interface IProduct {
	public void make();
}
class ProductA implements IProduct{
	@Override
	public void make() {
		// TODO Auto-generated method stub
		System.out.println("��������");
	}	
}
class ProductB implements IProduct{
	@Override
	public void make() {
		// TODO Auto-generated method stub
		System.out.println("��������");
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











