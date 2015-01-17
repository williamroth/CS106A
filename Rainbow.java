/* File: Target.java
 * ------------------
 * This program will draw a rainbow using clipping.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Rainbow extends GraphicsProgram {
	
	public void run() {
		setSize(1000, 500);
		GRect sky = new GRect(0, 0 , 1000, 500);
		sky.setColor(Color.CYAN);
		sky.setFilled(true);
		add(sky);
		GOval red = new GOval(-500, 10, 2000, 2000);
		red.setColor(Color.RED);
		red.setFilled(true);
		add(red);
		GOval orange = new GOval(-480, 30, 1960, 1960);
		orange.setColor(Color.ORANGE);
		orange.setFilled(true);
		add(orange);
		GOval yellow = new GOval(-460, 50, 1920, 1920);
		yellow.setColor(Color.YELLOW);
		yellow.setFilled(true);
		add(yellow);
		GOval green = new GOval(-440, 70, 1880, 1880);
		green.setColor(Color.GREEN);
		green.setFilled(true);
		add(green);
		GOval blue = new GOval(-420, 90, 1840, 1840);
		blue.setColor(Color.BLUE);
		blue.setFilled(true);
		add(blue);
		GOval magenta = new GOval(-400, 110, 1800, 1800);
		magenta.setColor(Color.MAGENTA);
		magenta.setFilled(true);
		add(magenta);
		GOval cyan = new GOval(-380, 130, 1760, 1760);
		cyan.setColor(Color.CYAN);
		cyan.setFilled(true);
		add(cyan);
	}
}
