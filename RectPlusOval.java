/* File: RectPlusOval.java
 * ------------------
 * This program prints a rectangle and oval 
 * with the same width and height and centers on 
 * the screen.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class RectPlusOval extends GraphicsProgram {
	
	public void run() {
		double x = (getWidth() - FIGURE_WIDTH) / 2;
		double y = (getHeight() - FIGURE_HEIGHT) / 2;
		GRect rect = new GRect(x, y, FIGURE_WIDTH, FIGURE_HEIGHT);
		rect.setFilled(true);
		rect.setColor(Color.RED);
		add(rect);
		GOval oval = new GOval(x, y, FIGURE_WIDTH, FIGURE_HEIGHT);
		oval.setFilled(true);
		oval.setFillColor(Color.GREEN);
		add(oval);
	}
	
	// constants for width and height of shapes
	private static final double FIGURE_WIDTH = 125;
	private static final double FIGURE_HEIGHT = 400;
	
}
