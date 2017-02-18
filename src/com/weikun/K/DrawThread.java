package com.weikun.K;

public class DrawThread extends Thread {
	
	private int money;
	private Account account;
	
	
	public DrawThread(String name, int money, Account account) {
		
		this.setName(name);
		this.money = money;
		this.account = account;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		account.drawMoney(money);
	}
	
}
