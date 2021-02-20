package _01_houses;

import java.awt.Color;
import java.util.Iterator;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
Robot rob = new Robot();
void flatHouse(String height) 
{
	if (height.equalsIgnoreCase("small")) {
		int tall = Integer.parseInt(height);
		tall = 60;
	}
	if (height.equalsIgnoreCase("medium")) {
		int tall = Integer.parseInt(height);
		tall = 120;
	}
	if (height.equalsIgnoreCase("large")) {
		int tall = Integer.parseInt(height);
	}
	//first flat topped house
	rob.setPenColor(Color.BLACK);
	rob.move(100);
	rob.turn(90);
	rob.move(20);
	rob.turn(90);
	rob.move(100);
	rob.turn(-90);
	rob.setPenColor(Color.GREEN);
	rob.move(20);
	rob.turn(-90);
}
	public void run() {
	rob.miniaturize();
	rob.setX(100);
	rob.setY(400);
	rob.penDown();
	rob.setPenWidth(2);
	rob.setSpeed(10);

for (int i = 0; i < 10; i++) {
	
}

	}
}
