import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Jacob Nartey
 * 4. Create a file named: num1.txt and insert integers separated by some white space. 
 * Write a program that reads three integers from the file nums.txt and displays (on the screen) the total of the integers.
 *
 */
public class SumNumFromFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Path file = null, fileTo = null;
		BufferedReader bufferedReader= null;
		BufferedWriter bufferedWriter= null;
		int sumNumbers = 0;
		String[] line = null;
		int nums = 0;
		
		file = Paths.get("src/files/num1.txt");
		fileTo = Paths.get("src/files/nums.txt");
		
		try {
			InputStream inputStream = Files.newInputStream(file);
			OutputStream outputStream = Files.newOutputStream(fileTo);
			InputStream readInputStream = Files.newInputStream(fileTo);
			
			
			bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
			bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
			
			line = bufferedReader.readLine().split(" ");
			
			
			for(int i = 0; i < 3; i++) {
				sumNumbers += Integer.parseInt(line[i]);
			}
			
			bufferedWriter.write(Integer.toString(sumNumbers));
			bufferedWriter.newLine();
			bufferedWriter.close();
			
			bufferedReader = new BufferedReader(new InputStreamReader(readInputStream));
			
			nums = Integer.parseInt(bufferedReader.readLine());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				bufferedReader.close();
				bufferedWriter.close();
				System.out.println("Total of three integers [" + line[0] + " " + line[1] + " " + line[2] + "] from file num.txt is " + nums);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
