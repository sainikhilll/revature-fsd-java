//1	3	1	5
//2	2	4	1
//5	0	2	3
//0	6	1	2
//

package com.revature.app.codingsession;

public class Goldmine {

	public static void main(String[] args) {
		int[][] arr = { { 1, 3, 1, 5 }, { 2, 2, 4, 1 }, { 5, 0, 2, 3 }, { 0, 6, 1, 2 } };
		int[][] sol = new int[4][4];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				sol[i][j] = arr[i][j];
			}
		}
		for (int r = 0; r < 4; r++) {
			for (int c = 1; c < 4; c++) {
				if (r == 0) {
					sol[r][c] = sol[r][c] + Math.max(arr[r][c], arr[r + 1][c]);
				} else if (r==3) {
					sol[r][c] += Math.max(arr[r - 1][c], arr[r][c]);
					
				} else {
					sol[r][c] += Math.max(Math.max(arr[r - 1][c], arr[r][c]), arr[r + 1][c]);
				}
			}

		}

		int max = 0;
		for (int k = 0; k < 4; k++) {
			for (int l = 0; l < 4; l++) {
				if (sol[k][l] >= max)
					max = sol[k][l];

			}

		}
		System.out.println(max);
	}
}
