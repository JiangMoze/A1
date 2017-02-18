public class C{
	public static void main(String [] args){
		
		int [] data={4,1,2,7,0,3};
		quickSort(data,0,data.length-1);	
		
		for(int k :data){
			System.out.println(k);
			
		}
	}	
	static void quickSort(int [] data,int start,int end){
		int i=start;
		int j=end;
		if(i>=j){
			return;			
		}		
		boolean flag=true;//true:���ҵ���false��������
		while(i!=j){//���н���			
			if(data[i]-data[j]>0){//����
				int temp=data[i];
				data[i]=data[j];
				data[j]=temp;				
				flag=flag==true?false:true;				
			}			
			if(flag){
				j--;
			}else{
				i++;
			}
		}
		//��ʱi==j
		i--;
		j++;		
		quickSort(data,start,i);
		quickSort(data,j,end);
		
		
	}
}