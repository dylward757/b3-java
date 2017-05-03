import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GridBag01 {

	
	private JPanel createContentPane(){
		
		JPanel totalGUI = new JPanel();
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		JPanel red = createSquareJPanel(Color.RED, 50);	
		
		c.gridx = 0;
		c.gridy = 0;
		c.fill = GridBagConstraints.NONE;
		mainPanel.add(red, c);
	
		JPanel blue = createSquareJPanel(Color.BLUE, 60);
		c.gridx = 1;
		mainPanel.add(blue, c);
		
		JPanel green = createSquareJPanel(Color.GREEN, 70);
		c.gridx = 2;
		mainPanel.add(green, c);
		
		JPanel orange = createSquareJPanel(Color.ORANGE, 80);
		c.gridx = 3;
		mainPanel.add(orange, c);
		
		JPanel yellow = createSquareJPanel(Color.YELLOW, 90);
		c.gridx = 4;
		mainPanel.add(yellow, c);
		totalGUI.add(mainPanel);
		
		totalGUI.setOpaque(true);
		return totalGUI;
	}

	public static void createAndShowGUI(){
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("GridBagLayout 01");
		
		GridBag01 demo = new GridBag01();
		frame.setContentPane(demo.createContentPane());
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setLocation(50, 200);
		frame.setVisible(true);
	}
	
	private JPanel createSquareJPanel(Color color, int size){
		JPanel tempPanel = new JPanel();
		tempPanel.setBackground(color);
		tempPanel.setMinimumSize(new Dimension(size, size));
		tempPanel.setMaximumSize(new Dimension(size, size));
		tempPanel.setPreferredSize(new Dimension(size, size));		
		
		return tempPanel;
	}
	
	
}// end of class
