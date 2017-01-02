import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Class responsible for keeping a list of sorted balls in ascending order and print them 
 * @author Bruno Carreira
 *
 */
public class Rack {

	// List of balls to be drawn
    private List<Integer> balls;

    // Constructor
    public Rack() {
        balls = new ArrayList<Integer>();
    }

    // Returns sorted balls so far
    public List<Integer> getBalls() {
        return balls;
    }

    // Add a sorted ball in ascending order
    public void add(int ballToAdd) {
        int i = 0;
        for(int ball: balls) {
            if(ballToAdd < ball) {
                break;
            }
            i++;
        }
        balls.add(i, ballToAdd);
    }

    // Print balls sorted so far
    public void printBalls() {
    	StringBuilder sbBalls = new StringBuilder();
    	String prefix = "";
        for(int ball: balls) {
        	sbBalls.append(prefix);
        	prefix = ",";
        	sbBalls.append(ball);
        }
        System.out.println(sbBalls);
    }

    // Add a sorted ball in the list and print the list
    public void readInput(int ball){
    	this.add(ball);
    	this.printBalls();
    }
    
    // Main method with a console to request the amount of drawn numbers and each number
	public static void main(String[] args) {
		Rack rack = new Rack();
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many balls to be drawn?");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++){
		    System.out.println("Give me a ball ");
		    int in = scanner.nextInt();
			rack.readInput(in);
		}
		scanner.close();
	}
}