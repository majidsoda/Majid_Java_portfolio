package day30;

public class ArrayTask {
	public static void main(String[] args) {
		String[] name =  {"Isla", "Olivia", "Aurora", "Ada", "Cora"};
		for(int i=0; i<name.length; i++) {
			System.out.println(name[i]);
		}
			System.out.println("----------");
		byte[] score = {9,8,7,8,5,6,9,10};
		int averageScore = 0;
		int totalScore = 0;
		for(int i=0; i<score.length; i++) {
			totalScore += score[i];
		}
		averageScore = totalScore / score.length;
		System.out.println("Average score is " + averageScore);	
		System.out.println("----------");	
			
		double[] coordinate = {3.5, 5.9, 2.1, 1.9};
		for(int i=coordinate.length-1; i>=0; i--) {
			System.out.println(coordinate[i]);
			
			
		}
		
			
		}
	}

