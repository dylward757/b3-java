import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GridLayoutExample {
	
	private JPanel createContentPane(){
		JPanel totalGUI = new JPanel();
		
		JPanel mainPanel = new JPanel(new GridLayout(3, 4, 10, 30));
		
		JPanel red = createSquareJPanel(Color.red, 50);
		JPanel blue = createSquareJPanel(Color.blue, 50);
		JPanel green = createSquareJPanel(Color.green, 50);
		JPanel orange = createSquareJPanel(Color.orange, 50);
		JPanel yellow = createSquareJPanel(Color.yellow, 50);
		JPanel pink = createSquareJPanel(Color.pink, 50);
		JPanel cyan = createSquareJPanel(Color.cyan, 50);
		JPanel gray = createSquareJPanel(Color.gray, 50);
		JPanel black = createSquareJPanel(Color.black, 50);
		JPanel magenta = createSquareJPanel(Color.magenta, 50);
		
		mainPanel.add(red);
		mainPanel.add(blue);
		mainPanel.add(green);
		mainPanel.add(orange);
		mainPanel.add(yellow);
		mainPanel.add(pink);
		mainPanel.add(cyan);
		mainPanel.add(gray);
		mainPanel.add(black);
		mainPanel.add(magenta);
		
		return totalGUI;
	}
	
	private JPanel createSquareJPanel(Color color, int size){
		
		JPanel tempPanel = new JPanel();
		tempPanel.setBackground(color);
		tempPanel.setMinimumSize(new Dimension(size, size));
		tempPanel.setMaximumSize(new Dimension(size, size));
		tempPanel.setPreferredSize(new Dimension(size, size));		
		
		return tempPanel;
	}
	
	private static void createAndShowGUI(){
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("Number 5/6: Grid Layour (easy)");
		
		GridLayoutExample demo = new GridLayoutExample();
		frame.setContentPane(demo.createContentPane());
		
		frame.setSize(600, 400);
		frame.setLocation(600, 500);
		//frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		
		createAndShowGUI();

	}

}
