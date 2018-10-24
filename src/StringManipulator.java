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
		
		

	}

}
