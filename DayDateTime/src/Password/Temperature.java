package Password;

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
	
	JLabel curELabel = new JLabel();
	JTextField curETextField = new JTextField();
	JPanel colorPanel2 = new JPanel();
	JScrollBar curScrollBar = new JScrollBar();
	JLabel curDLabel = new JLabel();
	JTextField curDTextField = new JTextField();
	
	JLabel speedMPHLabel = new JLabel();
	JTextField speedMPHTextField = new JTextField();
	JPanel colorPanel3 = new JPanel();
	JScrollBar speedScrollBar = new JScrollBar();
	JLabel speedKPHLabel = new JLabel();
	JTextField speedKPHTextField = new JTextField();
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
		
		curELabel.setText("Euros");
		gridCon = new GridBagConstraints();
		gridCon.gridx = 0;
		gridCon.gridy = 3;
		gridCon.insets = new Insets(0, 10, 10, 30);
		getContentPane().add(curELabel, gridCon);
		
		curETextField.setText("0.96");
		curETextField.setColumns(10);
		curETextField.setHorizontalAlignment(SwingConstants.CENTER);
		curETextField.setEditable(false);
		curETextField.setBackground(Color.WHITE);
		gridCon = new GridBagConstraints();
		gridCon.gridx = 1;
		gridCon.gridy = 3;
		getContentPane().add(curETextField, gridCon);
		
		curDLabel.setText("Dollars");
		gridCon = new GridBagConstraints();
		gridCon.gridx = 0;
		gridCon.gridy = 5;
		getContentPane().add(curDLabel, gridCon);
		
		curDTextField.setText("1.0");
		curDTextField.setColumns(10);
		curDTextField.setHorizontalAlignment(SwingConstants.CENTER);
		curDTextField.setEditable(false);
		curDTextField.setBackground(Color.WHITE);
		gridCon = new GridBagConstraints();
		gridCon.gridx = 1;
		gridCon.gridy = 5;
		getContentPane().add(curDTextField, gridCon);
		
		colorPanel2.setBackground(Color.BLUE);
		colorPanel2.setPreferredSize(new Dimension(280, 40));
		gridCon = new GridBagConstraints();
		gridCon.gridx = 0;
		gridCon.gridy = 4;
		gridCon.gridwidth = 2;
		getContentPane().add(colorPanel2, gridCon);
		
		curScrollBar.setMinimum(0);
		curScrollBar.setMaximum(2000 + curScrollBar.getVisibleAmount());
		curScrollBar.setBlockIncrement(10);
		curScrollBar.setUnitIncrement(1);
		curScrollBar.setValue(320);
		curScrollBar.setOrientation(JScrollBar.HORIZONTAL);
		curScrollBar.setPreferredSize(new Dimension(200, 30));
		colorPanel2.add(curScrollBar);
		curScrollBar.addAdjustmentListener(new AdjustmentListener(){
			public void adjustmentValueChanged(AdjustmentEvent e){
				curScrollBarAdjustedValueChanged(e);
			}
		});
		
		speedMPHLabel.setText("Miles per hour");
		gridCon = new GridBagConstraints();
		gridCon.gridx = 0;
		gridCon.gridy = 6;
		gridCon.insets = new Insets(0, 10, 10, 30);
		getContentPane().add(speedMPHLabel, gridCon);
		
		speedMPHTextField.setText("1.0");
		speedMPHTextField.setColumns(10);
		speedMPHTextField.setHorizontalAlignment(SwingConstants.CENTER);
		speedMPHTextField.setEditable(false);
		speedMPHTextField.setBackground(Color.WHITE);
		gridCon = new GridBagConstraints();
		gridCon.gridx = 1;
		gridCon.gridy = 6;
		getContentPane().add(speedMPHTextField, gridCon);
		
		speedKPHLabel.setText("Kilometers per hour");
		gridCon = new GridBagConstraints();
		gridCon.gridx = 0;
		gridCon.gridy = 8;
		getContentPane().add(speedKPHLabel, gridCon);
		
		speedKPHTextField.setText("1.0");
		speedKPHTextField.setColumns(10);
		speedKPHTextField.setHorizontalAlignment(SwingConstants.CENTER);
		speedKPHTextField.setEditable(false);
		speedKPHTextField.setBackground(Color.WHITE);
		gridCon = new GridBagConstraints();
		gridCon.gridx = 1;
		gridCon.gridy = 8;
		getContentPane().add(speedKPHTextField, gridCon);
		
		colorPanel3.setBackground(Color.BLUE);
		colorPanel3.setPreferredSize(new Dimension(280, 40));
		gridCon = new GridBagConstraints();
		gridCon.gridx = 0;
		gridCon.gridy = 7;
		gridCon.gridwidth = 2;
		getContentPane().add(colorPanel3, gridCon);
		
		speedScrollBar.setMinimum(0);
		speedScrollBar.setMaximum(2000 + curScrollBar.getVisibleAmount());
		speedScrollBar.setBlockIncrement(10);
		speedScrollBar.setUnitIncrement(1);
		speedScrollBar.setValue(320);
		speedScrollBar.setOrientation(JScrollBar.HORIZONTAL);
		speedScrollBar.setPreferredSize(new Dimension(200, 30));
		colorPanel3.add(speedScrollBar);
		speedScrollBar.addAdjustmentListener(new AdjustmentListener(){
			public void adjustmentValueChanged(AdjustmentEvent e){
				speedScrollBarAdjustedValueChanged(e);
			}
			
		});
		
		getContentPane().setBackground(Color.CYAN);		
		setSize(400, 300);
		setLocationRelativeTo(null);
		
	}//end of Constructor
	


	private void speedScrollBarAdjustedValueChanged(AdjustmentEvent e) {
		double kph, mph= 0;
		
		mph = (double) speedScrollBar.getValue()/10;
				
		speedMPHTextField.setText(new DecimalFormat("0.0").format(mph));
		kph = (mph * 0.62);
		speedKPHTextField.setText(new DecimalFormat("0.0").format(kph));		
	}
	
	private void curScrollBarAdjustedValueChanged(AdjustmentEvent e) {
		double euro, dollar = 0;
		
		dollar = (double) curScrollBar.getValue()/10;
				
		curDTextField.setText(new DecimalFormat("0.00").format(dollar));
		euro = (dollar * 0.96);
		curETextField.setText(new DecimalFormat("0.00").format(euro));
		
	}
	
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
