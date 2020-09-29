package _02_code_flow._1_robot_square;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstRobot {
	public static void main(String[] args) {
		Robot dan = new Robot();
		dan.penDown();
		dan.setPenColor(Color.magenta);
		dan.setSpeed(20);
		
		int num = 0;
		while(num < 4) {
			dan.move(100);
			dan.turn(90);
			num += 1;
		}
		
//		dan.move(100);
//		dan.turn(90);
//		dan.move(100);
//		dan.turn(90);
//		dan.move(100);
//		dan.turn(90);
//		dan.move(100);
		

		

		
		
		
		
	}
}
