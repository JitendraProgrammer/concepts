package leetcode.binarysearch;


public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 6 };
		int key = 10;

		int mat[][] = { { 1, 3 } };

		boolean matrix = searchMatrix(mat, 3);
		System.out.println(matrix);
	       
	}

	public static int binarySearch0(int[] arr, int key) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) >>> 1;
			if (key == arr[mid])
				return mid;
			else if (key < arr[mid])
				high = mid - 1;
			else
				low = mid + 1;
		}
		return low;
	}

	public static int searchInsert(int[] nums, int target) {
		int low = 0, high = nums.length - 1;
		while (low <= high) {
			int mid = (low + high) >>> 1;
			if (nums[mid] == target)
				return mid;
			else if (nums[mid] > target)
				high = mid - 1;
			else
				low = mid + 1;
		}
		return high;
	}

	public static int binarySearch(int arr[], int x) {
		int l = 0, r = arr.length - 1;
		while (l <= r) {
			int m = l + (r - l) / 2;

			// Check if x is present at mid
			if (arr[m] == x)
				return m;

			// If x greater, ignore left half
			if (arr[m] < x)
				l = m + 1;

			// If x is smaller, ignore right half
			else
				r = m - 1;
		}

		// if we reach here, then element was
		// not present
		return -1;
	}

	public static boolean searchMatrix0(int[][] arr, int target) {
		int i = 0;
		int j = arr[0].length - 1;
		while (i < arr.length && j >= 0) {
			if (arr[i][j] == target) {
				return true;
			} else if (arr[i][j] > target) {
				j--;
			} else if (arr[i][j] < target) {
				i++;
			}

		}
		return false;
	}

	/**
	 * Use binary search. n * m matrix convert to an array => matrix[x][y] => a[x *
	 * m + y] an array convert to n * m matrix => a[x] =>matrix[x / m][x % m];
	 * 
	 * @param matrix
	 * @param target
	 * @return
	 */
	public static boolean searchMatrix(int[][] matrix, int target) {
		int n = matrix.length;
		int m = matrix[0].length;
		int l = 0;
		int r = n * m - 1;
		while (l != r) {
			int mid = (l + r - 1) >> 1;
			if (matrix[mid / m][mid % m] < target) {
				l = mid + 1;
			} else
				r = mid;
		}

		return matrix[r / m][r % m] == target;

	}
}
