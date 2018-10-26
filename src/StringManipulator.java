/**
 * 
 * @author ccapetola20
 *
 */

import java.util.Scanner;
public class StringManipulator 
{

	public static void main(String[] args) 
	{
		Scanner user = new Scanner(System.in);
		System.out.print("Please enter a string: ");
		String str = user.nextLine();
		int strLength = str.length();
		char strFirstChar = str.charAt(0);
		char strLastChar = str.charAt(strLength - 1);		
		
		System.out.println("\nFirst character: " + strFirstChar);
		System.out.println("Last character: " + strLastChar);
		System.out.println("Length of string: " + strLength);
		System.out.println("First half of string: " + str.substring(0, strLength/2));
		
		System.out.print("\nPlease enter a character to search for: ");
		String letter = user.nextLine();
		System.out.println("Index of character: " + str.indexOf(letter));
		System.out.print("\nPlease give a start index for a substring: ");
		String start = user.nextLine();
		int startIndex = Integer.parseInt(start);
		System.out.print("\nPlease give a stop index for a substring: ");
		String stop = user.nextLine();
		int stopIndex = Integer.parseInt(stop);
		System.out.print("\nSubstring: " + str.substring(startIndex, stopIndex));
		
		
		
		

	}

}
