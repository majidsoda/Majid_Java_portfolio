package day41;

public class DogDemo {
	public static void main(String[] args) {

		Dog dog = new Dog();
//		dog.name = "Benji";
//		dog.age = -5;

		dog.setName("Benji");
		dog.setAge(1);
		
		System.out.println(dog.getName());
		System.out.println(dog.getAge());
		System.out.println("-------------");
		
		Dog dogTwo = new Dog();
		dogTwo.setName("Cosco");
		dogTwo.setAge(-1);
		
		System.out.println(dogTwo.getName());
		System.out.println(dogTwo.getAge());
	}
}
