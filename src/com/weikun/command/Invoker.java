package com.weikun.command;

public class Invoker {
	private Command c;
	public Invoker(Command c){
		this.c=c;		
	}
	public void go(){
		this.c.execute();
	}
}
