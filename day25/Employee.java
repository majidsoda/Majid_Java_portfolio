package day25;

public class Employee {
	
	public String name;
	public String lastName;
	public int empID;
	public String gender; 
	public int age;
	public String dept;
	public String title;
	
	
	public Employee(String name, String lastName, int empID, String gender, int age, String dept, String title) {
		this.name= name;
		this.lastName= lastName;
		this.empID= empID;
		this.gender= gender;
		this.age= age;
		this.dept= dept;
		this.title= title;
		
	}
	public void display() {
		System.out.println("Name: "+ this.name);
		System.out.println("Last name: "+ this.lastName);
		System.out.println("Employee ID: "+ this.empID);
		System.out.println("Gender: "+ this.gender);
		System.out.println("Age: "+ this.age);
		System.out.println("Department: "+ this.dept);
		System.out.println("Title: "+ this.title);
	}

}
