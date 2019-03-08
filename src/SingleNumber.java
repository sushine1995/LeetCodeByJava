

import java.lang.reflect.Array;
import java.util.Arrays;

/** 
* @author  suzw
* @version 创建时间：2018年5月26日 上午9:54:13 
* 类说明 
* Given a non-empty array of integers, every element appears twice except for one. Find that single one.
Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
Input: [2,2,1]
Output: 1
Input: [4,1,2,1,2]
Output: 4
*/
public class SingleNumber {
	public static void main(String[] args) {
		int nums[] = {4,1,2,1,2};
		System.out.println(singleNumber(nums));
	}
	
	/*使用异或，1ms
	 * ans和同一个数异或两次后，值不变，最后剩下的就是ans本身
	 * **/
    public static int singleNumber(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++)
            ans=ans^nums[i];
        
        return ans;
    }
    public static int singleNumber2(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
        	//注意,要先判断长度，所以放在&&的左边
			if ((i + 1) <nums.length&& nums[i] == nums[i+1]  ) {
				i++;
			}
			else return nums[i];
		}
        return 0;
    	//return ;
    }
}
