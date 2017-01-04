package com.brunocarreira.SortingBalls.domain;
import java.util.ArrayList;
import java.util.List;

/**
 * Class responsible for keeping a list of sorted balls in ascending order and print them 
 * @author Bruno Carreira
 *
 */
public class Rack {

	// List of balls to be drawn
    private List<Ball> balls;

    // Constructor
    public Rack() {
        balls = new ArrayList<Ball>();
    }

    // Returns sorted balls so far
    public List<Ball> getBalls() {
        return balls;
    }

    // Add a sorted ball in ascending order
    public void add(Ball ballToAdd) {
        int i = 0;
        for(Ball ball: balls) {
            if(ballToAdd.getValue() < ball.getValue()) {
                break;
            }
            i++;
        }
        balls.add(i, ballToAdd);
    }

    @Override
    public String toString() {
    	StringBuilder sbBalls = new StringBuilder();
    	String prefix = "";
        for(Ball ball: balls) {
        	sbBalls.append(prefix);
        	prefix = ",";
        	sbBalls.append(ball);
        }
        return sbBalls.toString();
    }
    
}