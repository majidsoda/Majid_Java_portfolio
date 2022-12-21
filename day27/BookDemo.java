package day27;

public class BookDemo {
	public static void main(String[] args) {
		Book bookA = new Book ("10X", "Alex", 300);
		bookA.printBookDetails();
		
		System.out.println("----------");
		
		Book bookB = bookA;
		bookB.title = "11X";
		
		bookB.printBookDetails();
		
		System.out.println("----------");
		
		bookA.printBookDetails();
		
		System.out.println("----------");
		
		Book bookOne = new Book("OCA","Jeane", 500);
		Book bookTwo = new Book("OCA","Jeane", 500);
		
		//equal to == compares if 2 objects refrences pointing the same 
		//object or not. 
		
		if(bookOne==bookTwo) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}	
	}
}
