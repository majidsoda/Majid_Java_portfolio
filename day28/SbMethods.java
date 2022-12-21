package day28;

public class SbMethods {
	public static void main(String[] args) {
		
		StringBuilder day = new StringBuilder("Thursday");
		
		char ch = day.charAt(2);
		System.out.println(ch);
		
		int index = day.indexOf("day");
		System.out.println(index);
		
		int len = day.length();
		System.out.println("Size : "+len);
		
		String subStr = day.substring(0,5);
		System.out.println(subStr);
		System.out.println("----------------");
		
		//insert(index, value)
		StringBuilder sb = new StringBuilder("animals");
		System.out.println(sb);
		
		sb.insert(0, "the ");
		System.out.println(sb);
		
		sb.insert(3, " good");
		System.out.println(sb);
		System.out.println("----------------");
		
		//delete (start, end)
		sb.delete(4, 9);
		System.out.println(sb);
		System.out.println("----------------");
		
		StringBuilder sb2 = new StringBuilder ("abcdef");
		System.out.println(sb2);
		sb2.delete(2, 4);
		System.out.println(sb2);
		
		StringBuilder sb3 = new StringBuilder ("aadfjsvknvbsjnanbcdej");
		sb3.delete(1, sb3.length()-1);
		System.out.println(sb3);
		
		sb3.append("java");
		System.out.println(sb3);//ajjava
		sb3.deleteCharAt(0);
		System.out.println(sb3);//jjava
		sb3.deleteCharAt(1);
		System.out.println(sb3);
		System.out.println("----------------");
		
		StringBuilder name = new StringBuilder ("Majid sodavi");
		System.out.println(name);
		name.reverse();
		System.out.println(name);
		
		
	}

}
