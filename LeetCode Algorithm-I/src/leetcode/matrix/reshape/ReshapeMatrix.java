package leetcode.matrix.reshape;

import java.util.Arrays;

public class ReshapeMatrix {
	public static int[][] matrixReshape(int[][] nums, int r, int c) {
		int row = nums.length;
		if (row == 0) {
			return nums;
		}
		int col = nums[0].length;
		if (col == 0) {
			return nums;
		}
		int newSize = r * c;
		int currentSize = row * col;
		if (newSize != currentSize) {
			return nums;
		}
		int[][] result = new int[r][c];
		int k = 0;
		int l = 0;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				result[i][j] = nums[k][l];
				if (l == col - 1) {
					k++;
				}
				l = (l + 1) % col;
			}
		}
		return result;
	}

	public static void main(String[] args) {

		int r = 1;
		int c = 4;
		int[][] matrix = { { 1, 2 }, { 3, 4 } };

		//int xp[][] = matrixReshape(Arrays.toString(matrix), r,c);
		System.out.println(Arrays.toString(matrixReshape(matrix, r,c)));
		

	}
}
