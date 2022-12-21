package day50;

import java.io.File;
import java.io.IOException;

public class FilePracticeTwo {
	public static void main(String[] args) {
		
		// how to create new directory?
		File newDir = new File("src/day50/sdet");
		if(!newDir.exists()) {
			System.out.println("Creating new Directory");
			newDir.mkdir();
		}else {
			System.out.println("Already Exists");
		}
		System.out.println(newDir.getAbsolutePath());
		try {
			File f1 = new File(newDir.getAbsolutePath() + "/oop.pdf");
			f1.createNewFile();
			
			File f2 = new File(newDir.getAbsolutePath() + "/myExcel.xlsx");
			f2.createNewFile();
			
			File f3 = new File(newDir.getAbsolutePath() + "/cat.png");
			f3.createNewFile();
			
			File f4 = new File(newDir.getAbsolutePath() + "/slides.pdf");
			f4.createNewFile();
			
		}catch(IOException e) {
			System.out.println(e);
		}
		
		
		
		
	}

}
