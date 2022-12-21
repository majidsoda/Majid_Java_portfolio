package day41;

public class PersonDemo {
	public static void main(String[] args) {
		
		Person objOne = new Person(); 
		objOne.firstName = "Gina";
		objOne.lastName = "Avila";
		objOne.age = 28;

		String fullName = objOne.getFullName();
		System.out.println(fullName);
		
		Person objTwo = new Person();
		objTwo.firstName = "Majid";
		objTwo.lastName = "Sodavi";
		objTwo.age = 38; 
		
		System.out.println(objTwo.getFullName());

		Person objThree = new Person();
		System.out.println(objThree.getFullName());
		System.out.println(objThree.age);
		
		Person objFour = new Person("Alan", "Avila", 32);
		System.out.println(objFour.getFullName());
		
		objOne.increaseAge(10);
		System.out.println(objOne.age);
	
		
	}

}
