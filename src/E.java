import java.util.Date;

public class E {//�������β����������ͣ���ô��һ����ֵ���ݣ���ַ�������ô���
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
