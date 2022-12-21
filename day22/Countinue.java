package day22;

public class Countinue {
	public static void main(String[] args) {
		
		for (int i = 0; i<=20; i++) {
		
			if(i==7||i==9||i==13) {
				continue;
			}
			System.out.print(i+" ");
		}
		System.out.println();
	}

}
