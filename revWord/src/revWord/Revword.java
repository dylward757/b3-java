package revWord;
import java.io.File;
import java.util.Scanner;

public class Revword {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your word");
		String word = sc.nextLine();
		String test = "";
		
		//System.out.println(word.charAt(word.length()-1));
		//Scanner chop = new Scanner(sc.next());
		
		for(int i = word.length()-1; i > -1; i--){
			//System.out.println(word.charAt(i));
			test = test+word.charAt(i);
		}
	
	    sc.close();
		System.out.println("Your reversed word is = " + test);
	}

}

