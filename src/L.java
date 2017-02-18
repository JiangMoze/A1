
public class L extends L0 {	
	float sex=10;
	L(){
		sex=8;
		System.out.println("2");
	}
	L(int age){
		super(age);
		
		System.out.println("6");
	}
	public static void main(String[] args) {
		System.out.println(new L(100).sex);
	}
	{//³õÊ¼»¯¿é
		sex=7;
		System.out.println("1");
	}
}
class L0{
	int sex=1;
	{
		sex=9;
		System.out.println("3");		
	}
	L0(int age){
		System.out.println("4");
	}
	L0(){
		System.out.println("5");
	}
}

