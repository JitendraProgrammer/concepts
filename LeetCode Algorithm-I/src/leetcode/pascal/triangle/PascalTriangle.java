package leetcode.pascal.triangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle {

	public static void main(String[] args) {
		// List<List<Integer>> list = generate(7);
		
	}

	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> row, pre = null;
		for (int i = 0; i < numRows; ++i) {
			row = new ArrayList<Integer>();
			for (int j = 0; j <= i; ++j)
				if (j == 0 || j == i)
					row.add(1);
				else
					row.add(pre.get(j - 1) + pre.get(j));
			pre = row;
			res.add(row);
		}
		return res;
	}

	public static int arraysPair(int[] nums) {
		Arrays.sort(nums);
		int result = 0;
		// 1,4,3,2,5,7,9
		// 1,2,3,4,5,7,9,10
		for (int i = 0; i < nums.length - 1; i += 2) {
			result += nums[i];
		}
		return result;
	}
}

