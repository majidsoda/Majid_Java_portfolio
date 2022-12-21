package day30;

public class ForEach {
	public static void main(String[] args) {
	//	solution with regular loop
		int[] numArr =  {10,11,13,100,20,60,70,70,15,14};
		for(int i=0 ; i<numArr.length; i++) {
			if(numArr[i]>50) {
				System.out.println(numArr[i]);
			}
		}
		System.out.println("---------");
		
	//	solution with each loop
		for(int num:numArr) {
			if (num>50){
			System.out.println(num);
		}}
	}
}
