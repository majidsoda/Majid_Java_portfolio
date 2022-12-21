package day50;

import java.io.File;
import java.io.IOException;

public class FilePractice {
	public static void main(String[] args) {
		File myNotes = new File("/Users/majidsodavi/eclipse-workspace/sdet-java-b7/src/day50/notes.txt");
		
		System.out.println("Files exists: " + myNotes.exists());
		System.out.println("File name: " + myNotes.getName());
		System.out.println("Full path: " + myNotes.getAbsolutePath());
		
		System.out.println("Is file: " + myNotes.isFile());
		System.out.println("Is directory: " + myNotes.isDirectory());
		
		System.out.println(myNotes.length() + "Bytes"); // Bytes
		
		// last modified date will be epoch format
		System.out.println(myNotes.lastModified()); // 1670373524259
		System.out.println("------------------");
		
		File myNewFile = new File("/Users/majidsodavi/eclipse-workspace/sdet-java-b7/src/day50/nameList.txt");
		if(!myNewFile.exists()) {
			try {
				System.out.println("File doesn't exist");
				System.out.println("Creating new file: " + myNewFile);
				boolean isCreated = myNewFile.createNewFile();
				System.out.println("File is created: " + isCreated);
			} catch(IOException e) {
				System.out.println(e.getMessage());
			}
		} else {
			System.out.println("File is already exist");
		}
	}

}
