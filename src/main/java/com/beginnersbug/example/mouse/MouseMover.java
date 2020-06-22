package com.beginnersbug.example.mouse;

import java.awt.Robot;

public class MouseMover {

	public static void main(String[] args) {
		try {
			int xCord = 10;
			int yCord = 20;
			while (true) {

				Robot robot = new Robot();
				robot.mouseMove(xCord++, yCord++);
				System.out.println("Moving mouse to " + xCord + " " + yCord);
				Thread.sleep(10000);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
