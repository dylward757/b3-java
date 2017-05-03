package paint;

import java.awt.Color;
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

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Paint extends JFrame{
	
	// field vars
	
	JMenuBar mainMenuBar = new JMenuBar();
	JMenu fileMenu = new JMenu();
	JMenuItem newMenuItem = new JMenuItem();
	JMenuItem exitMenuItem = new JMenuItem();
	
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
		g2D = (Graphics2D) drawPanel.getGraphics();

		setJMenuBar(mainMenuBar);
		fileMenu.setMnemonic('F');
		newMenuItem.setMnemonic('N');
		mainMenuBar.add(fileMenu);
		fileMenu.add(newMenuItem);
		fileMenu.addSeparator();
		fileMenu.add(exitMenuItem);
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
		
		drawPanel.setPreferredSize(new Dimension(500, 400));
		drawPanel.setBackground(Color.BLACK);
		GridBagConstraints gc = new GridBagConstraints();
		gc.gridx = 0;
		gc.gridy = 0;
		gc.gridheight = 2;
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
		
		colorPanel.setLayout(new GridBagLayout());
		int j = 0;
		for (int i = 0; i < 8; i++){
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
					colorPanelPressed(e);
				}
			});
		}
		
		//setSize(600, 600);
		pack();		
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
		
		
	}
	
	private void exitMenuItemActionPerformed(ActionEvent e) {
		
		
	}

	private void drawPanelMousePressed(MouseEvent e) {
		
		
	}

	private void drawPanelMouseDragged(MouseEvent e) {
		
		
	}

	private void drawPanelMouseReleased(MouseEvent e) {
		
		
	}

	private void colorPanelPressed(MouseEvent e) {
		
		
	}
	
	
	
}
