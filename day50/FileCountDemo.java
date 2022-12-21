package day50;

public class FileCountDemo {
	public static void main(String[] args) {
		
	
	FileCounter counter = new FileCounter();
	int numberOfFiles = counter.countFiles("src");
	
	System.out.println("The number of files created in 50 days: " + numberOfFiles);
	
	FileCounter counterTwo = new FileCounter();
	int nFiles = counterTwo.countFiles("/Users/majidsodavi/Desktop/");
	System.out.println("Number of files in the Desktop: " + nFiles);
	}

}
