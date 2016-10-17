/*
 * GRADE
 * Get working
 * JOP for success and failure
 * tell if username or password failed
 */


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextFieldExample implements ActionListener{

	//field variables
	
	JButton loginButton;
	JTextField passwd, userNameField;
	JLabel titleLabel, usernameLabel, passwordLabel, userLabel, passLabel;
	JPanel textPanel, panelForTextFields, completionPanel;
	String panel_title = "Login Please";
	
	public int intPractice = 10;
	public boolean loginCorrect = false;
	
	
	//constructor stack
	
	public int getIntPractice() {
		return intPractice;
	}

	public void setIntPractice(int intPractice) {
		if(intPractice >0 && intPractice <= 100){
			this.intPractice = intPractice;
		}
	}

	public boolean isLoginCorrect() {
		return loginCorrect;
	}

	public void setLoginCorrect(boolean loginCorrect) {
		this.loginCorrect = loginCorrect;
	}

	public TextFieldExample(){
		
	}
	
	public TextFieldExample(String panel_title){
		this.panel_title = panel_title;
	}
	
	
	//methods
	
	public static void createAndShowGUI(){
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("JTextFiel Login");
		
		TextFieldExample demo = new TextFieldExample();
		frame.setContentPane(demo.createContentPane());
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setSize(400, 200);
		frame.setVisible(true);
	}
	public JPanel createContentPane(){
		JPanel totalGUI = new JPanel();
		totalGUI.setBackground(Color.PINK);
		totalGUI.setOpaque(true);
		
		titleLabel = new JLabel(panel_title);
		titleLabel.setLocation(0, 0);
		titleLabel.setSize(290, 30);
		titleLabel.setHorizontalAlignment(0);
		totalGUI.add(titleLabel);
		
		usernameLabel = new JLabel();
		
		
		textPanel = new JPanel();
		textPanel.setBackground(Color.PINK);
		textPanel.setLayout(null);
		textPanel.setLocation(10, 35);
		textPanel.setSize(80, 80);
		totalGUI.add(textPanel);
		
		usernameLabel = new JLabel("Username");
		//usernameLabel.
		
		passwd = new JTextField(8);
		passwd.setLocation(0, 40);
		passwd.setSize(100, 30);
		panelForTextFields.add(passwd);
		
		completionPanel = new JPanel();
		completionPanel.setLayout(null);
		completionPanel.setBackground(Color.PINK);
		completionPanel.setSize(0,0);
		
		loginButton = new JButton("Login");
		loginButton.setLocation(130, 120);
		loginButton.setSize(80,30);
		loginButton.addActionListener(this);
		totalGUI.add(loginButton);
		
		
		
		
		return totalGUI;	
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		
		
		if(e.getSource() == loginButton){
			testUserName();
		}//end if
		if(e.getSource() == loginButton){
			testNamePassword();
		}//end if
	}//end actionPerformed
	public void testUserName(){
		boolean nameGood;
		if (userNameField.getText().trim().compareTo("Dylan") == 0){
			userLabel.setForeground(Color.GREEN);
			userLabel.setText("Correct");
			nameGood = true;
		} //end if
		else{
			userLabel.setForeground(Color.BLUE);
			userLabel.setText("Wrong");
			nameGood = false;
		} //end else
		
	}//end testNamePassword
	public void testNamePassword(){
		
		boolean nameGood = false, passGood;
		
		if (passwd.getText().trim().compareTo("CHS") == 0){
			passLabel.setForeground(Color.GREEN);
			passLabel.setText("Correct");
			passGood = true;
		} //end if
		else{
			passLabel.setForeground(Color.BLUE);
			passLabel.setText("Wrong");
			passGood = false;
			
		} //end else
		
		showNamePassMatch(nameGood, passGood);
	}//end testNamePassword
	public void showNamePassMatch(boolean nameTF, boolean passTF){
		
		if(nameTF == true && passTF == true){
			loginCorrect = true;
		}else{
			loginCorrect = false;
		}
		
	}//end of showNamePassMatch
}//end of class
