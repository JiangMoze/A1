
public class Animal {
	private int age;//��
	private String name;
	
	
	public int getAge(){
		return age;
	}
	public void setAge(int age1){//װ
		if(age1>100){
			age=100;
		}else{			
			age=age1;
		}
		
		
	}
	
	
	
}
