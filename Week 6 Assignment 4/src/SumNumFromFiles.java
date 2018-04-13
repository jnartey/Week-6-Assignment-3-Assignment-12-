import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Jacob Nartey
 * 5. Create several more files in Notepad containing three integers separated by some whitespace. 
 * Save them in your home directory as "nums2.txt", "nums3.txt", "nums4.txt", etc.
 * Then write a program that asks the user which file to open. 
 * Then it should open that file, and read the three integers from the file. It should then display (on the screen) the total of the integers.
 */
public class SumNumFromFiles {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Path file = null;
		BufferedReader bufferedReader= null;
		int response = 0, sumNumbers = 0;
		String[] line = null;
		String fileName = "";
		
		bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(
				"1. nums2.txt\n"
				+ "2. nums3.txt\n"
				+ "3. nums4.txt");
		System.out.println("Which of the files would you like to open? select option 1-3");
		System.out.print("> ");
		
		try {
			response = Integer.parseInt(bufferedReader.readLine());
			
			switch(response) {
				case 1:
					file = Paths.get("nums2.txt");
					fileName = "nums2.txt";
					break;
				case 2:
					file = Paths.get("nums3.txt");
					fileName = "nums3.txt";
					break;
				case 3:
					file = Paths.get("nums4.txt");
					fileName = "nums4.txt";
					break;
				default:
					System.out.println("Invalid input");
					break;
			}
			
			InputStream inputStream = Files.newInputStream(file);
			bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
			
			line = bufferedReader.readLine().split(" ");
			
			for(int i = 0; i < line.length; i++) {
				sumNumbers += Integer.parseInt(line[i]);
			}
			
		} catch (IOException e) {
			System.out.println("File not found!");
		} finally {
			try {
				bufferedReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("\nTotal of three integers [" + line[0] + " " + line[1] + " " + line[2] + "] from file " + fileName + " is " + sumNumbers);
		}

	}

}
