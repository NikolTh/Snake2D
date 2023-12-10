package com.mtala3t.snake2d;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;
import java.util.ArrayList;

public class Collision {
	
	public boolean isBoundryCollisioned(int d, ArrayList<Double> k) {
		
		if (d == 1) {
			double centerY = ((Ellipse2D.Double) k.get(0))
					.getMinY();
			return centerY < 127;
		} else if (d == 2) {
			double centerY = ((Ellipse2D.Double) k.get(0))
					.getMaxY();
			return centerY > 591;
		} else if (d == 3) {
			double centerX = ((Ellipse2D.Double) k.get(0)).x;
			return centerX > 819;
		} else if (d == 4) {
			double centerX = ((Ellipse2D.Double) k.get(0))
					.getMinX();
			return centerX < 227.0;
		}
		return false;
	}

	public boolean isSelfCollisioned(int dir, ArrayList<Double> b) {
        Ellipse2D.Double firstEllipse = (Ellipse2D.Double) b.get(0);

        for (int i = 1; i < b.size(); i++) {
            Ellipse2D.Double currentEllipse = (Ellipse2D.Double) b.get(i);

            if (checkOverlap(dir, firstEllipse, currentEllipse)) {
                return true;
            }
        }

        return false;
    }

    private boolean checkOverlap(int dir, Ellipse2D.Double firstEllipse, Ellipse2D.Double currentEllipse) {
        if (dir == 1) {
                return (firstEllipse.getMinY() == currentEllipse.getMaxY())
                        && (firstEllipse.getCenterX() == currentEllipse.getCenterX());
        }
        else if (dir == 2) {
        	return (firstEllipse.getMaxY() == currentEllipse.getMinY())
                        && (firstEllipse.getCenterX() == currentEllipse.getCenterX());
        }
        else if (dir == 3) {
        	return (firstEllipse.getMaxX() == currentEllipse.getMinX())
                        && (firstEllipse.getCenterY() == currentEllipse.getCenterY());
        }
        else if (dir == 4) {
        	return (firstEllipse.getMinX() == currentEllipse.getMaxX())
                        && (firstEllipse.getCenterY() == currentEllipse.getCenterY());
        }
            
        return false;
        }
	
	public boolean isFoodCollisioned(int direction,Ellipse2D.Double head, Double k) {


		if (direction == 1 || direction == 2) {
			if ((head.getCenterY() == k.getCenterY()) && (head.getCenterX() == k.getCenterX())) {
				return true;
			} 
				
		} 
		
		else if (direction == 3 || direction == 4) {
			if ((head.getCenterX() == k.getCenterX()) && (head.getCenterY() == k.getCenterY())) {
				return true;
			} 
		} 
		

		return false;

	}
}
