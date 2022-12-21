package day42;

public class InheritanceDemo {
	public static void main(String[] args) {
		Student obj = new Student ();
		obj.name = "Majid";
		obj.lastName = "Sodavi";
		obj.age = 38;
		obj.studentId = 5104;
		obj.course = "JAVA";
		System.out.println(obj.getFullName());
		System.out.println(obj.getDetails());
		
	}
	

}
