package day05;

public class Swap {
	public static void main(String[] args) {
		String sky = "Yellow";
		String sun = "Blue";
		String temp = sky;
		sky = sun;
		sun = temp;
		
		
		System.out.println("sky is " + sky);
		System.out.println("sun is " + sun);
		
	}

}
