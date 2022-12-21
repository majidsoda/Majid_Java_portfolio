package day25;

public class Student {

	public String name;
	public String lastName; 
	public int grade;
	
	
	public Student(String name, String lastName, int grade) {
		System.out.println("inside constructor with 3 args");
		this.name = name;
		this.lastName = lastName;
		this.grade = grade;
		
		
	}
	public void display() {
		System.out.println("name: "+this.name);
		System.out.println("last name: "+this.lastName);
		System.out.println("grade: "+this.grade);
	}
}

