package learning;
import java.io.File;//import file class library
import java.io.FileWriter;
import java.io.IOException;// for writing in file
public class File_Handling2 {
	public static void main(String[] args) {
		try {
			//writing of file
			FileWriter myWriter = new FileWriter("myfile.txt");
			myWriter.write("File  in java adding financial text super easy.......");
			myWriter.close();
			System.out.println("Successfully written to the file");
		}catch(IOException e) {
			System.out.println("Error occurred");
			e.printStackTrace();
		}
	}
}
