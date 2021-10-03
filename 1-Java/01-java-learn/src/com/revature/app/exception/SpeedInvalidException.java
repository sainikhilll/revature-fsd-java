package com.revature.app.exception;

public class SpeedInvalidException extends Exception{

	public SpeedInvalidException() {
		super();
		
	}

	public SpeedInvalidException(String message) {
		super(message);
		
	}

	public static void main(String[] args) {
		Speed s = new Speed();
		
		try {
			s.setSpeed(SpeedImplementation.setSpeed(s, 965));
			System.out.println(s.getSpeed());
		} catch (SpeedInvalidException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}

	}

}
