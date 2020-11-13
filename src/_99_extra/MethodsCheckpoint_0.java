package _99_extra;

import org.jointheleague.graphical.robot.Robot;

public class MethodsCheckpoint_0 {
	static Robot robot = new Robot();
	public static void main(String[] args) {
	 
		MethodsCheckpoint_0 name = new MethodsCheckpoint_0();
	
	
	name.food("apples");
	truth(1);
	
	robot.penDown();
	robot.setSpeed(50);
	
	for (int i = 0; i < 4; i++) {
	drawLine();
	}
	
	jump(6);
	
	jump("piggy");
}


void food(String fruit) {
	System.out.println("I like " + fruit);
}


static void truth(int x) {
    if(x > 5)
          System.out.println("Geeks rule");
    else
           System.out.println("Nerds rule");

}

static void drawLine() {
    robot.move(100);
     robot.turn(90);
}


static void jump(int height) {
    if (height > 100)
          System.out.println("The mouse jumped over the moon.");
    if (height > 50)
           System.out.println("The mouse jumped over the broom.");
    if (height > 5)
           System.out.println("The mouse jumped over the candlestick.");
}

static void jump(String obstacle) {

    System.out.println("The mouse jumped over the " + obstacle);
}



}
