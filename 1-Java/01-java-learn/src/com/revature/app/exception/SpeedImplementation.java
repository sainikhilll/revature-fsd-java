package com.revature.app.exception;

public class SpeedImplementation {
	public static void main(String[] args) {
		
	}
	 static String setSpeed(Speed s, int spd) throws SpeedInvalidException{
			String sp = "";
		 if(spd<30 || spd>90) {
		 throw new SpeedInvalidException("SpeedInvalidException");
		 }
		 else {
			sp = " valid speed";
		 }
		 return sp;
	 
}
}
