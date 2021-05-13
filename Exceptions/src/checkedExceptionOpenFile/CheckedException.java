package checkedExceptionOpenFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {
	
	public static void openFile() throws FileNotFoundException {
		new FileInputStream("C:\\DoesNotExist.txt");
	}
	
	public static void main(String[] args) {
		try {
			openFile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
