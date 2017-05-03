package flightrequest;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

/**
 * this project gives us practice creating JScrollPane and JComboBox, this is a JavaDoc
 * @author dsw
 *
 */

public class FlightRequest extends JFrame{
	private static final long serialVersionUID = 1L;
	
	//field
	JLabel citiesLabel = new JLabel();
	JList<String> citiesList = new JList<String>();
	JScrollPane citiesScrollPane = new JScrollPane();
	JLabel seatLabel = new JLabel();
	JComboBox<String> seatComboBox = new JComboBox<String>();
	JLabel mealLabel = new JLabel();
	JComboBox<String> mealComboBox = new JComboBox<String>();
	JButton assignButton = new JButton();
	JButton exitButton = new JButton();
	
	/**
	 * 
	 * @param args
	 */
	
	public static void main(String args[]){
		//construct frame
		new FlightRequest().setVisible(true);
	}
	/**
	 * Basic, no parameter constructor -- JFrame & JComponents created here
	 */
	public FlightRequest(){
		//create Frame
		setTitle("Boise Airport Check-in: Let's Get Started");
		setResizable(false);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				exitForm(e);
			}
		});
		
		getContentPane().setLayout(new GridBagLayout());
		GridBagConstraints gridCon;
		
		citiesLabel.setText("Destination City");
		gridCon = new GridBagConstraints();
		gridCon.gridx = 0;
		gridCon.gridy = 0;
		gridCon.insets = new Insets(10, 0, 0, 0);
		getContentPane().add(citiesLabel, gridCon);
		
		citiesScrollPane.setPreferredSize(new Dimension(150, 100));
		citiesScrollPane.setViewportView(citiesList);
		gridCon = new GridBagConstraints();
		gridCon.gridx = 0;
		gridCon.gridy = 1;
		gridCon.insets = new Insets(10, 10, 10, 10);
		getContentPane().add(citiesScrollPane, gridCon);
		
		seatLabel.setText("Seat Request");
		gridCon = new GridBagConstraints();
		gridCon.gridx = 1;
		gridCon.gridy = 0;
		gridCon.insets = new Insets(10, 0, 0, 0);
		getContentPane().add(seatLabel, gridCon);
		
		seatComboBox.setBackground(Color.WHITE);
		seatComboBox.setPreferredSize(new Dimension(125, 25));
		gridCon = new GridBagConstraints();
		gridCon.gridx = 1;
		gridCon.gridy = 1;
		gridCon.insets = new Insets(10, 10, 0, 10);
		gridCon.anchor = GridBagConstraints.NORTH;
		getContentPane().add(seatComboBox, gridCon);
		
		mealLabel.setText("Meal Request");
		gridCon = new GridBagConstraints();
		gridCon.gridx = 2;
		gridCon.gridy = 0;
		gridCon.insets = new Insets(10, 0, 0, 0);
		getContentPane().add(mealLabel, gridCon);
		
		mealComboBox.setEditable(true);
		gridCon = new GridBagConstraints();
		gridCon.gridx = 2;
		gridCon.gridy = 1;
		gridCon.insets = new Insets(10, 10, 0, 10);
		gridCon.anchor = GridBagConstraints.NORTH;
		getContentPane().add(mealComboBox, gridCon);
		
		assignButton.setText("Make Request");
		gridCon = new GridBagConstraints();
		gridCon.gridx = 1;
		gridCon.gridy = 2;
		gridCon.insets = new Insets(0, 0, 10, 0);
		getContentPane().add(assignButton, gridCon);
		assignButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				assignButtonActionPerformed(e);
			}
		});
		
		exitButton.setText("Exit");
		gridCon = new GridBagConstraints();
		gridCon.gridx = 2;
		gridCon.gridy = 2;
		gridCon.insets = new Insets(0, 0, 10, 0);
		getContentPane().add(exitButton, gridCon);
		exitButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				exitButtonActionPerformed(e);
			}
		});
		
		DefaultListModel<String> citiesListModel = new DefaultListModel<String>();
		citiesListModel.addElement("Pocatello");
		citiesListModel.addElement("Seattle");
		citiesListModel.addElement("Portland");
		citiesListModel.addElement("Salt Lake City");
		citiesListModel.addElement("Denver");
		citiesListModel.addElement("Chicago");
		citiesListModel.addElement("New York");
		citiesListModel.addElement("San Jose");
		citiesListModel.addElement("San Francisco");
		citiesList.setModel(citiesListModel);
		citiesList.setSelectedIndex(0);
		
		//populate seats
		seatComboBox.addItem("Aisle");
		seatComboBox.addItem("Middle");
		seatComboBox.addItem("Window");
		seatComboBox.addItem("Wheel Well");
		seatComboBox.setSelectedIndex(0);
		
		mealComboBox.addItem("Salad");
		mealComboBox.addItem("Steak");
		mealComboBox.addItem("Ice Cream");
		mealComboBox.addItem("Pizza");
		mealComboBox.addItem("Grilled Cheese");
		mealComboBox.addItem("Not Hungry");
		mealComboBox.setSelectedIndex(0);
		
		setSize(600, 250);
		setLocationRelativeTo(null);
		
	}
	/**
	 * Controlled exit when the 'exit' button is clicked
	 * @param e
	 */

	private void exitButtonActionPerformed(ActionEvent e) {
		System.exit(0);
		
	}
	/**
	 * collect info for JOP
	 * @param e
	 */
	private void assignButtonActionPerformed(ActionEvent e) {
		
		String message;
		message = "Destination: " + citiesList.getSelectedValue() + "\n";
		message += "Seat Location: " + seatComboBox.getSelectedItem() + "\n";
		message += "Meal: " + mealComboBox.getSelectedItem() + "\n";
		JOptionPane.showConfirmDialog(null, message, "Your Request", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
		
		
	}
	
	/**
	 * Controlled exit if the user clicks the upper right X box
	 * @param e
	 */
	
	private void exitForm(WindowEvent e) {
		System.exit(0);
		
	}
	
	

}
