package learning;
import java.io.File;
public class File_Handling5 {
	public static void main(String[] args) {
		File myObj= new File("myfile.txt");
		if(myObj.delete()) {
			System.out.println("File deleted successfully!!!!  "+myObj.getName());
		}
		else {
			System.out.println("File is not found or set path......");
		}
	}

}
