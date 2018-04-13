import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Jacob Nartey
 * 3. Write a program that asks the user for their name and a number. 
 * Then store the following message in a file named: score.txt: [name] got a [number] in the Math test.
 */
public class MathScore {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Path file = null;
		BufferedReader bufferedReader= null;
		BufferedWriter bufferedWriter= null;
		String name = "";
		String number = "";
		
		try {
			file = Paths.get("src/files/score.txt");
			//InputStream inputStream = Files.newInputStream(file);
			OutputStream outputStream = Files.newOutputStream(file);
			
			bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
			//System.out.println("Reading first file line of score.txt file: " + bufferedReader.readLine());
			System.out.println("Enter your name: ");
			System.out.print("> ");
			name = bufferedReader.readLine();
			System.out.println("Enter a number: ");
			System.out.print("> ");
			number = bufferedReader.readLine();
			//System.out.println(name + " got a " + number +" in the Math test");
			bufferedWriter.write(name + " got a " + number +" in the Math test");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				bufferedReader.close();
				bufferedWriter.close();
				System.out.println("Data stored successfully, program ended....");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
