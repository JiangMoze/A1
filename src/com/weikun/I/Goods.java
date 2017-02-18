package com.weikun.I;

import java.io.Serializable;

public class Goods implements Serializable {
	private String no;
	private String name;
	private int quantity;
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Goods(){}
	public Goods(String no, String name, int quantity) {
		super();
		this.no = no;
		this.name = name;
		this.quantity = quantity;
	}
	
}
