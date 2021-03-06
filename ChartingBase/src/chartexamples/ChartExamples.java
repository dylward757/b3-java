
package chartexamples;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.awt.geom.*;

public class ChartExamples extends JFrame {

	JPanel myPanel = new JPanel();
	JButton lineButton = new JButton();
	JButton spiralButton = new JButton();
	JButton barButton = new JButton();
	JButton pieButton = new JButton();
	JButton Update = new JButton();
	JTextField xMinText = new JTextField();
	JTextField xMaxText = new JTextField();
	JTextField yMinText = new JTextField();
	JTextField yMaxText = new JTextField();
	JTextField aText = new JTextField();
	JTextField bText = new JTextField();
	JTextField cText = new JTextField();
	JTextField dText = new JTextField();
	
	// data arrays
	double[] x = new double[200];
	double[] y = new double[200];
	double[] yd = new double[200];
	Color[] plotColor = new Color[10];
	Random myRandom = new Random();

	public ChartExamples() {
		// frame constructor
		setTitle("Chart Examples");
		setResizable(false);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent evt) {
				exitForm(evt);
			}
		});
		getContentPane().setLayout(new GridBagLayout());

		myPanel.setPreferredSize(new Dimension(400, 300));
		myPanel.setBackground(Color.WHITE);
		GridBagConstraints gc = new GridBagConstraints();
		gc.gridx = 0;
		gc.gridy = 0;
		gc.gridwidth = 4;
		gc.insets = new Insets(10, 10, 10, 10);
		getContentPane().add(myPanel, gc);

		lineButton.setText("Line");
		lineButton.setPreferredSize(new Dimension(100, 25));
		gc = new GridBagConstraints();
		gc.gridx = 0;
		gc.gridy = 1;
		gc.insets = new Insets(5, 5, 5, 5);
		getContentPane().add(lineButton, gc);
		lineButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lineButtonActionPerformed(e);
			}
		});

		spiralButton.setText("Polar");
		spiralButton.setPreferredSize(new Dimension(100, 25));
		gc = new GridBagConstraints();
		gc.gridx = 1;
		gc.gridy = 1;
		gc.insets = new Insets(5, 5, 5, 5);
		getContentPane().add(spiralButton, gc);
		spiralButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lineButtonActionPerformed(e);
			}
		});

		barButton.setText("Bar");
		barButton.setPreferredSize(new Dimension(100, 25));
		gc = new GridBagConstraints();
		gc.gridx = 2;
		gc.gridy = 1;
		gc.insets = new Insets(5, 5, 5, 5);
		getContentPane().add(barButton, gc);
		barButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				barButtonActionPerformed(e);
			}
		});

		pieButton.setText("Pie");
		pieButton.setPreferredSize(new Dimension(100, 25));
		gc = new GridBagConstraints();
		gc.gridx = 3;
		gc.gridy = 1;
		gc.insets = new Insets(5, 5, 5, 5);
		getContentPane().add(pieButton, gc);
		pieButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pieButtonActionPerformed(e);
			}
		});
		
		xMinText.setPreferredSize(new Dimension(400, 300));
		xMinText.setBackground(Color.WHITE);
		xMinText.setVisible(false);
		gc = new GridBagConstraints();
		gc.gridx = 0;
		gc.gridy = 2;
		gc.insets = new Insets(5, 5, 5, 5);
		getContentPane().add(xMinText, gc);
		
		xMaxText.setPreferredSize(new Dimension(400, 300));
		xMaxText.setBackground(Color.WHITE);
		xMaxText.setVisible(false);
		gc = new GridBagConstraints();
		gc.gridx = 1;
		gc.gridy = 2;
		gc.insets = new Insets(5, 5, 5, 5);
		getContentPane().add(xMaxText, gc);
		
		yMinText.setPreferredSize(new Dimension(400, 300));
		yMinText.setBackground(Color.WHITE);
		yMinText.setVisible(false);
		gc = new GridBagConstraints();
		gc.gridx = 2;
		gc.gridy = 2;
		gc.insets = new Insets(5, 5, 5, 5);
		getContentPane().add(yMinText, gc);
		
		yMaxText.setPreferredSize(new Dimension(400, 300));
		yMaxText.setBackground(Color.WHITE);
		yMaxText.setVisible(false);
		gc = new GridBagConstraints();
		gc.gridx = 3;
		gc.gridy = 2;
		gc.insets = new Insets(5, 5, 5, 5);
		getContentPane().add(yMaxText, gc);
		
		aText.setPreferredSize(new Dimension(400, 300));
		aText.setBackground(Color.WHITE);
		aText.setVisible(false);
		gc = new GridBagConstraints();
		gc.gridx = 0;
		gc.gridy = 3;
		gc.insets = new Insets(5, 5, 5, 5);
		getContentPane().add(aText, gc);
		
		bText.setPreferredSize(new Dimension(400, 300));
		bText.setBackground(Color.WHITE);
		bText.setVisible(false);
		gc = new GridBagConstraints();
		gc.gridx = 1;
		gc.gridy = 3;
		gc.insets = new Insets(5, 5, 5, 5);
		getContentPane().add(bText, gc);
		
		cText.setPreferredSize(new Dimension(400, 300));
		cText.setBackground(Color.WHITE);
		cText.setVisible(false);
		gc = new GridBagConstraints();
		gc.gridx = 2;
		gc.gridy = 3;
		gc.insets = new Insets(5, 5, 5, 5);
		getContentPane().add(cText, gc);
		
		dText.setPreferredSize(new Dimension(400, 300));
		dText.setBackground(Color.WHITE);
		dText.setVisible(false);
		gc = new GridBagConstraints();
		gc.gridx = 3;
		gc.gridy = 3;
		gc.insets = new Insets(5, 5, 5, 5);
		getContentPane().add(dText, gc);
		
		Update.setText("Update");
		Update.setPreferredSize(new Dimension(100, 25));
		gc = new GridBagConstraints();
		gc.gridx = 2;
		gc.gridy = 4;
		gc.insets = new Insets(5, 5, 5, 5);
		getContentPane().add(Update, gc);

		pack();
		setLocationRelativeTo(null);
		// Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		// setBounds((int) (0.5 * (screenSize.width - getWidth())), (int) (0.5 *
		// (screenSize.height - getHeight())), getWidth(), getHeight());
		// colors to use
		plotColor[0] = Color.YELLOW;
		plotColor[1] = Color.BLUE;
		plotColor[2] = Color.GREEN;
		plotColor[3] = Color.CYAN;
		plotColor[4] = Color.RED;
		plotColor[5] = Color.MAGENTA;
		plotColor[6] = Color.ORANGE;
		plotColor[7] = Color.DARK_GRAY;
		plotColor[8] = Color.GRAY;
		plotColor[9] = Color.BLACK;

	}

	private void lineButtonActionPerformed(ActionEvent e) {
		// Draws line and spiral charts
		// Create a sinusoid with 200 points
		xMinText.setVisible(true);
		xMaxText.setVisible(true);
		yMinText.setVisible(true);
		yMinText.setVisible(true);
		aText.setVisible(true);
		bText.setVisible(true);
		cText.setVisible(true);
		dText.setVisible(true);
		double alpha = 0.1 - myRandom.nextDouble() * 0.2;
		double beta = myRandom.nextDouble() * 10 + 5;
		for (int i = 0; i < 200; i++) {
			// just like math class, plot y as a function of x
			// y = f(x)
			// for example, y = mx + b is a straight line
			// y = ax^2 + bx + c is a quadratic, plots as a parabola
			// to square a number, multiply it by itself or use the Math class
			// Math.pow(double a, double b) which
			// returns the value of a raised to the power of b.

			x[i] = i-100;  // CHANGE THIS!! shifts to the left about 1/2 total

			// below is a very complicated expression for you to try
			// y[i] = Math.exp(-alpha * i) * Math.sin(Math.PI * i / beta);

			// but also try the equations you use in your math, science,
			// or engineering classes; for example, a quadratic
			// y = ax^2 + bx + c

			double a = 1.0, b = 2.0, c = 3.0;

			// one way to square a number ---
			// y[i] = a*x[i]*x[i] + b*x[i] + c;

			// but this is usually the better way, and does any exponent ---
			
			y[i] = a * Math.pow(x[i], 2.0) + b * x[i] + c;

			//y[i] = x[i] + 10;
			
			// yd[] is for the spiral line only, and this is a complicated example
			// yd[i] = Math.exp(-alpha * i) *
			// (Math.PI * Math.cos(Math.PI * i / beta) / beta -
			// alpha * Math.sin(Math.PI * i / beta));
		}
		// Draw plots
		Rectangle2D.Double borderRectangle = new Rectangle2D.Double(20, 20, 360, 260);
		LineChartPanel myLineChart = new LineChartPanel();
		if (e.getActionCommand().equals(lineButton.getText())) {
			myLineChart = new LineChartPanel(borderRectangle, 200, x, y, plotColor[myRandom.nextInt(10)]);
		} else {
			myLineChart = new LineChartPanel(borderRectangle, 200, y, yd, plotColor[myRandom.nextInt(10)]);
		}
		myLineChart.setPreferredSize(new Dimension(400, 300));
		myLineChart.setBackground(Color.WHITE);
		myPanel.removeAll();
		myPanel.add(myLineChart);
		this.pack();
	}

	private void barButtonActionPerformed(ActionEvent e) {

	}

	private void pieButtonActionPerformed(ActionEvent e) {

	}

	private void exitForm(WindowEvent e) {
		System.exit(0);
	}
}