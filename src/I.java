
public class I {
	I(){
		
	}
	I(int age){
		
	}
	void go(int age,String name){
		
	}
	
	void go(String name,float i){
		System.out.println("g1");
	}
	void go(String name,double i){
		System.out.println("g2");
	}
	public static void main(String[] args) {
		new I().go( "",9);
	}
}
