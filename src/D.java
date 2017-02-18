
public class D {//方法的形参是基本类型，那么他一定是值传递
	static void half(int m){
		m=m/2;
	}
	public static void main(String[] args) {
		int m=10;
		half(10);
		
		System.out.println(m);
	}
}
