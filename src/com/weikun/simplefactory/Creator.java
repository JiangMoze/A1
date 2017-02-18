package com.weikun.simplefactory;

public class Creator {
	public IProduct sale(int id){
		switch (id) {
		case 1:
			
			return new ProductA();
		case 2:
			
			return new ProductB();

		
		}
		return null ;
	}
}
