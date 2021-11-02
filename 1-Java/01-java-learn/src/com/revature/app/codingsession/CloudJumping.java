package com.revature.app.codingsession;

public class CloudJumping {

	public static void main(String[] args) {
		int[] c = {0,0,1,0,0,1,1,0};
		int k =2;
		int n=c.length;
		int energy = 100;
		int x =0;
		boolean firsttime=true;
//		for(int i=0;i<=n;i=(i+k%n)) {
//			//System.out.println("inside");
//			if(firsttime==true && i == 0) {
//				firsttime = false;
//			}
//			if(c[i]==1) {
//				energy = energy-1-2;
//			}
//			else {
//				energy=energy-1;
//			}
//		}
		int i=0;
		while(x!=1) {
			if(c[i]==1) {
				energy = energy-1-2;
			}
			else {
				energy=energy-1;
			}
			i=(i+k)%n;
			if(i==0) {
				x=1;
			}
		}
		System.out.println(energy);

	}

}
