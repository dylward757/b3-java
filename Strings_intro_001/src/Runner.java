import javax.swing.JOptionPane;

public class Runner {
	/*
	 * must learn essentials of string
	 * 
	 * toUpperCase()/toLowerCase() on AP exam
	 * compareTo()
	 * indexOf() AP exam
	 * charAt() 
	 * endWith() / startWith()
	 * substring() huge, always on AP exam
	 * equals() always on AP exam
	 * charAt()
	 * trim()
	 * valueOf()
	 */

	public static void main(String[] args) {
		//example of toLowerCase
		/*String name = "Dylan";
		System.out.println("Name before is: " + name);
		name = name.toLowerCase();
		System.out.println("Name after is: " + name);
		
		//compareTo
		System.out.println();
		int result;
		String word01 = "Apz";
		String word02 = "App";
		
		result = word01.compareTo(word02);
		
		if (result < 0){
			System.out.println("word01 is lexicographically less than word02");
		}
		else if (result > 0){
			System.out.println("word01 is lexicographically greater than word01");
		}
		else{
			System.out.println("something is wrong");
		}
		
		//equals
		System.out.println();
		String test01 = "test01";
		String test02 = "test02";
		
		if (test01.equals(test02)){
			System.out.println("test01 has the same value as test02");
		}
		else{
			System.out.println("test 01 does not have the same value as test02");
		}
		
		//substring
		//newString = StringName.substring(startIndex, stopIndex);
		//startIndex - inclusive
		//stopIndex - exclusive
		
		System.out.println();
		String fullName = "Dylan Ward";
		String FirstNameChars = "";
		
		FirstNameChars = fullName.substring(0, 2);
		System.out.println(FirstNameChars);
		
		FirstNameChars = fullName.substring(2);//inclusive start
		System.out.println(FirstNameChars);
		
		//charAt, indexOf, substring
		
		System.out.println();
		
		String myWord = "Java";
		String mySentence = "I love Java";
		String letter = "";
		String newSentence = "";
		
		for (int i = 0; i < mySentence.length(); i++){
			
			System.out.println("index = " + i + " character is " + mySentence.charAt(i));
			newSentence= newSentence + mySentence.charAt(i);
			
		}
		
		System.out.println("\nnewWord = " + newSentence);*/
		
		String RevString = "";
		String forward = JOptionPane.showInputDialog("What word would you like to reverse?");
		StringBuilder reverse = new StringBuilder();
		reverse.append(forward);
		reverse = reverse.reverse();
		
		for (int i = 0; i < reverse.length(); i++){
			RevString = RevString + reverse.charAt(i);
		}
		
		JOptionPane.showMessageDialog(null, RevString);
		
		
		
	}//end of main

	
}  //end of class
