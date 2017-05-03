import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class FlowLayoutExample {
	
	private JPanel createSquareJPanel(Color color, int size){
		
		JPanel tempPanel = new JPanel();
		tempPanel.setBackground(color);
		tempPanel.setMinimumSize(new Dimension(size, size));
		tempPanel.setMaximumSize(new Dimension(size, size));
		tempPanel.setPreferredSize(new Dimension(size, size));
		
		
		return tempPanel;
	}
	
	private JPanel createContentPane() {
		JPanel totalGUI = new JPanel();
	
		JPanel mainPanel = new JPanel(new FlowLayout(FlowLayout.LEADING));
		mainPanel.setPreferredSize(new Dimension(60, 280));
		
		JPanel red = createSquareJPanel(Color.RED, 50);
		JPanel blue = createSquareJPanel(Color.BLUE, 50);
		JPanel green = createSquareJPanel(Color.GREEN, 50);
		JPanel orange = createSquareJPanel(Color.ORANGE, 50);
		JPanel yellow = createSquareJPanel(Color.YELLOW, 50);
		
		mainPanel.add(red);
		mainPanel.add(blue);
		mainPanel.add(green);
		mainPanel.add(orange);
		mainPanel.add(yellow);
		
		totalGUI.add(mainPanel);
		
		return totalGUI;
	}
	
	private static void createAndShowGUI(){
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("FlowLayout - easiest layout manager");
		
		FlowLayoutExample demo = new FlowLayoutExample();
		frame.setContentPane(demo.createContentPane());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 300);
		frame.setLocation(600, 100);
		//frame.pack();
		frame.setVisible(true);
		
	}



	public static void main(String[] args) {
		/*
		 * NTS: static means use this method without instantiating an object (without a class object)
		 * always in main to start a program, nearly in all math functions
		 */
		
		//FlowLayoutExample flow = new FlowLayoutExample();
		
		
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				//flow.createAndShowGUI();
				createAndShowGUI();
			}
		});

	}

}
