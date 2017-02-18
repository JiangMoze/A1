
public class Animal {
	private int age;//·â
	private String name;
	
	
	public int getAge(){
		return age;
	}
	public void setAge(int age1){//×°
		if(age1>100){
			age=100;
		}else{			
			age=age1;
		}
		
		
	}
	
	
	
}
