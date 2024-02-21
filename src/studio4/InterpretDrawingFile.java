package studio4;

import java.awt.Color;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File

		int color[] = new int [3];
		boolean filled;
		double parameters[] = new double [4];


		while(in.hasNext()) {
			String shape = in.next();

			for (int i=0; i<color.length; i++) {
				color[i] = in.nextInt();
			}
			filled = in.nextBoolean();

			for (int i=0; i<parameters.length; i++) {
				parameters[i]= in.nextDouble();
			}

		}
		Color pink = new Color (color[0],color[1],color[2]);

		StdDraw.setPenColor(pink);
		StdDraw.filledRectangle(parameters[0], parameters[1], parameters[2], parameters[3]);
		
		
	}
}
