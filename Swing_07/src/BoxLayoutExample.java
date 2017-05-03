import java.awt.Color;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BoxLayoutExample {

	//field and class or instance vars
	
	
	//constructor stack
	
	
	//methods
	
	public void createAndShowGUI(){
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("BoxLayout for Experimentation");
		
		BoxLayoutExample demo = new BoxLayoutExample();
		frame.setContentPane(demo.createContentPane());
				
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 300);
		frame.setLocation(800, 100);
		frame.setVisible(true);
	}
	
	private JPanel createContentPane(){
		
		JPanel totalGUI = new JPanel();
		
		//line axis sets left right, page axis sets top bottom
		
		totalGUI.setLayout(new BoxLayout(totalGUI, BoxLayout.PAGE_AXIS));
		
		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.RED);
		redPanel.setMinimumSize(new Dimension(50, 50));
		redPanel.setPreferredSize(new Dimension(50, 50));
		totalGUI.add(redPanel);
		
		//first spacer, sets a spacer 10px wide
		
		totalGUI.add(Box.createRigidArea(new Dimension(20, 20)));
		
		JPanel yellowPanel = new JPanel();
		yellowPanel.setBackground(Color.YELLOW);
		yellowPanel.setPreferredSize(new Dimension(50,50));
		totalGUI.add(yellowPanel);
		
		totalGUI.add(Box.createHorizontalGlue());
		
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.GREEN);
		greenPanel.setPreferredSize(new Dimension(50, 50));
		totalGUI.add(greenPanel);
		
		Dimension minSize = new Dimension(10, 50);
		Dimension prefSize = new Dimension(10, 50);
		Dimension maxSize = new Dimension(Short.MAX_VALUE, 50);
		totalGUI.add(new Box.Filler(minSize, prefSize, maxSize));
		
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.BLUE);
		bluePanel.setPreferredSize(new Dimension(50, 50));
		totalGUI.add(bluePanel);
		
		return totalGUI;
		
	}
	
}
