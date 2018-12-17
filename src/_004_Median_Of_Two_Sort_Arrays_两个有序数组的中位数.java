/** 
* @author  suzw
* @version 创建时间：2018年8月31日 下午2:13:23 
* 类说明 
*/
public class _004_Median_Of_Two_Sort_Arrays_两个有序数组的中位数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1,2,3,4,5,6,7,10,11};
		int[] B = {3,5,7,8,9};
		System.out.println(findMedianSortedArrays(A, B));
	}
	public static double findMedianSortedArrays(int[] A, int[] B) {

		int m = A.length;

		int n = B.length;

		if (m > n) { // to ensure m<=n

			int[] temp = A;

			A = B;

			B = temp;

			int tmp = m;

			m = n;

			n = tmp;

		}

		int iMin = 0, iMax = m, halfLen = (m + n + 1) / 2;

		while (iMin <= iMax) {
			
			int i = (iMin + iMax) / 2;

			int j = halfLen - i;
			System.out.println("i:"+i+",j:"+j+",iMin:"+ iMin + ",iMax:"+iMax);
			if (i < iMax && B[j - 1] > A[i]) {

				iMin = iMin + 1; 						// i is too small

			} else if (i > iMin && A[i - 1] > B[j]) {

				iMax = iMax - 1; 						// i is too big

			} else { 									// i is perfect

				int maxLeft = 0;

				if (i == 0) {

					maxLeft = B[j - 1];

				} else if (j == 0) {

					maxLeft = A[i - 1];

				} else {

					maxLeft = Math.max(A[i - 1], B[j - 1]);

				}

				if ((m + n) % 2 == 1) {

					return maxLeft;

				}



				int minRight = 0;

				if (i == m) {

					minRight = B[j];

				} else if (j == n) {

					minRight = A[i];

				} else {

					minRight = Math.min(B[j], A[i]);

				}
				System.out.println("maxLeft:"+maxLeft + ",minRight:" + minRight);


				return (maxLeft + minRight) / 2.0;

			}

		}

		return 0.0;

	}
	/*
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
    	
    	
    	//确保nums1[0]最小
    	if (nums1[0] > nums2[0]) {
    		int temp[] = Arrays.copyOf(nums1, nums1.length);
    		nums1 = Arrays.copyOf(nums2, nums2.length);
    		nums2 = Arrays.copyOf(temp, temp.length);
		}
    	int middle1 = nums1.length-1;
    	int middle2 = nums2.length-1;
    	while() {
    		
    	}
    	
    	
        
    }
*/
}
