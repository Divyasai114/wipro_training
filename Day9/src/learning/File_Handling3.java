package learning;
import java.io.File;//import file class library
import java.io.FileWriter;
import java.util.Scanner;//importing to read a txt files
import java.io.IOException;
import java.io.FileNotFoundException;
public class File_Handling3 {
	public static void main(String[] args) {
		try {
			File myObj = new File("myfile.txt");
			Scanner myReader = new Scanner(myObj);
			while(myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();
			
		}catch(FileNotFoundException e) {
			System.out.println("Error raised.....");
			e.printStackTrace();
		}
	}
}
