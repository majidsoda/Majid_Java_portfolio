package day50;

import java.io.File;

public class AbsVsRelativePath {
	public static void main(String[] args) {
		//absolute file path is a path from root directory to your specific file
		File myNotes = new File("/Users/majidsodavi/eclipse-workspace/sdet-java-b7/src/day50/notes.txt");
		System.out.println("Files exists: " + myNotes.exists());
		System.out.println("Full path: " + myNotes.getAbsolutePath());
		
		//Relative file path from the place where code is running to your specific file
		File myNoteRelativePath = new File("src/day50/notes.txt");
		System.out.println("file exist: " + myNoteRelativePath.exists());
		System.out.println(myNoteRelativePath.getAbsolutePath());
		
	}

}
