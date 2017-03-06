// Author: Visweswaran

// Simple file creation in JAVA

import java.io.*;
public class FileHandling {
	public static void main(String[] args) {
		System.out.println("File handling in JAVA");
		try {
			FileOutputStream file = new FileOutputStream("file.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
