package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		Color purp = new Color (145, 34, 214);
		StdDraw.setPenRadius(0.05);
		StdDraw.setPenColor(Color.RED);
		StdDraw.arc(0.5,0.3,0.7,0,180);
		StdDraw.setPenColor(Color.ORANGE);
		StdDraw.arc(0.5,0.25,0.7,0,180);
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.arc(0.5,0.20,0.7,0,180);
		StdDraw.setPenColor(Color.GREEN);
		StdDraw.arc(0.5,0.15,0.7,0,180);
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.arc(0.5,0.1,0.7,0,180);
		StdDraw.setPenColor(purp);
		StdDraw.arc(0.5,0.06,0.7,0,180);
		
		
		Color gray = new Color (189, 189, 189);
		StdDraw.setPenColor(gray);
		StdDraw.filledCircle(0.68, 0.45, 0.015);
		StdDraw.filledCircle(0.7, 0.49, 0.02);
		StdDraw.filledCircle(0.7, 0.55, 0.03);
		StdDraw.filledCircle(0.77, 0.63, 0.05);
		
		
	
		
		Color brown = new Color (117, 61, 41);
		StdDraw.setPenColor(brown);
		StdDraw.filledRectangle(0.68, 0.38, 0.02, 0.07);
		
		Color darkBrown = new Color (51, 27, 3);
		StdDraw.setPenColor(darkBrown);
		StdDraw.filledRectangle(0.5, 0.2, 0.1, 0.2);
		
		Color purple = new Color (58, 13, 112);
		StdDraw.setPenColor(purple);
		StdDraw.filledEllipse(0.5, 0.29, 0.3, 0.12);
		
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledEllipse(0.32, 0.31, 0.08, 0.04);
		StdDraw.filledEllipse(0.46, 0.23, 0.062, 0.028);
		StdDraw.filledEllipse(0.52, 0.36, 0.055, 0.024);
		StdDraw.filledEllipse(0.67, 0.28, 0.1, 0.05);

		StdDraw.filledRectangle(0.47, 0.12, 0.03, 0.03);
	
		StdDraw.setPenColor(brown);
		StdDraw.filledRectangle(0.5, 0, 0.025, 0.07);
		
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.setPenRadius(0.005);
		StdDraw.line(0.47, 0.09, 0.47, 0.15);
		StdDraw.line(0.44, 0.12, 0.50, 0.12);
		
	}
}