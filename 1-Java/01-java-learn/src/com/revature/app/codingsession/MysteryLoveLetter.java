package com.revature.app.codingsession;

public class MysteryLoveLetter {

	public static void main(String[] args) {
		String r ="";
		String s="pqrqpt";
		int diff =0;
            for(int j=0;j<=s.length()/2;j++) {
            	diff += Math.abs(s.charAt(j)-s.charAt(s.length()-(j+1)));
            }
            //System.out.println(diff);
            System.out.println(8%8);
        }
 
}

