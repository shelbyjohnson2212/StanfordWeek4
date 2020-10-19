
import acm.program.*;
import java.awt.FileDialog;
import java.awt.Frame;
import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class WordCount extends ConsoleProgram {
	private static int lines1 = 0;
	
	public void run() {
		println("Please select the file you would like to check");
		FileDialog dialog = new FileDialog((Frame) null, "Select File to Open");
		dialog.setMode(FileDialog.LOAD);
		dialog.setVisible(true);
		
		String path = dialog.getDirectory();
		path += dialog.getFile();
		
		String file = ReadFile(path);
		int WordCount = countWords(file);
		int characterCount = countChar(file);
		
		println("File: " + dialog.getFile());
		println("Lines = " + lines1);
		String wordCount = "";
		println("Words = " + wordCount);
		println("Characters = " + characterCount);
	}
	private int countWords(String file) {
		// TODO Auto-generated method stub
		return 0;
	}
	private void println(String string) {
		// TODO Auto-generated method stub
		
	}
	private static int countChar(String file) {
		return file.length();
	}
	private static String ReadFile(String path) {
		String data ="";
		try {
			File myObject = new File(path);
			Scanner myReader = new Scanner(myObject);
			while (myReader.hasNextLine()) {
					data += myReader.nextLine();
					lines1++;
		
				}
			myReader.close();
		}catch (FileNotFoundException e) {
			System.out.println("An error has occurred.");
			e.printStackTrace();
		}
		return data;
	}
	

}
