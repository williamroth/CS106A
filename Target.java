/* File: Target.java
 * ------------------
 * This program will draw a target.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Target extends GraphicsProgram {
	
	public void run() {
		setSize(700, 700);
		GOval backCircle = new GOval(100, 100, 500, 500);
		backCircle.setColor(Color.RED);
		backCircle.setFilled(true);
		add(backCircle);
		GOval midCircle = new GOval(200, 200, 300, 300);
		midCircle.setColor(Color.WHITE);
		midCircle.setFilled(true);
		add(midCircle);
		GOval frontCircle = new GOval(300, 300, 100, 100);
		frontCircle.setColor(Color.RED);
		frontCircle.setFilled(true);
		add(frontCircle);
	}
}
