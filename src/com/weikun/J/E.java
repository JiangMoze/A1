/**
 * 
 */
package com.weikun.J;

/**
 * @author Administrator
 *
 */
public class E extends Thread{
	public static void main(String[] args) {
		E e=new E();
		e.setName("A");		
		e.start();
		
		
		E e2=new E();
		e2.setName("C");		
		e2.start();
		
		E1 e1=new E1();
		e1.setName("B");
		e1.setDaemon(true);// ÿª§
		e1.start();
		
		E1 e3=new E1();
		e3.setName("D");
		e3.setDaemon(true);// ÿª§
		e3.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++){
			try {
				Thread.currentThread().sleep(80);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}

}
class E1 extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<1000;i++){
			try {
				Thread.currentThread().sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
	
}
