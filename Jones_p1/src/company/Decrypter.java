package company;

import java.util.Scanner;

public class Decrypter {
	/*Pseudocode 
	 * 
	 * Declare variables
	 * Uses the entered encrypted number from the user and breaks the digits up.
	 * then sets the value of digit by doing the reverse encryption scheme
	 * Puts the digits back together and stores in decryptedNum 
	 */
	
	public static int decrypt(int userNum2)
	{
		int encryptedUserNum = userNum2;
		int decryptNum;
		
		int digit1;
		int digit2;
		int digit3;
		int digit4;
		
	
		
		digit1 = encryptedUserNum / 1000;
		digit2 = encryptedUserNum / 100 % 10;
		digit3 = encryptedUserNum / 10 % 10;
		digit4 = encryptedUserNum % 10;
		
		digit1 = (digit1 + 3) % 10;
		digit2 = (digit2 + 3) % 10;
		digit3 = (digit3 + 3) % 10;
		digit4 = (digit4 + 3) % 10;
		
		decryptNum = digit1 * 10 + digit2 + digit3 * 1000 + digit4 * 100;
		
		//System.out.printf("Decrypted Number is %d", decryptNum);
		
		return decryptNum;
		
	}

	

}
