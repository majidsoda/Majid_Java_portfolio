package homeWork;

public class Human {
	
	public String name;
	public int age;
	
	public void eat() {
		System.out.println(name+" should eat");
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + "]";
	}


	}
