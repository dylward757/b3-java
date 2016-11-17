import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class StopWatch extends JFrame{
	//optional for us - threading
	private static final long serialVersionUID = 1L;
	
	// field or class or instance vars
	// var stack
	JButton startButton = new JButton();
	JButton stopButton = new JButton();
	JButton resetButton = new JButton();
	JButton exitButton = new JButton();
	JLabel startLabel = new JLabel();
	JLabel stopLabel = new JLabel();
	JLabel resetLabel = new JLabel();
	JLabel elapsedLabel = new JLabel();
	JTextField startTextField = new JTextField();
	JTextField stopTextField = new JTextField();
	JTextField resetTextField = new JTextField();
	JTextField elapsedTextField = new JTextField();
	long startTime;
	long stopTime;
	double elapsedTime;
	boolean timeStarted = false;
	
	// constructor stack -- MAJOR constructor this time
	public StopWatch(String watchTitle){
		
		setTitle(watchTitle);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		getContentPane().setLayout(new GridBagLayout());
		GridBagConstraints gridConstraints = new GridBagConstraints();
		
		startButton.setText("Start Timing");
		gridConstraints.gridx = 0;
		gridConstraints.gridy = 0;
		//gridConstraints.ipadx = 20;
		//gridConstraints.ipady = 20;
		getContentPane().add(startButton, gridConstraints);
		
		startButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				startButtonActionPerformed(e);
			}
		});
		
		startLabel.setText("  Start System Time  ");
		gridConstraints.gridx = 1;
		gridConstraints.gridy = 0;
		//gridConstraints.ipadx = 20;
		//gridConstraints.ipady = 20;
		getContentPane().add(startLabel, gridConstraints);
		
		startTextField.setText("");
		startTextField.setColumns(20);
		gridConstraints.gridx = 2;
		gridConstraints.gridy = 0;
		//gridConstraints.ipadx = 20;
		//gridConstraints.ipady = 20;
		getContentPane().add(startTextField, gridConstraints);
		
		stopButton.setText("Stop Timing");
		gridConstraints.gridx = 0;
		gridConstraints.gridy = 1;
		//gridConstraints.ipadx = 20;
		//gridConstraints.ipady = 20;
		getContentPane().add(stopButton, gridConstraints);
		
		stopButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				stopButtonActionPerformed(e);
			}

		
		});
		
		stopLabel.setText("  Stop System Time  ");
		gridConstraints.gridx = 1;
		gridConstraints.gridy = 1;
		//gridConstraints.ipadx = 20;
		//gridConstraints.ipady = 20;
		getContentPane().add(stopLabel, gridConstraints);
		
		stopTextField.setText("");
		stopTextField.setColumns(20);
		gridConstraints.gridx = 2;
		gridConstraints.gridy = 1;
		//gridConstraints.ipadx = 20;
		//gridConstraints.ipady = 20;
		getContentPane().add(stopTextField, gridConstraints);
		
		resetButton.setText("Reset Timer");
		gridConstraints.gridx = 0;
		gridConstraints.gridy = 2;
		//gridConstraints.ipadx = 20;
		//gridConstraints.ipady = 20;
		getContentPane().add(startButton, gridConstraints);
		
		resetButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				resetButtonActionPerformed(e);
			}

			

		});
		
		startLabel.setText("  Start System Time  ");
		gridConstraints.gridx = 1;
		gridConstraints.gridy = 0;
		//gridConstraints.ipadx = 20;
		//gridConstraints.ipady = 20;
		getContentPane().add(startLabel, gridConstraints);
		
		startTextField.setText("");
		startTextField.setColumns(20);
		gridConstraints.gridx = 2;
		gridConstraints.gridy = 0;
		//gridConstraints.ipadx = 20;
		//gridConstraints.ipady = 20;
		getContentPane().add(startTextField, gridConstraints);
		
		//JButton
		
		exitButton.setText("Close All Watches");
		gridConstraints.gridx = 0;
		gridConstraints.gridy = 3;
		//gridConstraints.ipadx = 20;
		//gridConstraints.ipady = 20;
		getContentPane().add(exitButton, gridConstraints);
		
		//JButton Listener
		
		exitButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				exitButtonActionPerformed(e);
			}
		});
		
		//JLabel
		
		elapsedLabel.setText("  Elapsed Time Seconds  ");
		gridConstraints.gridx = 1;
		gridConstraints.gridy = 3;
		//gridConstraints.ipadx = 20;
		//gridConstraints.ipady = 20;
		getContentPane().add(elapsedLabel, gridConstraints);
		//JTextField
		
		elapsedTextField.setText("");
		elapsedTextField.setColumns(20);
		gridConstraints.gridx = 2;
		gridConstraints.gridy = 3;
		//gridConstraints.ipadx = 20;
		//gridConstraints.ipady = 20;
		getContentPane().add(elapsedTextField, gridConstraints);
	}//end of constructor
	
	
	// method stack
	private void startButtonActionPerformed(ActionEvent e){
		
		//'Handler' code for the start timing button
		
		 startTime = System.currentTimeMillis();
		 Date startDate = new Date();
		 startTextField.setText(startDate.toString());
		 stopTextField.setText("");
		 elapsedTextField.setText("");
		 timeStarted = true;
		
		
	}// end of startButtonActionPerformed
	
	private void stopButtonActionPerformed(ActionEvent e) {
		
		if(timeStarted){
			stopTime = System.currentTimeMillis();
			Date stopDate = new Date();
			stopTextField.setText(stopDate.toString());
			elapsedTime = (stopTime - startTime) / 1000.0;
			elapsedTextField.setText(String.valueOf(elapsedTime));
			timeStarted = false;
		}
		else{
			return;
		}}
		
	private void resetButtonActionPerformed(ActionEvent e){	
	
		
		
	}
	private void exitButtonActionPerformed(ActionEvent e){
		
	}

}// end of class
