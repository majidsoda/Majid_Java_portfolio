package day23;

public class RealPyramid {

	public static void main(String[] args) {
		makePyramid(8);
		
	}
	public static void makePyramid(int num) {
	
		 if(num<1 || num>8){
	        System.out.println("INVALID INPUT");
	      
	      }else {
	    	  String hash= "########";
	  	    String spc = "        ";
	  	    int sp = num;
	      for(int i=1; i<=num; i++){
	    	  System.out.println(spc.substring(1,sp)+hash.substring(0,i)+"  "+ hash.substring(0,i));
	          sp--;
			}
		}
	}}