package company;

import java.util.Scanner;

public class Application {
	
	/*Pseudocode 
	 * 
	 * Declare variables
	 * Prompts user to enter a 4 digit number 
	 * scans in input
	 * Then runs the encrypter method
	 * then prints encrypted number
	 * 
	 * then 
	 * 
	 * prompts user to enter a 4 digit encrypted number
	 * scans in input
	 * The runs the decrypter method
	 * then prints decrypted number
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int userNum;
		int userNum2;
		int encrypted;
		int decrypted;
		
		
		
		 
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the 4 digit number you want to encrypt \n");
		userNum = scan.nextInt();
		
		
		
		encrypted =  Encrypter.encrypt(userNum);
		
		System.out.printf("Encrypted Number is %04d \n\n",encrypted);
		
		
		
		
		
		
		
		System.out.println("Please enter the Encrypted number you want to Decrypt");
		userNum2 = scan.nextInt();
		
		scan.close();
		
		decrypted = Decrypter.decrypt(userNum2);
		
		System.out.printf("Decrypted Number is %04d",decrypted);
		

		
		
		

	}

}
