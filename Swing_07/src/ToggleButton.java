import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

public class ToggleButton implements ItemListener {
	
	/*
	* This area right below the class declaration is called "The Field"
	* or "class variables" or "field variables"
	* all variables declared here can be used EVERYWHERE inside of this class!
	*/
	int size_wide=400; int size_high=300; int frameX = 1400 ; int frameY = 800;
	JToggleButton toggleButton;
	JPanel totalGUI;
	
	
	
	
	// constructor(s) usually go here
	public ToggleButton(){
		
	}// end of constructor
	
	public ToggleButton (String title){
		
		
		
	}
	
	public ToggleButton (String title, int width, int height){
		
		
	}
	
	
	// all of your methods
	public void createAndShowGUI(){
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("JToggleButton Class Project");
		
		// Create and set up the content pane
		ToggleButton demo = new ToggleButton();
		frame.setContentPane(demo.createContentPane());
		
		frame.setSize(size_wide,  size_high);
		frame.setLocation(frameX, frameY);
		frame.setVisible(true);
		
		//JOptionPane.showMessageDialog(frame, "JFrame is done");
		//JOptionPane.showMessageDialog(null, "Yes, really. The JFrame is done");
		
		
	}

	private JPanel createContentPane() {
		
		totalGUI = new JPanel();
		totalGUI.setBackground(Color.RED);
		
		toggleButton = new JToggleButton("OFF");
		toggleButton.setLocation(145,100);
		toggleButton.setSize(100, 50);
		toggleButton.addItemListener(this);
		totalGUI.add(toggleButton);
		
		
		
		totalGUI.setOpaque(true);
		totalGUI.setLayout(null);
		return totalGUI;
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.SELECTED)
		{
			toggleButton.setText("ON!");
			totalGUI.setBackground(Color.GRAY);
		}
		else
		{
			toggleButton.setText("OFF");
			totalGUI.setBackground(Color.RED);
		}
		
		
	}
	
	
	
}// end of class