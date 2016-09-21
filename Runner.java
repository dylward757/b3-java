import javax.swing.JFrame;

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
		
		String title = "Hello!";
		int width = 800;
		int height = 600;
		createJFrame(title, width, height);
		

	}

	//this is a "method" in Java
	private static void createJFrame(String localTitle, int w, int h){
		
		JFrame frame = new JFrame("Hey! I made a JFrame!");
		
		
		frame.setSize(w, h);
		frame.setVisible(true);
		
	}	
}
