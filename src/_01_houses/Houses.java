package _01_houses;

import java.awt.Color;
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	
	Robot bob = new Robot();
	public void run(){
		bob.setWindowColor(Color.BLACK);
		
		bob.miniaturize();
		bob.setSpeed(300);
		bob.moveTo(50, 500);
		bob.penDown();
		bob.setPenWidth(5);
		
		for(int i = 0; i <= 10; i++) {
			
			//--------------------Random Generator--------------------------
			
			int x = new Random().nextInt(3);
			int y = new Random().nextInt(6);
			
			//-----------------------Color----------------------------------
			
			Color b;
			if (y == 0) {
				 b = Color.BLUE;
			 }
			 else if (y ==1) {
				 b = Color.PINK;
			 }
			 else if (y ==2) {
				 b = Color.YELLOW;
			 }
			 else if (y ==3) {
				 b = Color.CYAN;
			 }
			 else if (y ==4) {
				 b = Color.ORANGE;
			 }
			 else{
				 b = Color.MAGENTA;
			 }
			
			//------------------------Size----------------------------------
			
			String a;
			 if (x == 0) {
				 a = "small";
			 }
			 else if (x ==1) {
				 a = "med";
			 }
			 else{
				 a = "this activates the else statement in the drawFlatRoof method";
			 }
			 
			//--------------------Call Method---------------------------------
			 
		drawPointyRoof(a, b);
		
		}
	}
	

	void drawPointyRoof(String height, Color clr) {
		int def;
		bob.setPenColor(clr);
		
		if (height .equals("small")) {
			def = 60;
			}
			
			else if (height .equals ("med")) {
				def = 120;
				
			}
			
			else {
				def = 250;
				drawFlatRoof(def, clr);
				return;
			}
		
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
	
	void drawFlatRoof(int def, Color clr) {
		bob.setPenColor(clr);
		
		
		
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
	
}
