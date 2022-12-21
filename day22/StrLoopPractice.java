package day22;

public class StrLoopPractice {
	public static void main(String[] args) {
		System.out.println(getNumberOfVowels("apple")); // 2
		System.out.println(getNumberOfVowels("Java")); // 2
		System.out.println(getNumberOfVowels("hello world")); // 3
		System.out.println(getNumberOfVowels("abc")); // 1
	}
	
	
	 // Return number of vowel letter in argument str
	 //Vowel letters: a, e, i, o, u

	public static int getNumberOfVowels(String str) {
		int count = 0;
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++)  {
			char ch = str.charAt(i);
			if(ch=='a'||ch=='e'|| ch=='i'|| ch=='o'||ch=='u') {
				
				count++;
			}}
		
		return count;

}}
