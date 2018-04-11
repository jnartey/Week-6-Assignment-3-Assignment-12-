/**
 * @author Jacob Nartey
 * Basic Input and Output Exercise
 * 1.Write a program that displays your name and address on the console as if it were a letter. Your output should look something like that below. 
 *
 */
public class NameAddress {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Specifying width
		int width = 60, widthCount = 1;
		
		System.out.print("+");
		for(int i = 1; i <= width; i++) {
			System.out.print("-");
			widthCount++;
		}
		System.out.print("+");
		System.out.println("");
			
		System.out.printf("|%" + (widthCount + 1) + "s", "#### |\n");
		System.out.printf("|%" + (widthCount + 1) + "s", "#### |\n");
		System.out.printf("|%" + (widthCount + 1) + "s", "#### |\n");
		System.out.printf("|%" + (widthCount + 1) + "s", "|\n");
		System.out.printf("|%" + (widthCount + 1) + "s", "|\n");
		System.out.printf("|%" + (widthCount + 1) + "s", "Bill Gates    |\n");
		System.out.printf("|%" + (widthCount + 1) + "s", "1 Microsoft Way    |\n");
		System.out.printf("|%" + (widthCount + 1) + "s", "Redmond, WA 98104    |\n");
		System.out.printf("|%" + (widthCount + 1) + "s", "|\n");
		
		System.out.print("+");
		for(int i = 1; i <= width; i++) {
			System.out.print("-");
			widthCount++;
		}
		System.out.print("+");
	}

}
