/**
 * @author suzw
 * @version 创建时间：2018年8月31日 上午10:34:33 类说明
 */
public class FindMinimumInRotatedSortedArrayII154 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = { 3, 1 };
		// int nums[]= {3,1};
		System.out.println(findMin(nums));
	}

	public static int findMin(int[] nums) {
		int middle = 0;
		int low = 0;
		int high = nums.length - 1;
		/*
		for (; middle != low || middle != high;) {
			middle = (low + high) / 2;
			System.out.print(middle);
			System.out.println("," + nums[middle]);
			if (nums[low] < nums[high]) {
				high = middle;
			} else if (nums[low] == nums[high]) {
				high--;
			} else
				low = middle;
			if (high - low == 1) {
				return Math.min(nums[low], nums[high]);

			}
		}
		*/
		for (; low <high;) {
			middle = (low+high)/2;
			System.out.print(middle);
			System.out.println("," + nums[middle]);
			if (nums[middle]<nums[high]) {
				high = middle;
			}
			else if (nums[middle] == nums[high]) {
				high--;
			}
			else low = middle+1;
			/*
			if (high - low == 1) {
				return Math.min(nums[low], nums[high]);
			}
			*/
		}
		
		return nums[middle];

	}
}
