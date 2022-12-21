package day18;

public class StrMoreMethods {
	public static void main(String[] args) {
		// trim() - removes white spaces around the String value
		String name = " Majid sodavi  ";
		System.out.println(name);
		System.out.println(name.length());
		name = name.trim();
		
		System.out.println(name);
		System.out.println(name.length());
		System.out.println("-----");
		
		// isEmpty() - checks if string is empty
		String str = "";
		System.out.println(str.isEmpty());
		System.out.println(str.length()==0);
		System.out.println("-----");
		
		// String.valueOf(dataType) - converts argument type to String
		int num = 5;
		//      "5"
		String strNumber = String.valueOf(num);
		System.out.println(strNumber);
		
		// String.join(String delimiter, values...) joins values in one string with delimiter
		String names = String.join(" | ", "Alex", "Kuba", "Bek", "Ramesh");
		System.out.println(names);
				
		names = String.join("$", "John", "Salavat", "Sushma");
		System.out.println(names); // John$Salavat$Sushma
	}

}
