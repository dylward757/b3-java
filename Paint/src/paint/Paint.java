package paint;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Paint extends JFrame{
	
	// field VAR
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JMenuBar mainMenuBar = new JMenuBar();
	JMenu fileMenu = new JMenu("File");
	JMenu backgroundMenu = new JMenu("Background");
	JMenuItem newMenuItem = new JMenuItem("New");
	JMenuItem exitMenuItem = new JMenuItem("Exit");
	JMenuItem orangeMenuItem = new JMenuItem("Orange");
	JMenuItem whiteMenuItem = new JMenuItem("White");
	JMenuItem blackMenuItem = new JMenuItem("Black");
	
	JPanel sizePanel = new JPanel();
	ButtonGroup sizeButtonGroup = new ButtonGroup();
	JRadioButton smallRadioButton = new JRadioButton();
	JRadioButton mediumRadioButton = new JRadioButton();
	JRadioButton largeRadioButton = new JRadioButton();
	
	JPanel drawPanel = new JPanel();
	JLabel leftColorLabel = new JLabel();
	JLabel rightColorLabel = new JLabel();
	
	JPanel colorPanel = new JPanel();
	JLabel[] colorLabel = new JLabel[8];
	
	Graphics2D g2D;
	double xPrevious, yPrevious;
	Color DrawColor, leftColor, rightColor;
	
	
	// constructor
	
	public Paint(){
		
		//frame constructor
		setTitle("Paint by Dylan Ward Jan 2017");
		setResizable(false);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				exitForm(e);
			}
		});
		getContentPane().setLayout(new GridBagLayout());
		
		setLocationRelativeTo(null);
		

		setJMenuBar(mainMenuBar);
		fileMenu.setMnemonic('F');
		backgroundMenu.setMnemonic('B');
		mainMenuBar.add(fileMenu);
		mainMenuBar.add(backgroundMenu);
		fileMenu.add(newMenuItem);
		fileMenu.addSeparator();
		fileMenu.add(exitMenuItem);
		backgroundMenu.add(orangeMenuItem);
		backgroundMenu.addSeparator();
		backgroundMenu.add(whiteMenuItem);
		backgroundMenu.addSeparator();
		backgroundMenu.add(blackMenuItem);
		newMenuItem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				newMenuItemActionPerformed(e);
			}
		});
		exitMenuItem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				exitMenuItemActionPerformed(e);
			}
		});
		orangeMenuItem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				orangeMenuItemActionPerformed(e);
			}
		});
		blackMenuItem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				blackMenuItemActionPerformed(e);
			}
		});
		whiteMenuItem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				whiteMenuItemActionPerformed(e);
			}
		});
		
		drawPanel.setPreferredSize(new Dimension(500, 400));
		drawPanel.setBackground(Color.BLACK);
		GridBagConstraints gc = new GridBagConstraints();
		gc.gridx = 0;
		gc.gridy = 0;
		gc.gridheight = 3;
		gc.insets = new Insets(10, 10, 10, 10);
		getContentPane().add(drawPanel, gc);
		drawPanel.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				drawPanelMousePressed(e);
			}
		});
		
		drawPanel.addMouseMotionListener(new MouseMotionAdapter(){
			public void mouseDragged(MouseEvent e){
				drawPanelMouseDragged(e);
			}
		});
		drawPanel.addMouseListener(new MouseAdapter(){
			public void mouseReleased(MouseEvent e){
				drawPanelMouseReleased(e);
			}
		});
		
		leftColorLabel.setPreferredSize(new Dimension(40, 40));
		leftColorLabel.setBackground(Color.BLUE);
		leftColorLabel.setOpaque(true);
		gc = new GridBagConstraints();
		gc.gridx = 1;
		gc.gridy = 0;
		gc.anchor = GridBagConstraints.NORTH;
		gc.insets = new Insets(10, 5, 10, 10);
		getContentPane().add(leftColorLabel, gc);
		
		
		rightColorLabel.setPreferredSize(new Dimension(40, 40));
		rightColorLabel.setBackground(Color.RED);
		rightColorLabel.setOpaque(true);
		gc = new GridBagConstraints();
		gc.gridx = 2;
		gc.gridy = 0;
		gc.anchor = GridBagConstraints.NORTH;
		gc.insets = new Insets(10, 5, 10, 10);
		getContentPane().add(rightColorLabel, gc);
		
		
		colorPanel.setPreferredSize(new Dimension(80, 160));
		colorPanel.setBackground(Color.CYAN);
		colorPanel.setBorder(BorderFactory.createTitledBorder("Colors"));
		gc = new GridBagConstraints();
		gc.gridx = 1;
		gc.gridy = 1;
		gc.gridwidth = 2;
		gc.anchor = GridBagConstraints.NORTH;
		gc.insets = new Insets(10, 10, 10, 10);
		getContentPane().add(colorPanel, gc);
		
		sizePanel.setLayout(new GridBagLayout());
		sizePanel.setBorder(BorderFactory.createTitledBorder("Size"));
		gc = new GridBagConstraints();
		gc.gridx = 1;
		gc.gridy = 2;
		gc.gridwidth = 2;
		getContentPane().add(sizePanel, gc);
		
		smallRadioButton.setText("Small");
		mediumRadioButton.setText("Medium");
		largeRadioButton.setText("Large");
		
		sizeButtonGroup.add(smallRadioButton);
		gc = new GridBagConstraints();
		gc.gridx = 0;
		gc.gridy = 0;
		gc.anchor = GridBagConstraints.WEST;
		sizePanel.add(smallRadioButton, gc);
		smallRadioButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				sizeRadioButtonActionPerformed(e);
			}
		});
		
		sizeButtonGroup.add(mediumRadioButton);
		gc = new GridBagConstraints();
		gc.gridx = 0;
		gc.gridy = 1;
		gc.anchor = GridBagConstraints.WEST;
		sizePanel.add(mediumRadioButton, gc);
		mediumRadioButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				sizeRadioButtonActionPerformed(e);
			}
		});
		
		sizeButtonGroup.add(largeRadioButton);
		gc = new GridBagConstraints();
		gc.gridx = 0;
		gc.gridy = 2;
		gc.anchor = GridBagConstraints.WEST;
		sizePanel.add(largeRadioButton, gc);
		largeRadioButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				sizeRadioButtonActionPerformed(e);
			}
		});
		
		
		colorPanel.setLayout(new GridBagLayout());
		int j = 0;
		for (int i = 0; i < 8; i++){
			colorLabel[i] = new JLabel();
			colorLabel[i].setPreferredSize(new Dimension(30, 30));
			colorLabel[i].setOpaque(true);
			gc = new GridBagConstraints();
			gc.gridx = j;
			gc.gridy = i-j*4;
			colorPanel.add(colorLabel[i], gc);
			if(i == 3){
				j++;
			}
			colorLabel[i].addMouseListener(new MouseAdapter(){
				public void mousePressed(MouseEvent e){
					colorMousePressed(e);
				}
			});
		}
		
		
		colorLabel[0].setBackground(Color.GRAY);
		colorLabel[1].setBackground(Color.BLUE);
		colorLabel[2].setBackground(Color.GREEN);
		colorLabel[3].setBackground(Color.ORANGE);
		colorLabel[4].setBackground(Color.RED);
		colorLabel[5].setBackground(Color.MAGENTA);
		colorLabel[6].setBackground(Color.YELLOW);
		colorLabel[7].setBackground(Color.WHITE);
		leftColor = colorLabel[0].getBackground();
		leftColorLabel.setBackground(leftColor);
		rightColor = colorLabel[7].getBackground();
		rightColorLabel.setBackground(rightColor);
		
		//setSize(600, 600);
		pack();	
		g2D = (Graphics2D) drawPanel.getGraphics();
		//Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		//setBounds((int)(0.5 * (screenSize.width - getWidth())), 
		//		(int)(0.5 * (screenSize.height - getHeight())),
		//		getWidth(), getHeight());
		
		
		
		
	}// end of constructor
	
	
	//method stack - handlers
	
	private void exitForm(WindowEvent e){
		
		System.exit(0);
		
	}
	
	private void newMenuItemActionPerformed(ActionEvent e) {
		
		int response;
		response = JOptionPane.showConfirmDialog(null, "Are you sure you want to start over?");
		if(response == JOptionPane.YES_OPTION){
			g2D.setPaint(drawPanel.getBackground());
			g2D.fill(new Rectangle2D.Double(0, 0, drawPanel.getWidth(), drawPanel.getHeight()));
		}
		
	}
	
	private void exitMenuItemActionPerformed(ActionEvent e) {
		
		int response;
		response = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?");
		if (response == JOptionPane.NO_OPTION){
			return;
		}
		else{
			exitForm(null);
		}
	}

	private void drawPanelMousePressed(MouseEvent e) {
		
		if(e.getButton() == MouseEvent.BUTTON1 || 
				e.getButton() == MouseEvent.BUTTON3){
			System.out.println("Inside of mouse pressed e = " + e);
			xPrevious = e.getX();
			yPrevious = e.getY();
			if(e.getButton() == MouseEvent.BUTTON1){
				DrawColor = leftColor;
			}
			else{
				DrawColor = rightColor;
			}
		}
		
	}

	private void drawPanelMouseDragged(MouseEvent e) {
		
		Line2D.Double myLine = new Line2D.Double(xPrevious, yPrevious,e.getX(), e.getY());
		g2D.setPaint(DrawColor);
		g2D.draw(myLine);
		xPrevious = e.getX();
		yPrevious = e.getY();
	}

	private void drawPanelMouseReleased(MouseEvent e) {
		
		if(e.getButton() == MouseEvent.BUTTON1 || e.getButton() == MouseEvent.BUTTON3){
			Line2D.Double myLine = new Line2D.Double(xPrevious, yPrevious, e.getX(), e.getY());
			g2D.setPaint(DrawColor);
			g2D.draw(myLine);
		}
		
	}

	private void colorMousePressed(MouseEvent e) {
		
		Component clickedColor = e.getComponent();
		Toolkit.getDefaultToolkit().beep();
		if(e.getButton() == MouseEvent.BUTTON1){
			leftColor = clickedColor.getBackground();
			leftColorLabel.setBackground(leftColor);
		}
		else if(e.getButton() == MouseEvent.BUTTON3){
			rightColor = clickedColor.getBackground();
			rightColorLabel.setBackground(rightColor);
		}
		
	}

	private void orangeMenuItemActionPerformed(ActionEvent e) {
		drawPanel.setBackground(Color.ORANGE);
		
	}

	private void blackMenuItemActionPerformed(ActionEvent e) {
		drawPanel.setBackground(Color.BLACK);
		
	}

	private void whiteMenuItemActionPerformed(ActionEvent e) {
		drawPanel.setBackground(Color.WHITE);
		
	}
	private void sizeRadioButtonActionPerformed(ActionEvent e){
		
		
		
	}	
}
