import java.util.Scanner;

public class Begin {
	public static void main(String[] args){
		
		//pseudo-code
		/*
		 * syso "enter hex number"
		 * Scanner read as string(0-9, A-F)
		 * parse string(Dissect)
		 * use math to go from hex to decimal to binary
		 * syso "hex number abc ... converts to 011011... binary"
		 * syso "hex number abc... converts to 123... decimal
		 * 16^0 = 1 16^1 = 16 16^2 = 256 16^3 = 4096
		 */
		
		// use ab25 or AB25 for testing
		int decNumber = 0;
		int totalDecimal = 0;
		int bNum = 0;
		int totalB = 0;
		
		Scanner kbd = new Scanner(System.in);
		
		System.out.println("Enter your hexidecimal number");
		String hexInput = kbd.nextLine();
		hexInput = hexInput.toUpperCase();
		System.out.println("You entered: " + hexInput);
		int numberChars = hexInput.length();
		System.out.println("Your input has " + numberChars + " chars");
		
		for(int i = hexInput.length()-1; i >= 0; i--){
			
			System.out.println("Char at index: " + i + " is: " + hexInput.charAt(i));
			if( i == 3){
				decNumber = charToInt(hexInput.charAt(i));
				totalDecimal += decNumber * 1;
				System.out.println("char " + hexInput.charAt(i) + " is decimal " + decNumber + " total number is: " + totalDecimal);
			}
			
			if( i == 2){
				decNumber = charToInt(hexInput.charAt(i));
				totalDecimal += decNumber * 16;
				System.out.println("char " + hexInput.charAt(i) + " is decimal " + decNumber + " total number is: " + totalDecimal);
			}
			
			if( i == 1){
				decNumber = charToInt(hexInput.charAt(i));
				totalDecimal += decNumber * 256;
				System.out.println("char " + hexInput.charAt(i) + " is decimal " + decNumber + " total number is: " + totalDecimal);
			}
			
			if( i == 0){
				decNumber = charToInt(hexInput.charAt(i));
				totalDecimal += decNumber * 4096;
				System.out.println("char " + hexInput.charAt(i) + " is decimal " + decNumber + " total number is: " + totalDecimal);
			}
		}
		
		
		
		kbd.close();
	}
	
	private static int charToInt(char c){
		
		int nbr = 0;
		int b = 0;
		switch (c){
		
		case '0':
			nbr = 0;
			b = 0000;
			break;
			
		case '1':
			nbr = 1;
			b = 0001;
			break;
			
		case '2':
			nbr = 2;
			b = 0010;
			break;
			
		case '3':
			nbr = 3;
			b = 0011;
			break;
			
		case '4':
			nbr = 4;
			b = 0100;
			break;
			
		case '5':
			nbr = 5;
			b = 0101;
			break;
			
		case '6':
			nbr = 6;
			b = 0110;
			break;
			
		case '7':
			nbr = 7;
			b = 0111;
			break;
			
		case '8':
			nbr = 8;
			b = 1000;
			break;
			
		case '9':
			nbr = 9;
			b = 1001;
			break;
			
		case 'A':
			nbr = 10;
			b = 1010;
			break;
			
		case 'B':
			nbr = 11;
			b = 1011;
			break;
			
		case 'C':
			nbr = 12;
			b = 1100;
			break;
			
		case 'D':
			nbr = 13;
			b = 1101;
			break;
			
		case 'E':
			nbr = 14;
			b = 1110;
			break;
			
		case 'F':
			nbr = 15;
			b = 1111;
			break;
		}
		return nbr;
	}
}
