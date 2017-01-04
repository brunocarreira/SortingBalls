package com.brunocarreira.SortingBalls;

import com.brunocarreira.SortingBalls.domain.Ball;
import com.brunocarreira.SortingBalls.domain.Rack;

import junit.framework.TestCase;

/**
 * Unit test for App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Test the insertion in correct order
     * The range test (0-60) is not made because it's not a domain requirement
     */
    public void testInsertionBalls()
    {
    	Rack rack = new Rack();
    	rack.add(new Ball(10));
    	assertEquals("10", rack.toString());
    	
    	rack.add(new Ball(30));
    	assertEquals("10,30", rack.toString());

    	rack.add(new Ball(20));
    	assertEquals("10,20,30", rack.toString());
    }
}
