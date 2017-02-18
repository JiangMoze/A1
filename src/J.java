
public class J extends J0 {
	public static void main(String[] args) {
		new J();
	}
	J(){
		System.out.println("J");
	}
}
class J0 extends J00{
	J0(){
		System.out.println("J0");
	}
}
class J00 extends Object{
	J00(){
		System.out.println("J00");
	}
}