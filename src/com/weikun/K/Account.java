package com.weikun.K;

public class Account {
	private String accountNo;//�˻�����
	
	private int balance;//���

	public Account(String accountNo, int balance) {
		super();
		this.accountNo = accountNo;
		this.balance = balance;
	}
	
	public  void drawMoney(int money){
		synchronized(this){
			
			if(this.balance>=money){//����ȡǮ
				System.out.println(Thread.currentThread().getName()+"ȡ��"+money+"Ǯ��");
				this.balance-=money;
				
			}else{
				System.out.println("���㣬����ȡǮ");
			}
			
		}
		
		
	}
	
}
