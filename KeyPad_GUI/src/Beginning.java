import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Beginning implements ActionListener{
	
	int oneScoreAmount = 0;
	int twoScoreAmount = 0;
	JLabel oneLabel, twoLabel, oneScore, twoScore;
	JButton onePATButton, twoPATButton, oneSafeButton, twoSafeButton, oneFGButton, twoFGButton, oneTDButton, twoTDButton, oneSubButton, twoSubButton, resetButton;
	JPanel totalGUI, titlePane, buttonPanel, scorePanel;
	

	public static void main(String[] args) {
		
		createAndShowGUI();
		
	}

	private static void createAndShowGUI() {
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("JButton Scores");
		
		Beginning demo = new Beginning();
		frame.setContentPane(demo.createContentPane());
		
		frame.setResizable(true);
		frame.setSize(500, 500);
		//frame.setLocationRelativeTo(null);
		frame.setLocation(300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	
		
	}
	
	private JPanel createContentPane(){
		
		totalGUI = new JPanel();
		totalGUI.setLayout(null);
		totalGUI.setBackground(Color.GRAY);
		
		
		titlePane = new JPanel();
		titlePane.setLayout(null);
		titlePane.setLocation(125, 10);
		titlePane.setSize(250, 30);
		totalGUI.add(titlePane);
		
		
		oneLabel = new JLabel("Team 1");
		oneLabel.setLocation(0,0);
		oneLabel.setSize(100, 30);
		oneLabel.setHorizontalAlignment(0);
		oneLabel.setForeground(Color.RED);
		titlePane.add(oneLabel);
		
		
		twoLabel = new JLabel("Team 2");
		twoLabel.setLocation(120,0);
		twoLabel.setSize(100, 30);
		twoLabel.setHorizontalAlignment(0);
		twoLabel.setForeground(Color.BLUE);
		titlePane.add(twoLabel);
		
		
		scorePanel = new JPanel();
		scorePanel.setLayout(null);
		scorePanel.setLocation(125, 75);
		scorePanel.setSize(250, 30);
		totalGUI.add(scorePanel);
		
		
		oneScore = new JLabel("0");
		oneScore.setLocation(0,0);
		oneScore.setSize(100, 30);
		oneScore.setHorizontalAlignment(0);
		scorePanel.add(oneScore);
		
		
		twoScore = new JLabel("0");
		twoScore.setLocation(120,0);
		twoScore.setSize(100, 30);
		twoScore.setHorizontalAlignment(0);
		scorePanel.add(twoScore);
		
		
		buttonPanel = new JPanel();
		buttonPanel.setLayout(null);
		buttonPanel.setLocation(125, 120);
		buttonPanel.setSize(250, 320);
		totalGUI.add(buttonPanel);
		
		
		onePATButton = new JButton("+1 PAT");
		onePATButton.setLocation(0, 220);
		onePATButton.setSize(120, 30);
		onePATButton.addActionListener(this);
		buttonPanel.add(onePATButton);
		
		twoPATButton = new JButton("+1 PAT");
		twoPATButton.setLocation(120, 220);
		twoPATButton.setSize(120, 30);
		twoPATButton.addActionListener(this);
		buttonPanel.add(twoPATButton);
		
		oneSafeButton = new JButton("+2 Safety/Conversion");
		oneSafeButton.setLocation(0, 160);
		oneSafeButton.setSize(120, 30);
		oneSafeButton.addActionListener(this);
		buttonPanel.add(oneSafeButton);
		
		twoSafeButton = new JButton("+2 Safety/Conversion");
		twoSafeButton.setLocation(120, 160);
		twoSafeButton.setSize(120, 30);
		twoSafeButton.addActionListener(this);
		buttonPanel.add(twoSafeButton);
		
		oneFGButton = new JButton("+3 Field Goal Button");
		oneFGButton.setLocation(0, 110);
		oneFGButton.setSize(120, 30);
		oneFGButton.addActionListener(this);
		buttonPanel.add(oneFGButton);
		
		twoFGButton = new JButton("+3 Field Goal Button");
		twoFGButton.setLocation(120, 110);
		twoFGButton.setSize(120, 30);
		twoFGButton.addActionListener(this);
		buttonPanel.add(twoFGButton);
		
		oneTDButton = new JButton("+6 Touchdown");
		oneTDButton.setLocation(0, 60);
		oneTDButton.setSize(120, 30);
		oneTDButton.addActionListener(this);
		buttonPanel.add(oneTDButton);
		
		twoTDButton = new JButton("+6 Touchdown");
		twoTDButton.setLocation(120, 60);
		twoTDButton.setSize(120, 30);
		twoTDButton.addActionListener(this);
		buttonPanel.add(twoTDButton);
		
		oneSubButton = new JButton("-1 Subtract");
		oneSubButton.setLocation(0, 10);
		oneSubButton.setSize(120, 30);
		oneSubButton.addActionListener(this);
		buttonPanel.add(oneSubButton);
		
		twoSubButton = new JButton("-1 Subtract");
		twoSubButton.setLocation(120, 10);
		twoSubButton.setSize(120, 30);
		twoSubButton.addActionListener(this);
		buttonPanel.add(twoSubButton);
		
		resetButton = new JButton("Reset Score");
		resetButton.setLocation(0, 280);
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
				
		if(e.getSource() == onePATButton){
			redHandler();
		}
		else if(e.getSource() == twoPATButton){
			blueHandler();	
		}
		else if(e.getSource() == resetButton){
			resetHandler();
		}
		else if(e.getSource() == oneSafeButton){
			SafeHandlerOne();
		}
		else if(e.getSource() == twoSafeButton){
			SafeHandlerTwo();
		}
		else if(e.getSource() == oneFGButton){
			FGHandlerone();
		}
		else if(e.getSource() == twoFGButton){
			FGHandlertwo();
		}
		else if(e.getSource() == oneTDButton){
			TDHandlerone();
		}
		else if(e.getSource() == twoTDButton){
			TDHandlertwo();
		}
		else if(e.getSource() == oneSubButton){
			SubHandlerone();
		}
		else if(e.getSource() == twoSubButton){
			SubHandlertwo();
		}
		else{
			JOptionPane.showMessageDialog(null, "Sorry, something went wrong");
		}		
	}
	
	
	
	private void SubHandlertwo() {
		twoScoreAmount = twoScoreAmount -1;
		twoScore.setText(""+twoScoreAmount);
		
	}

	private void SubHandlerone() {
		oneScoreAmount = oneScoreAmount -1;
		oneScore.setText(""+oneScoreAmount);
		
	}

	private void TDHandlertwo() {
		twoScoreAmount = twoScoreAmount +6;
		twoScore.setText(""+twoScoreAmount);
		
	}

	private void TDHandlerone() {
		oneScoreAmount = oneScoreAmount +6;
		oneScore.setText(""+oneScoreAmount);
		
	}

	private void FGHandlertwo() {
		twoScoreAmount = twoScoreAmount +3;
		twoScore.setText(""+twoScoreAmount);
		
	}

	private void FGHandlerone() {
		oneScoreAmount = oneScoreAmount +3;
		oneScore.setText(""+oneScoreAmount);
		
	}

	private void SafeHandlerTwo() {
		twoScoreAmount = twoScoreAmount +2;
		twoScore.setText(""+twoScoreAmount);
		
	}

	private void SafeHandlerOne() {
		oneScoreAmount = oneScoreAmount +2;
		oneScore.setText(""+oneScoreAmount);
		
	}

	private void redHandler() {
		oneScoreAmount = oneScoreAmount + 1;
		oneScore.setText(""+oneScoreAmount);
		
	}
	private void blueHandler() {
		twoScoreAmount = twoScoreAmount +1;
		twoScore.setText(""+twoScoreAmount);		
	}

	private void resetHandler() {
		oneScoreAmount = 0;
		twoScoreAmount = 0;
		oneScore.setText(""+oneScoreAmount);
		twoScore.setText(""+twoScoreAmount);		
	}

}

