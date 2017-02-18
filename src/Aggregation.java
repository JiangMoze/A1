
public class Aggregation {//¾ÛºÏ
	private B0 b0;
	
	public void setB0(B0 b1){
		
		b0=b1;
		
	}
	public static void main(String[] args) {
		Aggregation a=new Aggregation();
		B0 b1=new B0();
		a.setB0(b1);
		a.b0.go();
	}
}
class B0{
	void go(){
		System.out.println("ok");
	}
}
