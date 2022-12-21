package day24;

public class techLeadAcademy {
	public static void main(String[] args) {
		
		 for (int i=1; i<=30; i++){
			
		   if(i%5==0&&i%3==0)  {
			  System.out.println("Tech Lead Academy");
		  }else if(i%5==0) {
			  System.out.println("Lead"); 			 
		  }else if (i%3==0) {
			  System.out.println("Tech");			  
		  }else {
			  System.out.println(i);
		  }
	}
}}
