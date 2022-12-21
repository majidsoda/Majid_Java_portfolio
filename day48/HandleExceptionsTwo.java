package day48;

public class HandleExceptionsTwo {
	public static void main(String[] args) {
		
		String strnum = "123";
		
		try {
			int num = Integer.parseInt(strnum);
			System.out.println(num);
		
		}catch (NumberFormatException | NullPointerException e) {
			System.out.println("Invalid strNum");
		
		}catch(IndexOutOfBoundsException e) {
			System.out.println("Invalid strNum ");
		}
		
		System.out.println("Completed");				
	}
}
