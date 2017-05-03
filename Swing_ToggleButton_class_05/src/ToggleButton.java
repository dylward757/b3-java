import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

public class ToggleButton implements ItemListener{
	
	// field variables
	// everything here works everywhere in this class
	// all methods
	
	JPanel totalGUI;
	
	JToggleButton ToggleButton;
	
	static int frame_width = 400, frame_height = 300;
	static int x, y;
	String push_green = "Push for Green", push_red = "Push for Red";
	
	//typically the constructors go here
	public ToggleButton(){
		
	}
	
	public ToggleButton(String title){
		
	}
	public ToggleButton(int x, int y){
		
		this.x  = x;
		this.y  = y;
		//System.out.println("Yo! x, y: "+this.x+this.y);
	}
	// @Override is part of JavaDocs, later
	@Override
	public void itemStateChanged(ItemEvent e) {
		
		if(e.getStateChange() == ItemEvent.SELECTED){
			ToggleButton.setText(push_red);
			totalGUI.setBackground(Color.GREEN);
		}
		else{
			ToggleButton.setText(push_green);
			totalGUI.setBackground(Color.RED);
		}
		
	} // end of itemStateChanged
	
	public static void createAndShowGUI(){
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("JToggleButton example");
		
		ToggleButton demo = new ToggleButton();
		frame.setContentPane(demo.createContentPane());
		
		frame.setLocation(x, y);		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(frame_width, frame_height);
		frame.setVisible(true);
		//JOptionPane.showMessageDialog(frame, "JFrame has been created!");
		//JOptionPane.showMessageDialog(null, "Yes Really!");
		// return = 
	} // end of create
	
	public JPanel createContentPane(){
		
		totalGUI = new JPanel();
		totalGUI.setBackground(Color.RED);
		totalGUI.setLayout(null);
		
		ToggleButton = new JToggleButton("Push for Green");
		ToggleButton.setLocation(100, 75);
		ToggleButton.setSize(200,100);
		ToggleButton.addItemListener(this);
		totalGUI.add(ToggleButton);
		
		totalGUI.setOpaque(true);
		return totalGUI;
	}

} // end of class

