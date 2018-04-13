import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Jacob Nartey
 *
 */
public class PuzzleTxt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Path file = null;
		BufferedReader bufferedReader= null;
		int response = 0;
		String line = "";
		String textOuput = "";
		
		bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(
				"1. puzzle.txt\n"
				+ "2. puzzle2.txt\n");
		System.out.println("Which of the files would you like to open? select option 1-2");
		System.out.print("> ");
		
		try {
			response = Integer.parseInt(bufferedReader.readLine());
			
			switch(response) {
				case 1:
					file = Paths.get("src/files/puzzle.txt");
					break;
				case 2:
					file = Paths.get("src/files/puzzle2.txt");
					break;
				default:
					System.out.println("Invalid input");
					break;
			}
			
			InputStream inputStream = Files.newInputStream(file);
			bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
			
			while(bufferedReader.ready()) {
				line = bufferedReader.readLine();
			}
			
			for(int i = 2; i < line.length(); i+=3) {
				textOuput += line.charAt(i);
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
			
			System.out.println(textOuput);
		}

	}

}
