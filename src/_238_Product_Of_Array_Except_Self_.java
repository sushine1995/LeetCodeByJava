/** 
* @author  suzw
* @version ����ʱ�䣺2018��10��15�� ����10:18:36 
* ��˵�� 
* 
Given an array nums of n integers where n > 1,  return an array output such that output[i] is 
equal to the product of all the elements of nums except nums[i].
Example:
Input:  [1,2,3,4]
Output: [24,12,8,6]
Note: Please solve it without division and in O(n).
Follow up:
Could you solve it with constant space complexity? (The output array does not count as extra space 
for the purpose of space complexity analysis.)

*/
public class _238_Product_Of_Array_Except_Self_ {

    public int[] productExceptSelf(int[] nums) {
     
    	int[] ans = new int[nums.length];
    	ans[0] = 1;
    	//�ȼ���nums[i]���Ԫ�صĳ˻����洢��ans[i]��
    	for (int i = 1; i < nums.length; i++) {
			ans[i] = ans[i-1] * nums[i-1];
		}
    	int right = 1;
    	//�ټ���nums[i]�Ҳ��Ԫ�س˻������������Ҳ�˻���ˣ���������Ҫ�Ľ��
    	for (int i = nums.length -1; i >=0; i--) {
			ans[i] *= right;
			right *=nums[i];
			
		}
    	/*��������Ҳ����д�ɣ�
		 * 
		 * for (int i = nums.length -2; i >=0; i--) {
			ans[i] *= ans[i+1]*right;
			right  *= nums[i+1];
		}
		 */
    	return ans;
    	
    	
    	
    }
}
