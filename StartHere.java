
public class StartHere {
		/*
		 * Caesar Cipher - the first known cryptography
		 * to code:
		 * 
		 * 1. determine a key -- an int used to offset letters in the alphabet
		 * 2. take each char in your plain text msg, add the offset key to get the coded message
		 * for example key = 2 plain text is 'abc' then coded message is 'cdf'
		 * to decode the msg subtract 2 from the coded message
		 * 
		 * 
		 * Q1 how do we deal with spaces? hint: use an if test for spaces
		 * Q2 how do we wrap at the end of the alphabet?
		 * Q2 hint: consider an if statement that > 25 then subtract 25
		 * example z + 2 is 25 + 2 = 28 crash
		 * so if (>26) do result - 25 that is 28 - 25 = 2 = b
		 */
	public static void main(String[] args) {
		
		String alpha = " abcdefghijklmnopqrstuvwxyz0123456789";
		
		int key = 2;
		String plainTxt = "I love Zebras78";
		String codedTxt = "";
		
		char shiftedAlpha = ' ';
		int alphaIndex = 0;
		
		plainTxt = plainTxt.toLowerCase();
		//System.out.println(plainTxt);
		
		//test shift the first char by the key amount
		//i shifted by 2 should be the key\
		if (key<0){
			key = 36 -(-key%36);
			}
		
		for (int i = 0; i < plainTxt.length(); i++){
			//System.out.println("First letter of " + plainTxt + " is " + plainTxt.charAt(i));
			//System.out.println("Alpha index of above is " + alpha.indexOf(i)); //should be 8
			alphaIndex = alpha.indexOf(plainTxt.charAt(i));
			
			//System.out.println("Shifted alpha is " + shiftedAlpha);
			codedTxt = codedTxt + shiftedAlpha;	
		}//end of coding sequence
		
		System.out.println("Plain text message was: " + plainTxt);
		System.out.println("Using this key: " + key);
		System.out.println("Results in this coded text: " + codedTxt);
		
		
	}//end of main

}//end of class
