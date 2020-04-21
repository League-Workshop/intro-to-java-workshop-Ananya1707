package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
		Robot rob = new Robot("mini");
		
		//int x = 5;
		
		rob.penDown();
		//rob.penUp();
		rob.setSpeed(100);
		
		for (int i = 0; i < 4; i++) {
			rob.move(50);
			rob.turn(90);
		}
		
	
		
		
	}
}
