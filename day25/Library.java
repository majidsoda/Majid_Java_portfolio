package day25;

public class Library {
	public static void main(String[] args) {
		// TODO
		// 1.Create 2 objects from Book class with all 
		//   properties assigned (any value)
		
		// 2.Print both object details

		Book bookOne = new Book();
		bookOne.title = "Hamlet";
		bookOne.author = "William Shakespeare";
		bookOne.pages = 2022;
		
		
//		System.out.println(bookOne.author);
//		System.out.println(bookOne.pages);
//		System.out.println(bookOne.title);
//		System.out.println("------------");
//		
		Book bookTwo = new Book("Java", "Savitch", 650);
		
//		System.out.println(bookTwo.author);
//		System.out.println(bookTwo.pages);
//		System.out.println(bookTwo.title);
		
		System.out.println("Book One");
		bookOne.displayDetails();
		
		System.out.println("------------");
		
		System.out.println("Book two");
		bookTwo.displayDetails();
					
		}
	}
