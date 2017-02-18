
public class G extends G0 {
	
	public G(int i) {
		// TODO Auto-generated constructor stub
		
	}

	public static void main(String[] args) {
		G g=new G(100);
		g.age=200;
		
		
	}
}
class G0 extends Object{
	G0(){
		System.out.println("G0");
	}
	G0( int age){
		System.out.println("G0(int)");
	}
	int age=10;
	void go(){
		System.out.println("go");
	}
}