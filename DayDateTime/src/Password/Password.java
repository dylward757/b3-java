package Password;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DecimalFormat;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import daydatetime.DayDateTime;
//import temperature.Temperature;



public class Password extends JFrame{

	private JLabel lp = new JLabel("Enter password");
	private JLabel lcp = new JLabel("Confirm password");
	
	private JPasswordField pf1 = new JPasswordField(20);
	private JPasswordField pf2 = new JPasswordField(20);
	
	private JButton bs = new JButton("Submit");
	
	
	
	public Password(){
		super("Password for CHS Comp Sci");
		
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		gc.anchor = GridBagConstraints.WEST;
		gc.insets = new Insets(10, 10, 10, 10);
		gc.gridx = 0;
		gc.gridy = 0;
		add(lp, gc);
		
		gc.gridx = 1;
		add(pf1, gc);
		
		gc.gridx = 0;
		gc.gridy = 1;
		add(lcp,gc);
		
		gc.gridx = 1;
		gc.gridy = 1;
		add(pf2, gc);
		
		gc.gridx = 0;
		gc.gridy = 2;
		gc.gridwidth = 2;
		gc.anchor = GridBagConstraints.CENTER;
		add(bs, gc);
		
		bs.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent event){
				bsActionPerformed(event);
			}
		});
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 300);
		//pack();
		setLocation(260, 437);
		
	}
	
	
	
	private void bsActionPerformed(ActionEvent event){
		char[] pw1 = pf1.getPassword();
		char[] pw2 = pf2.getPassword();
		char[] correctPass = new char[]{'c', 'o', 'm', 'p', 's', 'c', 'i'};
		
		if(pw1.length != pw2.length){
			JOptionPane.showMessageDialog(Password.this, "Passwords lengths do not match");
			clearPasswordFields();
			return;
		}
		
		if(Arrays.equals(pw1, correctPass) && (Arrays.equals(pw1, pw2))){
			JOptionPane.showMessageDialog(Password.this, "Correct Password");
			DayDateTime ddt = new DayDateTime();
			ddt.setVisible(true);
			new Temperature().setVisible(true);
		}else{
			JOptionPane.showMessageDialog(Password.this, "Incorrect Password");
			clearPasswordFields();
		}
	}//close submit handler

	private void clearPasswordFields(){
		
		pf1.setText("");
		pf2.setText("");
		
	}
	
} // end of class
