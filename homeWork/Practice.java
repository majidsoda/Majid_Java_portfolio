package homeWork;

import java.util.Arrays;

public class Practice {
	public static void main(String[] args) {

		int[] numArr = { 1, 2, 3, 5 };
		int num = 4;
		int[] res = new int[2];

		 for(int i=0; i<numArr.length; i++){
		        for(int j=1; j<numArr.length-j; j++){
		          if(numArr[i]+numArr[j]==num){ 
		            res[0]=numArr[i];
		            res[1]=numArr[j];
		           }
		        }
		      
		      }

		System.out.println(Arrays.toString(res));
	}
}
