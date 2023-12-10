/*
 * InputManger.java
 *
 * Created on 28 ����, 2007, 01:32 �
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package com.mtala3t.snake2d;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
*
* @author Mohammed.Talaat (mtala3t)
* @version 1.0
*/
public class InputManger implements KeyListener {

	private GameBoardPanel gameBoard;

	public InputManger(GameBoardPanel gameBoard) {
		this.gameBoard = gameBoard;
	}

	public void keyTyped(KeyEvent e) {
	}

	public void keyPressed(KeyEvent e) {
	       int key = e.getKeyCode();

	       handleDirectionKeys(key);
	       handleGameControlKeys(key);
	   }

	public void keyReleased(KeyEvent e) {
	}

	private void handleDirectionKeys(int key) {
		if (key == KeyEvent.VK_UP) {

			gameBoard.changeSnakeDirection(1);

		} else if (key == KeyEvent.VK_DOWN) {

			gameBoard.changeSnakeDirection(2);

		} else if (key == KeyEvent.VK_RIGHT) {

			gameBoard.changeSnakeDirection(3);

		} else if (key == KeyEvent.VK_LEFT) {

			gameBoard.changeSnakeDirection(4);
		}
	}
	
	private void handleGameControlKeys(int key) {
		if (key == KeyEvent.VK_SPACE) {
			toggleGamePause();
		}
		else if (key == KeyEvent.VK_ESCAPE) {
			exitGame();
		}
	    
	}

	    private void toggleGamePause() {
	        if (gameBoard.isGameRunning()) {
	            gameBoard.pauseGame();
	        } else {
	            gameBoard.startGame();
	        }
	    }

	    private void exitGame() {
	        System.exit(0);
	    }

}
