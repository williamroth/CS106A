/* DrawRobotFace.java
 * --------------
 * This program draws a robot face. Graphics come from the ACM
 * GraphicsProgram class.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class DrawRobotFace extends GraphicsProgram {
    
    public void run() {
    	setSize(600, 800);
    	drawFace();
    	drawEyes();
    	drawNose();
      	drawMouth();
    }
    private void drawFace() {
       	GRect face = new GRect(150, 75, 300, 450);
       	face.setFilled(true);
       	face.setFillColor(Color.GRAY);
       	add(face);
       }
    
    private void drawEyes() {
    	GOval eye1 = new GOval(225, 150, 50, 50);
    	GOval eye2 = new GOval(325, 150, 50, 50);
    	eye1.setColor(Color.ORANGE);
    	eye2.setColor(Color.ORANGE);
    	eye1.setFilled(true);
    	eye2.setFilled(true);
    	add(eye1);
    	add(eye2);
       }
    
    private void drawNose() {
    	GRect nose = new GRect(290, 262.5, 20, 50);
    	nose.setFilled(true);
    	add(nose);
       }
    
    private void drawMouth() {
    	GRect mouth = new GRect(225, 375, 150, 75);
    	mouth.setColor(Color.WHITE);
    	mouth.setFilled(true);
    	add(mouth);
       }
    
}
