public class B{

	public static void main(String [] args){
		bubble();
	}
	static void bubble(){
		int [] a={3,2,0,6,1};
		for(int i=0;i<a.length-1;i++){//有几个元素 就要挨个串位置，-1第一次已经排好了最大值，放到了最后
			for(int j=0;j<a.length-1-i;j++){//交换位置，-i：后面的数都已经排好了，不用在交换了
				if(a[j]- a[j+1]>0){//左侧大于右侧，才交换
					int temp=a[j];
					a[j]=a[j+1];					
					a[j+1]=temp;
				}				
			}			
		}		
		for(int i :a){
			System.out.println(i);			
		}		
		
	}
}