package com.weikun.K;

public class Account {
	private String accountNo;//账户名称
	
	private int balance;//余额

	public Account(String accountNo, int balance) {
		super();
		this.accountNo = accountNo;
		this.balance = balance;
	}
	
	public  void drawMoney(int money){
		synchronized(this){
			
			if(this.balance>=money){//还能取钱
				System.out.println(Thread.currentThread().getName()+"取了"+money+"钱！");
				this.balance-=money;
				
			}else{
				System.out.println("余额不足，不能取钱");
			}
			
		}
		
		
	}
	
}
