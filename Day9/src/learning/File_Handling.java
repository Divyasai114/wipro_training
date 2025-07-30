package learning;
import java.io.File;//import file class library
import java.io.IOException;
public class File_Handling {
	public static void main(String[] args) {
		//new file object creation
		// file path -- where u want to store it :"C:\\Users\\MyName\\filename.txt"
		try {
			File myObj = new  File("myfile.txt");
			if(myObj.createNewFile()) {
				System.out.println("File is created");
			}
			else {
				System.out.println("File already exists.");
			}
	    }catch(IOException e) {
	    	System.out.println("An error");
	    	e.printStackTrace();
	    }
	}
}
