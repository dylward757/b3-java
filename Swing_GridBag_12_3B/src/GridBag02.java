import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GridBag02 {


	private JPanel createContentPane(){
		
		JPanel totalGUI = new JPanel();
		//totalGUI.setBackground(Color.CYAN);
		
		JPanel mainPanel = new JPanel(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		JPanel red = createSquareJPanel(Color.RED, 80);
		c.gridx = 0;
		c.gridy = 0;
		c.fill = GridBagConstraints.NONE;
		mainPanel.add(red, c);
		
		JPanel blue = createSquareJPanel(Color.BLUE, 80);
		c.gridx = 1;
		mainPanel.add(blue, c);
		
		JPanel orange = createSquareJPanel(Color.ORANGE, 40);
		c.gridx = 2;
		c.fill = GridBagConstraints.VERTICAL;
		mainPanel.add(orange, c);
		
		JPanel pink = createSquareJPanel(Color.PINK, 80);
		c.gridx = 3;
		c.gridheight = 3;
		mainPanel.add(pink, c);
		
		JPanel green = createSquareJPanel(Color.GREEN, 80);
		c.gridx = 0;
		c.gridy = 1;
		c.gridheight = 1;
		c.fill = GridBagConstraints.NONE;
		mainPanel.add(green, c);
		
		JPanel yellow = createSquareJPanel(Color.YELLOW, 40);
		c.gridy = 2;
		c.fill = GridBagConstraints.HORIZONTAL;
		mainPanel.add(yellow, c);
		
		JPanel cyan = createSquareJPanel(Color.CYAN, 80);
		c.gridy = 3;
		c.gridwidth = 3;
		mainPanel.add(cyan, c);
		
		JPanel black = createSquareJPanel(Color.BLACK, 40);
		c.gridx = 3;
		c.gridwidth = 1;
		c.anchor = GridBagConstraints.SOUTHWEST;
		c.fill = GridBagConstraints.NONE;
		mainPanel.add(black, c);
		
		JPanel gray = createSquareJPanel(Color.GRAY, 40);
		c.gridx = 1;
		c.gridy = 1;
		c.gridheight = 2;
		c.gridwidth = 2;
		c.anchor = GridBagConstraints.CENTER;
		c.ipadx = 40;
		c.ipady = 40;
		mainPanel.add(gray, c);
		
		
		totalGUI.add(mainPanel);
		totalGUI.setOpaque(true);
		return totalGUI;
	}

	public static void createAndShowGUI(){
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("GridBagLayout 02");
		
		GridBag02 demo = new GridBag02();
		frame.setContentPane(demo.createContentPane());
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setLocation(500, 200);
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
}//end of class
