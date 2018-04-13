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
 *
 */
public class CrazyText {
	
	//Static isVowel method returning a boolean
	static boolean isVowel(char ch) {
		char[] vowels = {'a', 'e', 'i', 'o', 'u'};
		
        for (char vowel : vowels) {
            if (vowel == ch) {
                return true;
            }
        }
        return false;
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Path file = null, fileTo = null;
		BufferedReader bufferedReader= null;
		BufferedWriter bufferedWriter= null;
		String line = "";
		String lines = "";
		String modifiedTxt = "";
		
		//Getting files
		file = Paths.get("src/files/CrazyText.txt");
		fileTo = Paths.get("src/files/CrazyTextModified.txt");
		
		try {
			//Input and output streams
			InputStream inputStream = Files.newInputStream(file);
			OutputStream outputStream = Files.newOutputStream(fileTo);
			
			//Buffers with streams instances passed as a parameter
			bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
			bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
			
			//Reading text line by line
			while ((line = bufferedReader.readLine()) != null) {
				lines += line + "\n";
			}
			
			//Checking if character by character for vowels to be capitalized
			for(int i = 0; i < lines.length(); i++) {
				if(isVowel(lines.toLowerCase().charAt(i))) {
					modifiedTxt += lines.toUpperCase().charAt(i);
				}else {
					modifiedTxt += lines.toLowerCase().charAt(i);
				}
			}
			
			//Writing text to file
			bufferedWriter.write(modifiedTxt);
			bufferedWriter.newLine();
			bufferedWriter.close();
												
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				//Closing buffers
				bufferedReader.close();
				bufferedWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			System.out.println("CrazyText modified complete");
		}
	}

}
