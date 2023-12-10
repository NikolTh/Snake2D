package com.mtala3t.snake2d;

import java.awt.geom.Ellipse2D;
import java.util.ArrayList;

public class SnakeSize {
	
	private static final int DEFAULT_SNAKE_LENGTH = 5;
	
	public ArrayList<Ellipse2D.Double> snakeBody = new ArrayList<Ellipse2D.Double>();
	
	public SnakeSize() {
		for (int i = 0; i < DEFAULT_SNAKE_LENGTH; i++) {
			snakeBody.add(new Ellipse2D.Double(355 - i * 16, 191, 16, 16));
		}
	}
	
	public void move(int direction) {
		for (int i = getLength() - 1; i > 0; i--) {
			snakeBody.set(i, (Ellipse2D.Double) snakeBody.get(i - 1));
		}

		if (direction == 1 || direction == 2) {
			changeYsize(direction);
		}
		else if (direction == 3 || direction == 4){
			changeXsize(direction);
		}
	}

	public void eat() {

		snakeBody.add(snakeBody.get(getLength() - 1));
	}

	public void changeYsize(int z) {
		
		Ellipse2D.Double temp = (Ellipse2D.Double) snakeBody.get(0);
		double x = temp.x;
		double y = temp.y;
		
		if (z == 1) { 
			y = y - 16;
		}
		else if (z == 2) {
			y = y+ 16;
		}
		Ellipse2D.Double elli = new Ellipse2D.Double(x, y, temp.getWidth(), temp.getHeight());
		snakeBody.set(0, (Ellipse2D.Double) elli);
	}
	
	public void changeXsize(int z) {
		
		Ellipse2D.Double temp = (Ellipse2D.Double) snakeBody.get(0);
		double x = temp.x;
		double y = temp.y;
		
		
		if (z == 3) {
			x = x + 16;
		}
		else if (z == 4){
			x = x - 16;
		}
		Ellipse2D.Double elli = new Ellipse2D.Double(x, y,
				temp.getWidth(), temp.getHeight());
		snakeBody.set(0, (Ellipse2D.Double) elli);
	}



	public int getLength() {
		return snakeBody.size();
	}
	
	public Ellipse2D.Double getHead() {

		return snakeBody.get(0);

	}
}
