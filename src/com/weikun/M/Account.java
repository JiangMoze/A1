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
	private boolean flag=false;//false:ûǮ�����Դ�Ǯ�ˣ�true����Ǯ����ȡǮ�ˡ�
	
	//ȡǮ
	public synchronized void drawMoney(int money){
		
		if(flag==false){			
			try {
				wait();//�ý�����ȡǮ�̵߳Ⱥ�
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//Interrupt
		}else{//����ȡǮ��
			
			System.out.println("�Ѿ�ȡ��"+money+"Ǯ");
			this.balance-=money;
			flag=false;
			
			this.notifyAll();
		}
		
	}
	//���
	public synchronized void depositeMoney(int money){
		
		if(flag){//true,��Ǯ���ܴ��
			
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}else{
			
			System.out.println("�Ѿ���"+money+"Ǯ");
			this.balance+=money;
			flag=true;
			this.notifyAll();
			
			
		}
	}
	
}
