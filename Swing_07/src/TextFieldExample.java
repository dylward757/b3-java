import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextFieldExample implements ActionListener {

	// field vars here -- all vars here can be used
	// *everywhere* inside of this class!
	// class variable stack
	// instance variables, class variables, field variables

	JPanel totalGUI, textPanel, panelForTextFields, result;
	JLabel userName, password, panelTitle, userResult, passResult, resultLabel;
	JTextField userField, passField;
	JButton loginButton;

	public boolean loginSuccess = false;

	private int testInt = 25;

	// constructor stack

	// methods

	public int getTestInt() {
		// add check code
		// for example, make sure code has been updated
		// before allowing this get
		return testInt;
	}

	public void setTestInt(int testInt) {
		// CRITICAL -- don't allow any set
		// but check, control, make sure the set is valid
		// example for grades
		if (testInt >= 0 && testInt <= 100) {
			this.testInt = testInt;

		} else {
			// syso "Wrong value, please try again"
		}
	}

	public void createAndShowGUI() {

		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("Login Portal");

		TextFieldExample demo = new TextFieldExample();
		frame.setContentPane(demo.createContentPane());

		frame.setSize(400, 300);
		frame.setLocation(200, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);

		frame.setVisible(true);
	}

	private JPanel createContentPane() {

		totalGUI = new JPanel();
		totalGUI.setBackground(Color.PINK);

		panelTitle = new JLabel("Pretty please login!");
		panelTitle.setLocation(120, 0);
		panelTitle.setSize(150, 40);
		panelTitle.setHorizontalAlignment(4);
		totalGUI.add(panelTitle);

		// create a panel, add components to the panel, add the panel to
		// totalGUI

		// Creation of a Panel to contain the JLabels
		textPanel = new JPanel();
		textPanel.setLayout(null);
		textPanel.setSize(120, 150);
		textPanel.setLocation(10, 35);
		textPanel.setBackground(Color.PINK);

		totalGUI.add(textPanel);

		// add JLabel for userName
		userName = new JLabel("User Name:");
		userName.setLocation(5, 0);
		userName.setSize(100, 40);
		userName.setForeground(Color.black);
		userName.setHorizontalAlignment(4);
		textPanel.add(userName);

		password = new JLabel("Password:");
		password.setLocation(0, 42);
		password.setSize(100, 40);
		password.setHorizontalAlignment(4);
		password.setForeground(Color.black);
		textPanel.add(password);

		panelForTextFields = new JPanel();
		panelForTextFields.setLayout(null);
		panelForTextFields.setBackground(Color.PINK);
		panelForTextFields.setSize(150, 70);
		panelForTextFields.setLocation(120, 40);
		totalGUI.add(panelForTextFields);

		userField = new JTextField(8);
		userField.setLocation(10, 0);
		userField.setSize(150, 35);
		panelForTextFields.add(userField);

		passField = new JTextField(8);
		passField.setLocation(10, 38);
		passField.setSize(150, 35);
		panelForTextFields.add(passField);

		result = new JPanel();
		result.setLayout(null);
		result.setBackground(Color.PINK);
		result.setSize(80, 70);
		result.setLocation(280, 40);
		totalGUI.add(result);

		userResult = new JLabel("Wrong!");
		userResult.setVisible(false);
		userResult.setLocation(-35, 0);
		userResult.setSize(100, 40);
		userResult.setForeground(Color.red);
		userResult.setHorizontalAlignment(4);
		result.add(userResult);

		passResult = new JLabel("Wrong!");
		passResult.setVisible(false);
		passResult.setLocation(-35, 35);
		passResult.setSize(100, 40);
		passResult.setHorizontalAlignment(4);
		passResult.setForeground(Color.red);
		result.add(passResult);

		loginButton = new JButton("Login");
		loginButton.setLocation(160, 120);
		loginButton.setBackground(Color.lightGray);
		loginButton.setSize(80, 30);
		loginButton.addActionListener(this);
		totalGUI.add(loginButton);

		totalGUI.setOpaque(true);
		return totalGUI;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == loginButton) {

			handleLogin();
		}

	}

	public void handleLogin() {

		// local variable or method variable that describes the "scope"
		boolean nameIsGood = false, passIsGood = false;

		if (userField.getText().trim().compareTo("Dylan") == 0) {
			userResult.setVisible(true);
			userResult.setForeground(Color.green);
			userResult.setText("Correct!");
			nameIsGood = true;

		} else {
			userResult.setVisible(true);
			userResult.setForeground(Color.red);
			userResult.setText("Wrong!");
			nameIsGood = false;

		}

		if (passField.getText().trim().compareTo("CHS") == 0) {
			passResult.setVisible(true);
			passResult.setForeground(Color.green);
			passResult.setText("Correct!");
			passIsGood = true;

		} else {
			passResult.setVisible(true);
			passResult.setForeground(Color.red);
			passResult.setText("Wrong!");
			passIsGood = false;

		}

		if (nameIsGood == true && passIsGood == true) {

			showResultJFrame("Login was successful!");
			ToggleButton myToggleButton = new ToggleButton();
			myToggleButton.createAndShowGUI();

			// JOptionPane.showMessageDialog(null, "Login is successful!");
		} else {
			
			showResultJFrame("Sorry, login failed!");
			
			// JOptionPane.showMessageDialog(null, "Login failed!");
		}

	} // end of handleLogin

	
		


	private void showResultJFrame(String theResults) {
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame resultFrame = new JFrame("Login Results");
		resultFrame.setSize(400, 300);
		resultFrame.setLocation(625, 200);
		resultFrame.setVisible(true);
		
		JLabel resultLabel = new JLabel(theResults);
		
		resultFrame.add(resultLabel);
		
		

	}

	public void LoginResults(boolean nameTF, boolean passTF) {

	}

}// end of class