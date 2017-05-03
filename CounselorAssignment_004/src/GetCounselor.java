import javax.swing.JOptionPane;

public class GetCounselor {

	public static void main(String[] args) {
		
		String lastName = "";
		char firstLetter = ' ';
		String msg = "";
		
		/*
		 * 1. use JOPs at least for the final must be jar'd for grading
		 * 2. JOP ask for last name
		 * 3. determine first letter of last name ok to be in main
		 * 4. pass last name letter to counselorAssgn
		 */
		
		lastName = JOptionPane.showInputDialog("What is your last name?");
		lastName = lastName.toUpperCase();
		firstLetter = lastName.charAt(0);
		msg = "First letter is: " + firstLetter;
		JOptionPane.showMessageDialog(null, msg);
		counselorAssign(firstLetter);
		
	}//end of main
	
	public static void counselorAssign(char initial){
		
		/*
		 * recieve as pass parameter the first letter of last name
		 * use switch case to determine the counselor
		 * JOP show the assigned counselor
		 * A-D Ms. Joplin
		 * E-K Ms. Hull
		 * L-R Ms. Stafford
		 * S-Z Mr. Langley
		 */
		String counselor = "";		
		switch(initial){
		case 'A':
		case 'B':
		case 'C':
		case 'D':
			counselor = "Your counselor is Ms. Joplin";
			JOptionPane.showMessageDialog(null, counselor);
			break;
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'I':
		case 'J':
		case 'K':
			counselor = "Your counselor is Ms. Hull";
			JOptionPane.showMessageDialog(null, counselor);
			break;
		case 'L':
		case 'M':
		case 'N':
		case 'O':
		case 'P':
		case 'Q':
		case 'R':
			counselor = "Your counselor is Ms. Stafford";
			JOptionPane.showMessageDialog(null, counselor);
			break;
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
			counselor = "Your counselor is Mr. Langley";
			JOptionPane.showMessageDialog(null, counselor);
		
		}
		
	}

}//end of GetCounselor
