package learning;
import java.io.File;//import file class library
public class File_Handling4 {
	public static void main(String[] args) {
		File myObj= new File("myfile.txt");
		if(myObj.exists()) {
			System.out.println("File Name:" +myObj.getName());
			System.out.println("Absolute path:" +myObj.getAbsolutePath());
			System.out.println("Writable:" +myObj.canWrite());
			System.out.println("Readable:" +myObj.canRead());
			System.out.println("File size in bytes:" +myObj.length());
		}
		else {
			System.out.println("File not found..");
		}
	}

}
