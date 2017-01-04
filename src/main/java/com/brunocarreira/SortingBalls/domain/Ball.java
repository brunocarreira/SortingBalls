package com.brunocarreira.SortingBalls.domain;

public class Ball {

	private int value;

	public Ball(int value){
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
    @Override
    public String toString() {
        return ""+this.getValue();
    }	
}
