import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Panel_example {
	
	/*
	 * Graded
	 * 1. place 4 colored JPanels on the JFrame + 2 more
	 * 2. use 4 different colors
	 * 3. equally divide the JFrame
	 */

	public static void main(String[] args) {
		
		createAndShowGUI();
		
	}
	
	private static void createAndShowGUI(){
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("There are 3 JPanels in here!");
		
		Panel_example demo = new Panel_example();
		frame.setContentPane(demo.createContentPane());
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 600);
		frame.setVisible(true);
		
	}

	public JPanel createContentPane() {
		
		JPanel totalGUI = new JPanel();
		
		totalGUI.setLayout(null);
		
		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.red);
		redPanel.setLocation(0, 0);
		redPanel.setSize(300, 300);
		totalGUI.add(redPanel);
		
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.blue);
		bluePanel.setLocation(300, 0);
		bluePanel.setSize(300, 300);
		totalGUI.add(bluePanel);
		
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.green);
		greenPanel.setLocation(300, 300);
		greenPanel.setSize(300, 300);
		totalGUI.add(greenPanel);
		
		JPanel grayPanel = new JPanel();
		grayPanel.setBackground(Color.gray);
		grayPanel.setLocation(0, 300);
		grayPanel.setSize(300, 300);
		totalGUI.add(grayPanel);
		
		totalGUI.setOpaque(true);
		return totalGUI;
	}

}
