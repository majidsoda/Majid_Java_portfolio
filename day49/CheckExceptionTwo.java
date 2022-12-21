package day49;

public class CheckExceptionTwo {
	public static void main(String[] args) throws InterruptedException {
		
		for (int i = 0; i <= 5; i++) {
			System.out.println(i);			
			wait(1); 			
		}
	}
	//exception declaration is always in method level
	// this method potentially throws InterruptedException
	
	public static void wait(int seconds) throws InterruptedException {
		Thread.sleep(seconds*1000);
	}
	
}
