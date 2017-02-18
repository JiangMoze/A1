package com.weikun.M;

public class Account {
	public Account(){
		
	}
	public Account(String no,int balance){
		this.no=no;
		this.balance=balance;
	}
	private String no;
	private int balance;
	private boolean flag=false;//false:没钱，可以存钱了，true：有钱可以取钱了。
	
	//取钱
	public synchronized void drawMoney(int money){
		
		if(flag==false){			
			try {
				wait();//让进来的取钱线程等候
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//Interrupt
		}else{//可以取钱了
			
			System.out.println("已经取了"+money+"钱");
			this.balance-=money;
			flag=false;
			
			this.notifyAll();
		}
		
	}
	//存款
	public synchronized void depositeMoney(int money){
		
		if(flag){//true,有钱不能存款
			
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}else{
			
			System.out.println("已经存"+money+"钱");
			this.balance+=money;
			flag=true;
			this.notifyAll();
			
			
		}
	}
	
}
