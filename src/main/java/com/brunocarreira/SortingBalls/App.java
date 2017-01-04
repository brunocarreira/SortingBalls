package com.brunocarreira.SortingBalls;

import java.util.Scanner;

/**
 * Main method with a console to request the amount of drawn numbers and each number
 *
 */
public class App 
{
	
    // Add a sorted ball in the list and print the list
    private static void readInput(Scanner scanner, Rack rack){
    	boolean repeatRead=false;
		do{
			System.out.println("Give me a ball ");
			if (scanner.hasNextInt()){
				int in = scanner.nextInt();
		    	if ((in >= 0) && (in <= 60)){
		    		rack.add(new Ball(in));
		    		System.out.println(rack.toString());
		    		break;
		    	}
		    	else System.out.println("Write a number between 0 and 60!"); 
			}
			else {
				System.out.println("Invalid number!");
				scanner.next();
			}
			repeatRead=true;
		} while(repeatRead);    	
    }
	
    public static void main( String[] args )
    {
		Rack rack = new Rack();
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many balls to be drawn?");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++){
			readInput(scanner, rack);
		}
		scanner.close();
    }
}
