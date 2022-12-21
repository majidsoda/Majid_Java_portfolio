package day09;

public class CustomMethods {
	public static void main(String[] args) {
		sayAloha("Aloha Friends!");

		System.out.println("Oh,, Hello! \nWho is this?");

		newFriends("I'm a new student");
		
		math(10);
		int result = math(10);
		System.out.println(result);
	}

	public static void sayAloha(String str) {
		System.out.println(str);

	}

	public static void newFriends(String ans) {
		System.out.println(ans);
	}

	public static int math(int times) {
		return times *= 10;
	}
}