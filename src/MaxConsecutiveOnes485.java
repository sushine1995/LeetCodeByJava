/**
 * 
 */
/** 
* @author  suzw
* @version 创建时间：2018年7月3日 上午10:17:38 
* 类说明 
*/
/**
 * @author su823
 *
 */
public class MaxConsecutiveOnes485 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,1,1,1,1};
		System.out.println(findMaxConsecutiveOnes(nums));

	}
	public static int findMaxConsecutiveOnes(int[] nums) {
		int ans = 0;
		int current = 0;
		for (int i : nums) {
			if (i == 1) 
				current++;

			if (ans<current) {
					ans = current;
					continue;
			}
			if( i == 0 )
				current = 0;
		}				
		return ans;
	}
	
}
