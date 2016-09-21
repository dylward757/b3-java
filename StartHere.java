package loopWhileAssignment;

import javax.swing.JOptionPane;

public class StartHere {

	public static void main(String[] args) {
		
		/*
		 * graded
		 * JOPed and JARed -- no syso
		 * using a JOP ask the user to enter a number (int)
		 * test if it is even or odd
		 * tell the user "your number is even" or "your number is odd"
		 * ask "would you like to go again (y or n)"
		 * if no, "thanks, goodbye"
		 * if yes loop again to ask for another number
		 */
		
		String i = "";
		String yn = "yes";
		int mod = 0;
		int result = 0;
		
		while (yn.equals("yes")){
			i = JOptionPane.showInputDialog(null, "Please enter a whole number");
			mod = Integer.parseInt(i);
			result = mod % 2;
			if (result == 1){
				JOptionPane.showMessageDialog(null, "Your number is odd");
			}
			else if (result == 0){
				JOptionPane.showMessageDialog(null, "Your number is even");
			}
			else{
				JOptionPane.showMessageDialog(null, "Please enter a valid number");
			}
			yn = JOptionPane.showInputDialog("Would you like to choose another number?(yes or no)");
		}
	}
}