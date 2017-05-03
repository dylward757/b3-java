import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Button_example implements ActionListener{
	
	int redScoreAmount = 0;
	int blueScoreAmount = 0;
	JLabel redLabel, blueLabel, redScore, blueScore;
	JButton blueButton, redButton, resetButton;
	JPanel totalGUI, titlePane, buttonPanel, scorePanel;
	

	public static void main(String[] args) {
		
		createAndShowGUI();
		
	}

	private static void createAndShowGUI() {
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("JButton Scores");
		
		Button_example demo = new Button_example();
		frame.setContentPane(demo.createContentPane());
		
		frame.setResizable(true);
		frame.setSize(400, 300);
		//frame.setLocationRelativeTo(null);
		frame.setLocation(600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	
		
	}
	
	private JPanel createContentPane(){
		
		totalGUI = new JPanel();
		totalGUI.setLayout(null);
		totalGUI.setBackground(Color.GRAY);
		
		
		titlePane = new JPanel();
		titlePane.setLayout(null);
		titlePane.setLocation(75, 10);
		titlePane.setSize(250, 30);
		totalGUI.add(titlePane);
		
		
		redLabel = new JLabel("Red Team");
		redLabel.setLocation(0,0);
		redLabel.setSize(100, 30);
		redLabel.setHorizontalAlignment(0);
		redLabel.setForeground(Color.RED);
		titlePane.add(redLabel);
		
		
		blueLabel = new JLabel("Blue Team");
		blueLabel.setLocation(120,0);
		blueLabel.setSize(100, 30);
		blueLabel.setHorizontalAlignment(0);
		blueLabel.setForeground(Color.BLUE);
		titlePane.add(blueLabel);
		
		
		scorePanel = new JPanel();
		scorePanel.setLayout(null);
		scorePanel.setLocation(75, 75);
		scorePanel.setSize(250, 30);
		totalGUI.add(scorePanel);
		
		
		redScore = new JLabel("0");
		redScore.setLocation(0,0);
		redScore.setSize(100, 30);
		redScore.setHorizontalAlignment(0);
		scorePanel.add(redScore);
		
		
		blueScore = new JLabel("0");
		blueScore.setLocation(120,0);
		blueScore.setSize(100, 30);
		blueScore.setHorizontalAlignment(0);
		scorePanel.add(blueScore);
		
		
		buttonPanel = new JPanel();
		buttonPanel.setLayout(null);
		buttonPanel.setLocation(75, 120);
		buttonPanel.setSize(250, 70);
		totalGUI.add(buttonPanel);
		
		
		redButton = new JButton("Red Score");
		redButton.setLocation(0, 0);
		redButton.setSize(120, 30);
		redButton.addActionListener(this);
		buttonPanel.add(redButton);
		
		blueButton = new JButton("Blue Score");
		blueButton.setLocation(120, 0);
		blueButton.setSize(120, 30);
		blueButton.addActionListener(this);
		buttonPanel.add(blueButton);
		
		
		resetButton = new JButton("Reset Score");
		resetButton.setLocation(0, 40);
		resetButton.setSize(250, 30);
		resetButton.addActionListener(this);
		buttonPanel.add(resetButton);
		
		
		totalGUI.setOpaque(true);
		return totalGUI;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		/*
		 *implements refers to an interface (here that is ActionListener
		 *An interface has -empty-methods so you and your coworkers
		 *are agreeing to use these methods with this required name
		 */
				
		if(e.getSource() == redButton){
			redHandler();
		}
		else if(e.getSource() == blueButton){
			blueHandler();	
		}
		else if(e.getSource() == resetButton){
			resetHandler();
		}
		else{
			JOptionPane.showMessageDialog(null, "Sorry, something went wrong");
		}		
	}
	
	
	
	private void redHandler() {
		redScoreAmount = redScoreAmount + 1;
		redScore.setText(""+redScoreAmount);
		
	}
	private void blueHandler() {
		blueScoreAmount = blueScoreAmount +1;
		blueScore.setText(""+blueScoreAmount);		
	}

	private void resetHandler() {
		redScoreAmount = 0;
		blueScoreAmount = 0;
		redScore.setText(""+redScoreAmount);
		blueScore.setText(""+blueScoreAmount);		
	}

}
