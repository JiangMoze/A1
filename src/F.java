
public class F {
	static void change(String s){
		s="456";
	}
	public static void main(String[] args) {
		String s="123";
		change(s);
		System.out.println(s);
	}
}
