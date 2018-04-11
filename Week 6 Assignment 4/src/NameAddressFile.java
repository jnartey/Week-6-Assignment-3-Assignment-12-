import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Jacob Nartey
 * 2. Modify question #1, instead of displaying to the console, output the letter to a .txt file
 *
 */
public class NameAddressFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Specifying width
		int width = 60, widthCount = 1;
				
		PrintWriter outputStream = null;
		File writeTo = new File("src/files/nameaddress.txt");
		
		try {
			outputStream = new PrintWriter(writeTo);
			outputStream.print("+");
			for(int i = 1; i <= width; i++) {
				outputStream.print("-");
				widthCount++;
			}
			outputStream.print("+");
			outputStream.println("");
				
			outputStream.printf("|%" + (widthCount + 2) + "s", "#### |\r\n");
			outputStream.printf("|%" + (widthCount + 2) + "s", "#### |\r\n");
			outputStream.printf("|%" + (widthCount + 2) + "s", "#### |\r\n");
			outputStream.printf("|%" + (widthCount + 2) + "s", "|\r\n");
			outputStream.printf("|%" + (widthCount + 2) + "s", "|\r\n");
			outputStream.printf("|%" + (widthCount + 2) + "s", "Bill Gates    |\r\n");
			outputStream.printf("|%" + (widthCount + 2) + "s", "1 Microsoft Way    |\r\n");
			outputStream.printf("|%" + (widthCount + 2) + "s", "Redmond, WA 98104    |\r\n");
			outputStream.printf("|%" + (widthCount + 2) + "s", "|\r\n");
			
			outputStream.print("+");
			for(int i = 1; i <= width; i++) {
				outputStream.print("-");
				widthCount++;
			}
			outputStream.print("+");
			outputStream.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
