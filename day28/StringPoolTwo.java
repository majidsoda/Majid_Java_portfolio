package day28;

public class StringPoolTwo {
	public static void main(String[] args) {
		String str = "java";
		String strTwo = "python";
		String strThree = "java";
		
		System.out.println(str==strTwo);
		System.out.println(str==strThree);
		
		//it is totally OK to have multipe refrences
		//pointing the same String object because
		//the only way to change the String is to create new one 
		
		strThree=strThree.toUpperCase();
		System.out.println(strThree);
		
	}

}
