package chartexamples;

import java.awt.Color;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class BarChartPanel extends JPanel{
	
	private Rectangle2D.Double borderRectangle;
	private int n;
	private double[] y;
	private double b;
	private Color c;
	

	public BarChartPanel(borderRectangle, numberBars, y, 0.0, plotColor[myRandom.nextInt(10)]){
	
	this.borderRectangle = border;
	this.n = nPoints;
	this.y = yValues;
	this.b = base;
	this.c = colorValue;
	
	double yMin = y[0];
	double yMax = y[0];
	for(int i = 1; i < n; i++){
		yMin = Math.min(yMin, y[i]);
		yMax = Math.max(yMax, y[i]);
	}
	
}
