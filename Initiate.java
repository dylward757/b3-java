package loop_while_dowhile;

public class Initiate {

	public static void main(String[] args) {
		
		/*
		 * demo of while loop
		 * while (boolean_condition){
		 * execute this code as long as the boolean condition is TRUE
		 * Note: if the boolean condition starts as false the code will never run
		 * }
		 */
		
		int counter = 0;
		int remain = 0;
		while (counter < 10){
			remain = counter % 3;
			if (remain == 0){
				System.out.println("counter = " + counter);
			}
			counter++;
		}
		
		/*
		 * do{
		 * 
		 * code
		 * 
		 * } while (boolean condition is true)
		 * do while always runs at least once
		 */
		
		int base = 2;
		do {
			System.out.println("number = " + base);
			base*=2;
		}while (base <513);
		
	}

}
