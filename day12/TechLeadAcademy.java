package day12;

public class TechLeadAcademy {
	public static void main(String[] args) {
		printTechLead(6); // Tech
		printTechLead(5); // Lead
		printTechLead(7); // 7
		printTechLead(8); // 8
		printTechLead(15); // Tech Lead Academy
	}
	/*
	 * if argument number can be evenly divided by 3 then print "Tech"
	 * if argument number can be evenly divided by 5 then print "Lead"
	 * if argument number can be evenly divided by 3 and 5 then print "Tech Lead Academy"  
	 * otherwise just print the number itself
	 * 
	 * number % 3 == 0 - we can divide by 3 evenly
	 */
	public static void printTechLead(int number) {
		// TODO
	
		if (number %3 ==0 && number % 5== 0) {
			System.out.println("Tech Lead Academy");
			
		} else if (number % 5== 0) {
			System.out.println("Lead");
			
		} else if (number % 3== 0) {
			System.out.println("Tech");
			
		} else {
			System.out.println(number);
		}
	}
	}

