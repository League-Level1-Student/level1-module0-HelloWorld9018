package _01_houses;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot bob = new Robot();
	public void run(){
		
		
		bob.miniaturize();
		bob.setSpeed(300);
		bob.moveTo(50, 500);
		bob.penDown();
		
		for(int i = 0; i <= 10; i++) {
		drawFlatRoof("", Color.BLUE);
		
		}
	}
	
	void drawFlatRoof(String height, Color clr) {
		bob.setPenColor(clr);
		int def;
		
		if (height .equals("small")) {
		def = 60;
		}
		
		else if (height .equals ("med")) {
			def = 120;
			
		}
		
		else {
			def = 250;
			drawPointyRoof(def, Color.BLUE);
			return;
		}
		
	bob.move(def);
	bob.turn(90);
	bob.move(15);
	bob.turn(90);
	bob.move(def);
	bob.turn(-90);
	bob.setPenColor(0, 225, 0);
	bob.move(20);
	bob.turn(-90);
	}
	
	void drawPointyRoof(int def, Color clr) {
		
		bob.setPenColor(clr);
		
		bob.move(def);
		bob.turn(40);
		bob.move(15);
		bob.turn(100);
		bob.move(15);
		bob.turn(40);
		bob.move(def);
		bob.turn(-90);
		bob.setPenColor(0, 225, 0);
		bob.move(20);
		bob.turn(-90);
		
	}
}
