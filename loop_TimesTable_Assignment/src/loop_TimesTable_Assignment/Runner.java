package loop_TimesTable_Assignment;

import javax.swing.JOptionPane;

/*
 * 1. write a times table program
 * 2. ask user to input a number (syso)
 * 3. if the user enters 10, the 10 times table is displayed
 * 4. go to the number ^2
 */



public class Runner {
	public static void main(String[] args) {
		int sum, i;
		String msg = "";
		msg = JOptionPane.showInputDialog("What number would you like to know the times table of?");
		i = Integer.parseInt(msg);
		
		for (sum = 0; sum <= i; sum++){
			System.out.println(i + " * " + sum + " = " + i*sum);
		}
		
		
		
	}
	
}
