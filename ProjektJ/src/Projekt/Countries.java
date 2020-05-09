package Projekt;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

public class Countries {
	String name;
	String capital;
	int totalPopulation;
	int infected;
	int deaths;
	int cured;
	int xCapital,yCapital;
	Color colors;
	
	public Countries(Color color, String cap,int population, int X,int Y) {
		colors = color;
		capital = cap;
		totalPopulation = population;
		xCapital = X;
		yCapital = Y;
	}
	public Countries(Color color) {
		colors = color;
	}
	public Countries(String cap, int population, Color color) {
		capital = cap;
		totalPopulation = population;
		colors = color;
	}
	public void drawAreaXYn(int[]x,int[]y,int n, Graphics2D g, int lineWidth) {
		g.setStroke(new BasicStroke(lineWidth));
		g.setColor(Color.BLACK);  
		g.drawPolygon(x,y,n);  
	    g.setColor(colors);  
	    g.fillPolygon(x,y,n);
	    g.setColor(new Color(0,0,139)); 
	    g.drawOval(this.xCapital-1, this.yCapital-1, 2, 2);
	    g.fillOval(this.xCapital-1, this.yCapital-1, 2, 2);
	    g.setColor(Color.BLACK); 
	}
	
	public int getPopulation() {
		return totalPopulation;
	}
	public Point getCapitalPoint() {
		Point capital = new Point(xCapital,yCapital);
		return capital;
	}
	public void setColor(Color newColor) {
		colors = newColor;
	}
}
