package com.revature.app.codingsession;

//int[][] arr = { {1,1,2,2}, {1,1,2,2}, {2,2,3,3}, {2,2,3,3}};

//display total of each 2x2 sub array



public class Demo {

	public static void main(String[] args) {
		int[][] res = {{0,0},{0,0}};
		int[][] arr = { {1,1,2,2}, {1,1,2,2}, {2,2,3,3}, {2,2,3,3}};
		int sum = 0;
		int count =0;
		int k=0;
		int l=0;
		for(int i = 0; i <= 3; i++) {
			for(int j = 0; j <=1; j++) {
				sum += arr[l][k];
			     count++;
			     if(count == 4) {
			    	 System.out.println(sum);
			    	 count=0;
			    	 sum =0;
			     }
			     l++;
			     }k++;
			     
			}
		} //System.out.println(sum);
	}


