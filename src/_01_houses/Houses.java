package _01_houses;

import java.awt.Color;
import java.util.Iterator;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
Robot rob = new Robot();
void flatHouse() {
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
	flatHouse();
}

	}
}
