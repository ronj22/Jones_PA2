package company;

import java.util.Scanner;

public class Encrypter {
	/*Pseudocode 
	 * 
	 * Declare variables
	 * Uses the entered number from the user and breaks the digits up.
	 * then sets the value of digit by doing the encryption scheme
	 * Puts the digits back together and stores in encryptNum 
	 */

	public static int encrypt(int userNum)
	{
		int userNum1 = userNum;
		int encryptNum;
		int digit1;
		int digit2;
		int digit3;
		int digit4;
		
		
		
		digit1 = userNum1 / 1000;
		digit2 = userNum1 / 100 % 10;
		digit3 = userNum1 / 10 % 10;
		digit4 = userNum1 % 10;
		
		digit1 = (digit1 + 7) % 10;
		digit2 = (digit2 + 7) % 10;
		digit3 = (digit3 + 7) % 10;
		digit4 = (digit4 + 7) % 10;
		
		
		encryptNum = digit1 * 10 + digit2 + digit3 * 1000 + digit4 * 100;
		
		
		
		return encryptNum;
	}
	
	

}
