import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Runner {

	public static void main(String[] args) {

		/*
		 * Graded: Making JFrames (aka windows)
		 * JOP for questions and jar
		 * 1. ask for a title
		 * 2. ask for a width
		 * 3. ask for a height
		 * 4. ask if they want another window
		 * 5. if no then perform a graceful exit
		 */
		
		String title = "";
		String i = "";
		String yn = "yes";
		String width = "";
		String height = "";
		int widthInt = 0;
		int heightInt  = 0;
		
		while (yn.equals("yes")){
			title = JOptionPane.showInputDialog("Please enter a title for your JFrame");
			width = JOptionPane.showInputDialog("Please enter a number for the width");
			height = JOptionPane.showInputDialog("Please enter a number for the height");
		
			widthInt = Integer.parseInt(width);
			heightInt = Integer.parseInt(height);
		
			createJFrame(title, widthInt, heightInt);
			yn = JOptionPane.showInputDialog("Would you like to create another JFrame? (yes or no)");
		}

	}

	//this is a "method" in Java
	private static void createJFrame(String localTitle, int w, int h){
		
		JFrame frame = new JFrame("Hey! I made a JFrame!");
		
		
		frame.setSize(w, h);
		frame.setVisible(true);
		
	}	
}
