/*
 * SnakeBody.java
 *
 * Created on 22 ����, 2007, 10:54 �
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package com.mtala3t.snake2d;

import java.awt.geom.Ellipse2D;
import java.util.ArrayList;

/**
*
* @author Mohammed.Talaat (mtala3t)
* @version 1.0
*/
public class Snake {

	
	private static final int DEFAULT_SNAKE_DIRECTION = 3;

	

	private int direction;

	public Snake() {

		direction = DEFAULT_SNAKE_DIRECTION;

		
	}

	public void setDirection(int dir) {
		if (direction >= 3 && dir < 3) {
			this.direction = dir;
		} else if (direction <= 2 && dir > 2) {
			this.direction = dir;
		}
	}

	

	public int getDirection() {

		return direction;
	}

	

}
