
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Spring;
import javax.swing.SwingUtilities;

public class Calendar_Example extends JFrame {
	private static final long serialVersionUID = 1L;

	JLabel yearLabel = new JLabel("");
	JLabel monthLabel = new JLabel("");
	JLabel dayLabel = new JLabel("");
	JLabel hourLabel = new JLabel("");
	JLabel minuteLabel = new JLabel("");
	JLabel secondLabel = new JLabel("");

	JTextField yearField = new JTextField();
	JTextField monthField = new JTextField();
	JTextField dayField = new JTextField();
	JTextField hourField = new JTextField();
	JTextField minuteField = new JTextField();
	JTextField secondField = new JTextField();

	JButton yearButton = new JButton(" Get Year ");
	JButton monthButton = new JButton(" Get Month ");
	JButton dayButton = new JButton(" Get Day ");
	JButton hourButton = new JButton(" Get Hour ");
	JButton minuteButton = new JButton(" Get Minute ");
	JButton secondButton = new JButton(" Get Second ");
	JButton resetButton = new JButton("Reset All");

	String year = new String();
	String month = new String();
	String day = new String();
	String hour = new String();
	String minute = new String();
	String second = new String();
	
	

	// change ints into strings

	private Calendar_Example() {
		super("Calendar");

		setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();

		int width = 400;
		int height = 200;
		setSize(width, height);
		setLocation(100, 100);
		setDefaultLookAndFeelDecorated(true);

		yearField.setText("");
		yearField.setColumns(20);
		constraints.gridx = 1;
		constraints.gridy = 0;
		add(yearField, constraints);
		constraints.gridx = 0;
		constraints.gridwidth = 1;
		add(yearButton, constraints);

		// getDate();

		yearButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				yearButtonActionPerformed(e);
			}
		});

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setLocationRelativeTo(null);

		monthField.setText("");
		monthField.setColumns(20);
		constraints.gridx = 1;
		constraints.gridy = 1;
		add(monthField, constraints);
		constraints.gridwidth = 1;
		constraints.gridx = 0;
		add(monthButton, constraints);

		monthButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				monthButtonActionPerformed(e);
			}
		});

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setLocationRelativeTo(null);

		dayField.setText("");
		dayField.setColumns(20);
		constraints.gridx = 1;
		constraints.gridy = 2;
		add(dayField, constraints);
		constraints.gridwidth = 1;
		constraints.gridx = 0;
		add(dayButton, constraints);

		dayButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dayButtonActionPerformed(e);
			}
		});

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setLocationRelativeTo(null);

		hourField.setText("");
		hourField.setColumns(20);
		constraints.gridx = 1;
		constraints.gridy = 3;
		add(hourField, constraints);
		constraints.gridwidth = 1;
		constraints.gridx = 0;
		add(hourButton, constraints);

		hourButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				hourButtonActionPerformed(e);
			}
		});

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setLocationRelativeTo(null);

		minuteField.setText("");
		minuteField.setColumns(20);
		constraints.gridx = 1;
		constraints.gridy = 4;
		add(minuteField, constraints);
		constraints.gridwidth = 1;
		constraints.gridx = 0;
		add(minuteButton, constraints);

		minuteButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				minuteButtonActionPerformed(e);
			}
		});

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setLocationRelativeTo(null);

		secondField.setText("");
		secondField.setColumns(20);
		constraints.gridx = 1;
		constraints.gridy = 5;
		add(secondField, constraints);
		constraints.gridwidth = 1;
		constraints.gridx = 0;
		add(secondButton, constraints);

		secondButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				secondButtonActionPerformed(e);
			}
		});

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setLocationRelativeTo(null);


		constraints.gridx = 0;
		constraints.gridy = 6;
		constraints.gridwidth = 2;
		constraints.anchor = GridBagConstraints.CENTER;
		add(resetButton, constraints);;

		resetButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				resetButtonActionPerformed(e);
			}
		});
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600, 400);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	private void yearButtonActionPerformed(ActionEvent e) {
		Calendar cal = Calendar.getInstance();
		int yearInt = cal.get(Calendar.YEAR);
		year = Integer.toString(yearInt);
		yearField.setText(year);
	}

	private void monthButtonActionPerformed(ActionEvent e) {
		
		Calendar cal = Calendar.getInstance();
		int a = cal.get(Calendar.MONTH);
		String monthString = "";
		switch (a) {
		
			case 0:
				monthString = "January";
				break;
				
			case 1:
				monthString = "February";
				break;
				
			case 2:
				monthString = "March";
				break;
				
			case 3:
				monthString = "April";
				break;
				
			case 4:
				monthString = "May";
				break;
				
			case 5:
				monthString = "June";
				break;
				
			case 6:
				monthString = "July";
				break;
				
			case 7:
				monthString = "August";
				break;
				
			case 8:
				monthString = "September";
				break;
				
			case 9:
				monthString = "October";
				break;
			
			case 10:
				monthString = "November";
				break;
				
			case 11:
				monthString = "December";
				break;
		
		}
		monthField.setText(monthString);
		
	}
	
	private void dayButtonActionPerformed(ActionEvent e) {
		
		Calendar cal = Calendar.getInstance();
		int a = cal.get(Calendar.DAY_OF_WEEK);
		String dayString = "";
		switch (a) {
		
			case 0:
				dayString = "Saturday";
				break;
				
			case 1:
				dayString = "Sunday";
				break;
				
			case 2:
				dayString = "Monday";
				break;
				
			case 3:
				dayString = "Tuesday";
				break;
				
			case 4:
				dayString = "Wednesday";
				break;
				
			case 5:
				dayString = "Thursday";
				break;
				
			case 6:
				dayString = "Friday";
				break;
					
		}
		dayField.setText(dayString);
		
	}

/*	private void dayButtonActionPerformed(ActionEvent e) {
		Calendar cal = Calendar.getInstance();
		int dayInt = cal.get(Calendar.DAY_OF_WEEK);
		dayField.setText(Integer.toString(dayInt));

	} */

	private void hourButtonActionPerformed(ActionEvent e) {
		Calendar cal = Calendar.getInstance();
		int hourInt = cal.get(Calendar.HOUR_OF_DAY);
		if (hourInt > 12)
			hourInt = hourInt - 12;
		hour = Integer.toString(hourInt);
		hourField.setText(hour);
	}

	private void minuteButtonActionPerformed(ActionEvent e) {
		Calendar cal = Calendar.getInstance();
		int minuteInt = cal.get(Calendar.MINUTE);
		minute = Integer.toString(minuteInt);
		minuteField.setText(minute);
	}

	private void secondButtonActionPerformed(ActionEvent e) {
		Calendar cal = Calendar.getInstance();
		int secondInt = cal.get(Calendar.SECOND);
		second = Integer.toString(secondInt);
		secondField.setText(second);
	}
	
	private void resetButtonActionPerformed(ActionEvent e) {
		yearField.setText("");
		monthField.setText("");
		dayField.setText("");
		hourField.setText("");
		minuteField.setText("");
		secondField.setText("");
	}

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Calendar_Example().setVisible(true);

			}
		});

	} // end of main

}