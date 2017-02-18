import java.util.Date;

public class E {//方法的形参是引用类型，那么他一定是值传递（地址）：引用传递
	static void half(Date d){
		d.setYear(100);
		System.out.println(d);
	}
	public static void main(String[] args) {
		Date d=new Date();
		System.out.println(d);
		half(d);
		System.out.println(d);
	}
}
