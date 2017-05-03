package temperature;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DecimalFormat;

import javax.swing.*;

/**
 * Shows degrees F and degrees C while using the slider bar
 * Color is RED when hot, and BLUE when !hot 
 * @author dsw
 *
 */

public class Temperature extends JFrame{
	
	// field
	JLabel degreesFLabel = new JLabel();
	JTextField degreesFTextField = new JTextField();
	JPanel colorPanel = new JPanel();
	JScrollBar tempScrollBar = new JScrollBar();
	JLabel degreesCLabel = new JLabel();
	JTextField degreesCTextField = new JTextField();
	boolean ishot = false;
	
	public Temperature(){
		
		//frame constructor
		setTitle("Temperature Equivalence");
		setResizable(false);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent evt){
				exitForm(evt);
			}

		});
		
		getContentPane().setLayout(new GridBagLayout());
		GridBagConstraints gridCon;
		
		degreesFLabel.setText("Fahrenheit");
		gridCon = new GridBagConstraints();
		gridCon.gridx = 0;
		gridCon.gridy = 0;
		gridCon.insets = new Insets(0, 10, 10, 30);
		getContentPane().add(degreesFLabel, gridCon);
		
		degreesFTextField.setText("32.0");
		degreesFTextField.setColumns(10);
		degreesFTextField.setHorizontalAlignment(SwingConstants.CENTER);
		degreesFTextField.setEditable(false);
		degreesFTextField.setBackground(Color.WHITE);
		gridCon = new GridBagConstraints();
		gridCon.gridx = 1;
		gridCon.gridy = 0;
		getContentPane().add(degreesFTextField, gridCon);
		
		degreesCLabel.setText("Celsius");
		gridCon = new GridBagConstraints();
		gridCon.gridx = 0;
		gridCon.gridy = 2;
		getContentPane().add(degreesCLabel, gridCon);
		
		degreesCTextField.setText("0.0");
		degreesCTextField.setColumns(10);
		degreesCTextField.setHorizontalAlignment(SwingConstants.CENTER);
		degreesCTextField.setEditable(false);
		degreesCTextField.setBackground(Color.WHITE);
		gridCon = new GridBagConstraints();
		gridCon.gridx = 1;
		gridCon.gridy = 2;
		getContentPane().add(degreesCTextField, gridCon);
		
		colorPanel.setBackground(Color.BLUE);
		colorPanel.setPreferredSize(new Dimension(280, 40));
		gridCon = new GridBagConstraints();
		gridCon.gridx = 0;
		gridCon.gridy = 1;
		gridCon.gridwidth = 2;
		getContentPane().add(colorPanel, gridCon);
		
		tempScrollBar.setMinimum(-600);
		tempScrollBar.setMaximum(1200 + tempScrollBar.getVisibleAmount());
		tempScrollBar.setBlockIncrement(10);
		tempScrollBar.setUnitIncrement(1);
		tempScrollBar.setValue(320);
		tempScrollBar.setOrientation(JScrollBar.HORIZONTAL);
		tempScrollBar.setPreferredSize(new Dimension(200, 30));
		colorPanel.add(tempScrollBar);
		tempScrollBar.addAdjustmentListener(new AdjustmentListener(){
			public void adjustmentValueChanged(AdjustmentEvent e){
				tempScrollBarAdjustedValueChanged(e);
			}
		});
		
		getContentPane().setBackground(Color.CYAN);		
		setSize(400, 300);
		setLocationRelativeTo(null);
		
	}//end of Constructor
	
	private void tempScrollBarAdjustedValueChanged(AdjustmentEvent e){
		double tempF, tempC;
		//read F and convert to C - divide by ten since tenths place is used
		tempF = (double) tempScrollBar.getValue()/10;
		//System.out.println("tempF = " + tempF);
		//check to see if hot or cold
		if (ishot && tempF < 70){
			ishot = false;
			colorPanel.setBackground(Color.BLUE);
		}
		else if(!ishot && tempF >= 70){
			ishot = true;
			colorPanel.setBackground(Color.RED);
		}
		degreesFTextField.setText(new DecimalFormat("0.0").format(tempF));
		tempC = (tempF - 32.0) * 5.0 / 9.0;
		degreesCTextField.setText(new DecimalFormat("0.0").format(tempC));
		
	}//end of scroll bar handler
	
	private void exitForm(WindowEvent evt) {
		System.exit(0);
		
	}
	
	public static void main(String args[]){
		
		//create Frame
		new Temperature().setVisible(true);		
	}
	

}// end of class
