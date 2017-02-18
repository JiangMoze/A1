
public class Composition {//×éºÏ
	private A0 a0;
	Composition(){
		a0=new A0();
	}
	public static void main(String[] args) {
		Composition c=new Composition();
		c.a0.go();
	}
}
class A0{
	void go(){
		System.out.println("ok");
	}
}
