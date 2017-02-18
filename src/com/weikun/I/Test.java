package com.weikun.I;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test();
		Goods g=new Goods("001","牛奶",10);
		t.buy(g);
		Goods g1=new Goods("001","牛奶",5);
		t.buy(g1);
		Goods g2=new Goods("002","奶牛",2);
		t.buy(g2);
		Goods g3=new Goods("003","大米",3);
		t.buy(g3);
		
		for(Goods goods :t.list){
			System.out.println(goods.getName()+":"+goods.getQuantity());
		}
		
		
	}
	private List<Goods> list=Cart.getList();//得到我的车
	public void buy(Goods newGoods){
		
		boolean flag=false;
		for(int i=0;i<list.size();i++){
			
			Goods oldGoods=list.get(i);//老商品
			if(newGoods.getNo().equals(oldGoods.getNo())){//老商品
				//把老商品和新商品的数量叠加
				oldGoods.setQuantity(oldGoods.getQuantity()+newGoods.getQuantity());
				
				flag=true;
				break;
			}
			
		}
		if(!flag){//新商品
			list.add(newGoods);
		}
		
		
	}

}
