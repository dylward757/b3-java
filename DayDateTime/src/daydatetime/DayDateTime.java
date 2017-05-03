package daydatetime;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
//import java.sql.Date;
import java.text.DateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.Timer;

public class DayDateTime extends JFrame{
	private static final long serialVersionUID = 1L;
	
	JTextField dateTextField = new JTextField();
	JTextField timeTextField = new JTextField();
	Timer myTimer;

	public DayDateTime(){
		
		setTitle("Day - Date - Time");
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				exitForm(e);
			}
		});
		
		getContentPane().setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		
		dateTextField.setText("");
		dateTextField.setColumns(20);
		gc.gridx = 0;
		gc.gridy = 0;
		getContentPane().add(dateTextField, gc);
		
		timeTextField.setText("");
		timeTextField.setColumns(20);
		gc.gridx = 0;
		gc.gridy = 1;
		getContentPane().add(timeTextField, gc);
		
		setSize(400, 300);
		setLocationRelativeTo(null);
		
		myTimer = new Timer(1000, new ActionListener(){
			public void actionPerformed(ActionEvent e){
				myTimerActionPerformed(e);
			}
		});
		
		myTimer.start();
	}// end of constructor
	private void myTimerActionPerformed(ActionEvent e) {
		Date today = new Date();
		dateTextField.setText(DateFormat.getDateInstance(DateFormat.FULL).format(today));
		timeTextField.setText(DateFormat.getTimeInstance().format(today));
			
}
		
	
	private void exitForm(WindowEvent e){
		System.exit(0);
	}
}