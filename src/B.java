public class B{

	public static void main(String [] args){
		bubble();
	}
	static void bubble(){
		int [] a={3,2,0,6,1};
		for(int i=0;i<a.length-1;i++){//�м���Ԫ�� ��Ҫ������λ�ã�-1��һ���Ѿ��ź������ֵ���ŵ������
			for(int j=0;j<a.length-1-i;j++){//����λ�ã�-i������������Ѿ��ź��ˣ������ڽ�����
				if(a[j]- a[j+1]>0){//�������Ҳ࣬�Ž���
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