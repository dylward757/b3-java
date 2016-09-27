import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/*
 * 1. finish red, blue, yellow, green panels
 * 2. Add numbers in the center of each colored panel
 * red has 1
 * blue has 2
 * yellow has 3
 * green has 4
 */

public class LabelExample {
	
	private static void createAndShowGUI(){
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("JLabels");
		
		//create and set up the content pane.
		LabelExample demo = new LabelExample();
		frame.setContentPane(demo.createContentPane());
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 150);
		frame.setVisible(true);
		
	}
	
	private Container createContentPane() {
		
		// we create a bottom JPanel to place everything on
		JPanel totalGUI = new JPanel();
		totalGUI.setLayout(null);
		
		JPanel textPanel = new JPanel();
		textPanel.setLayout(null);
		textPanel.setBackground(Color.DARK_GRAY);
		textPanel.setLocation(10, 5);
		textPanel.setSize(260, 35);
		totalGUI.add(textPanel);
		
		JLabel redLabel = new JLabel("Red");
		redLabel.setForeground(Color.RED);
		redLabel.setLocation(0, 0);
		redLabel.setSize(50, 50);
		redLabel.setHorizontalAlignment(0);
		textPanel.add(redLabel);
		
		JLabel blueLabel = new JLabel("Blue");
		blueLabel.setForeground(Color.BLUE);
		blueLabel.setLocation(70, 0);
		blueLabel.setSize(50, 50);
		blueLabel.setHorizontalAlignment(0);
		textPanel.add(blueLabel);
		
		JLabel yellowLabel = new JLabel("Yellow");
		yellowLabel.setForeground(Color.YELLOW);
		yellowLabel.setLocation(140, 0);
		yellowLabel.setSize(50, 50);
		yellowLabel.setHorizontalAlignment(0);
		textPanel.add(yellowLabel);
		
		JLabel greenLabel = new JLabel("Green");
		greenLabel.setForeground(Color.GREEN);
		greenLabel.setLocation(210, 0);
		greenLabel.setSize(50, 50);
		greenLabel.setHorizontalAlignment(0);
		textPanel.add(greenLabel);
		
		JPanel PanelforPanels = new JPanel();
		PanelforPanels.setLayout(null);
		PanelforPanels.setBackground(Color.CYAN);
		PanelforPanels.setLocation(10, 45);
		PanelforPanels.setSize(260, 60);
		totalGUI.add(PanelforPanels);
		
		JLabel redNum = new JLabel("1");
		redNum.setForeground(Color.BLACK);
		redNum.setLocation(0,0);
		redNum.setSize(50, 50);
		redNum.setHorizontalAlignment(0);
		PanelforPanels.add(redNum);
		
		JPanel redPanel = new JPanel();
		redPanel.setLayout(null);
		redPanel.setBackground(Color.RED);
		redPanel.setLocation(0, 0);
		redPanel.setSize(50, 60);
		PanelforPanels.add(redPanel);
		
		JLabel blueNum = new JLabel("2");
		blueNum.setForeground(Color.BLACK);
		blueNum.setLocation(70,0);
		blueNum.setSize(50, 50);
		blueNum.setHorizontalAlignment(0);
		PanelforPanels.add(blueNum);
		
		JPanel bluePanel = new JPanel();
		bluePanel.setLayout(null);
		bluePanel.setBackground(Color.BLUE);
		bluePanel.setLocation(70, 0);
		bluePanel.setSize(50, 60);
		PanelforPanels.add(bluePanel);
		
		JLabel yellowNum = new JLabel("3");
		yellowNum.setForeground(Color.BLACK);
		yellowNum.setLocation(140,0);
		yellowNum.setSize(50, 50);
		yellowNum.setHorizontalAlignment(0);
		PanelforPanels.add(yellowNum);
		
		JPanel yellowPanel = new JPanel();
		yellowPanel.setLayout(null);
		yellowPanel.setBackground(Color.YELLOW);
		yellowPanel.setLocation(140, 0);
		yellowPanel.setSize(50, 60);
		PanelforPanels.add(yellowPanel);
		
		JLabel greenNum = new JLabel("4");
		greenNum.setForeground(Color.BLACK);
		greenNum.setLocation(210,0);
		greenNum.setSize(50, 50);
		greenNum.setHorizontalAlignment(0);
		PanelforPanels.add(greenNum);
		
		JPanel greenPanel = new JPanel();
		greenPanel.setLayout(null);
		greenPanel.setBackground(Color.GREEN);
		greenPanel.setLocation(210, 0);
		greenPanel.setSize(50, 60);
		PanelforPanels.add(greenPanel);
		
		
		
		
		totalGUI.setOpaque(true);
		return totalGUI;
		
	}

	public static void main(String[] args){
		
		//schedule a job for the event-dispatching thread:
		
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				createAndShowGUI();
			}
		});
		
	}

}
