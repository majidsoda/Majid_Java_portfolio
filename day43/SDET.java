package day43;

public class SDET extends Employee {
	public String project; 
	
	
	public static void main(String[] args) {
		SDET sdet = new SDET(); 
		sdet.firstName = "Majid";
		sdet.lastName = "Sodavi";
		sdet.empId = 5104;
		sdet.salary = 120000;
		sdet.department = "IT"; 
		
		
		String fullName = sdet.getFullName();
		System.out.println(fullName);
		
	}

}
