package findburger;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FindBurger extends JFrame{
	private static final long serialVersionUID = 1L;
	
	// field
	
	JLabel label0 = new JLabel();
	JLabel label1 = new JLabel();
	JLabel label2 = new JLabel();
	JLabel label3 = new JLabel();
	JLabel label4 = new JLabel();
	JLabel label5 = new JLabel();
	JLabel[] choiceLabel = new JLabel[6];
	ImageIcon burger = new ImageIcon("burger.gif");
	JButton newButton = new JButton();
	int burgerLocation;
	Random myRandom = new Random();	
	int t = choiceLabel.length;
	
	
	// constructor
	
	public FindBurger(){
		
		// frame construction 
		
		setTitle("Find the Hamburger");
		setResizable(false);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent evt){
				exitForm(evt);
			}
		});
		getContentPane().setLayout(new GridBagLayout());
		GridBagConstraints gridCon;
		
		choiceLabel[0] = label0;
		choiceLabel[1] = label1;
		choiceLabel[2] = label2;
		choiceLabel[3] = label3;
		choiceLabel[4] = label4;
		choiceLabel[5] = label5;
		int gx = 0;
		int gy = 0;
		for(int i = 0; i < t; i++){
			gridCon = new GridBagConstraints();
			choiceLabel[i].setPreferredSize(new Dimension(burger.getIconWidth(), burger.getIconHeight()));
			choiceLabel[i].setOpaque(true);
			choiceLabel[i].setBackground(Color.RED);
			
			if(i == 3){
				gx = 0;
				gy = 1;
			}
			gridCon.gridx = gx;
			gridCon.gridy = gy;
			gx++;
			gridCon.insets = new Insets(10, 10, 10, 10);
			getContentPane().add(choiceLabel[i], gridCon);
			choiceLabel[i].addMouseListener(new MouseAdapter(){
				public void mouseClicked(MouseEvent e){
					labelMouseClicked(e);
				}
			});
		}
		
		
		
		newButton.setText("Play Again");
		gridCon = new GridBagConstraints();
		gridCon.gridx = 1;
		gridCon.gridy = 2;
		gridCon.insets = new Insets(10, 10, 10, 10);
		getContentPane().add(newButton, gridCon);
		newButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				newButtonActionPerformed(e);
			}
		});
		
		getContentPane().setBackground(Color.DARK_GRAY);
		setSize(400, 300);
		setLocationRelativeTo(null);
		pack();
		setVisible(true);
		
		
	} // end of constructor
	

	private void exitForm(WindowEvent evt) {
		System.exit(0);
		
	} // end exitForm
	

	private void labelMouseClicked(MouseEvent e) {
		
		Component clickedComponent = e.getComponent();
		int choice;
		for(choice = 0; choice < t; choice++){
			
			if(clickedComponent == choiceLabel[choice]){
				
				break;
			}
		}
		
		choiceLabel[choice].setBackground(Color.WHITE);
		if(choice == burgerLocation){
			choiceLabel[choice].setIcon(burger);
			newButton.setEnabled(true);
		}
		
	} // end labelMouseClicked
	

	private void newButtonActionPerformed(ActionEvent e){
		
		//clear boxes, hide burger
		
		for (int i = 0; i < t; i++){
			choiceLabel[i].setIcon(null);
			choiceLabel[i].setBackground(Color.RED);
		}
		burgerLocation = myRandom.nextInt(6);
		newButton.setEnabled(false);
		
	} // end of newButtonPressed
	
	// method stack
	

} // end of class
