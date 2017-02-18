
public class Student {
	String no;
	int grade;
	char sex;
	String name;
	int age;
	int getAge(){//read		
		
		return age;
	}
	void setAge(int age1){
		age=age1;
	
	}
	String getName(){//read		
		return name;
	}
	void setName(String name1){//write		
		name=name1;
	}	
	Student(){
		
	}
	Student(int age1){//非默认构造器			
		age=age1;
	}
	
	public static void main(String[] args) {
		Student s1=new Student();
		s1.setName("mike");
		
		Student s2=s1;
		System.out.println(s2.getName());
		s1=null;
		s2=null;
		
//		Student s=null;
//		s=new Student();//实例化  把类变成对象
//		s.age=200;
//		System.out.println(s.age);
//		System.out.println(s.getAge());
//		
//		s.setAge(1);
//		System.out.println(s.age);
//		System.out.println(s.getAge());
		
	}
}
