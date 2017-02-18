package com.weikun.F;

public enum ESeason {
	SPRING,FALL,WINTER,SUMMER;
	
	public void go(){
		switch (this){
		case SPRING:
			System.out.println("SPRING");
			break;
		case FALL:
			System.out.println("FALL");
			break;
		case WINTER:
			System.out.println("WINTER");
			break;
		case SUMMER:
			System.out.println("SUMMER");
			break;
				
		}
	}
}
