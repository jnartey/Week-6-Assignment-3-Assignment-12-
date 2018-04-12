import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
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
 * 3. Write a program that asks the user for their name and a number. 
 * Then store the following message in a file named: score.txt: “[name] got a [number] in the Math test.
 *
 */
public class WriteToFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Path file = null;
		BufferedReader bufferedReader= null;
		BufferedWriter bufferedWriter= null;
		
		try {
			file = Paths.get("src/files/score.txt");
			InputStream inputStream = Files.newInputStream(file);
			OutputStream outpurStream = Files.newOutputStream(file);
			
			bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
			bufferedWriter = new BufferedWriter(new OutputStreamWriter(outpurStream));
			System.out.println("Reading first file line of score.txt file: " + bufferedReader.readLine());
			//System.out.println("Enter a number: " + bufferedReader.read());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				bufferedReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
