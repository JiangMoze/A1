
public class H extends H0{
	void mark(){
		System.out.println("mark");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			H0 h0=new H();//��̬:�鷽������
			//ǿת
			((H)h0).mark();
	}
}
class H0{
	void go(){
		
	}
}