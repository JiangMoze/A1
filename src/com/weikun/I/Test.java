package com.weikun.I;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test();
		Goods g=new Goods("001","ţ��",10);
		t.buy(g);
		Goods g1=new Goods("001","ţ��",5);
		t.buy(g1);
		Goods g2=new Goods("002","��ţ",2);
		t.buy(g2);
		Goods g3=new Goods("003","����",3);
		t.buy(g3);
		
		for(Goods goods :t.list){
			System.out.println(goods.getName()+":"+goods.getQuantity());
		}
		
		
	}
	private List<Goods> list=Cart.getList();//�õ��ҵĳ�
	public void buy(Goods newGoods){
		
		boolean flag=false;
		for(int i=0;i<list.size();i++){
			
			Goods oldGoods=list.get(i);//����Ʒ
			if(newGoods.getNo().equals(oldGoods.getNo())){//����Ʒ
				//������Ʒ������Ʒ����������
				oldGoods.setQuantity(oldGoods.getQuantity()+newGoods.getQuantity());
				
				flag=true;
				break;
			}
			
		}
		if(!flag){//����Ʒ
			list.add(newGoods);
		}
		
		
	}

}
