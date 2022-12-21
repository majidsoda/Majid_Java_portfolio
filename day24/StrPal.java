package day24;

public class StrPal {
	public static void main(String[] args) {
		System.out.println(revStr("java")); // avaj
		System.out.println(revStr("python")); // nohtyp
		System.out.println(revStr("javaScript")); // tpircSavaj
		System.out.println(revStr("MajidLovesGina"));
		
		System.out.println("----");
		System.out.println(isPal("anna")); // true
		System.out.println(isPal("civic")); // true
		System.out.println(isPal("apple")); // false
		System.out.println(isPal("level")); // true
		System.out.println(isPal("java")); // false
		
		System.out.println("----");
		System.out.println(isPal2("anna")); // true
		System.out.println(isPal2("civic")); // true
	}

	public static boolean isPal(String str) {
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		return rev.equals(str);
	}
	public static boolean isPal2(String str) {
		for (int start = 0; start < str.length() / 2; start++) {
			int end = str.length() - 1 - start;
			if (str.charAt(start) != str.charAt(end)) {
				return false;
			}
		}
		return true;
	}

	public static String revStr(String str) {
		String rev = "";		
		for (int i = str.length()- 1; i >= 0; i--) {
			rev += str.charAt(i);
		}

		return rev;
	}
}
