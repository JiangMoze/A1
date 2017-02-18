
public class K extends K0{
	private int age;
	private String name;
	private String sex;
	private String address;
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	K(){
		super(100);		
		System.out.println("2");		
	}
	K(int age){		
		System.out.println("1");
	}	
	public static void main(String[] args) {
		new K().go();
	}		
	void go(){
		super.go();
		System.out.println("Sons");
	}
}
class K0{
	K0(){
		System.out.println("3");
	}
	void go(){
		System.out.println("parent");
	}
	public K0(int i) {
		// TODO Auto-generated constructor stub
		System.out.println("4");
	}
}
