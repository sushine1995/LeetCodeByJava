
import java.util.ArrayList;

import java.util.List;

/** 
* @author  suzw
* @version ����ʱ�䣺2018��10��11�� ����8:21:31 
* ��˵��
* 
* ����ͶƱ�㷨(Boyer-Moore Algorithm)��
* https://blog.csdn.net/kimixuchen/article/details/52787307
* https://www.jianshu.com/p/dfd676b71ef0
* 
*  		���㷨ʱ�临�Ӷ�ΪO(n)���ռ临�Ӷ�ΪO(1)��ֻ��Ҫ��ԭ�����������ɨ�裬���Ҽ���ʵ�֡�
*  		��һ��ɨ�����ǵõ�һ����ѡ�ڵ�candidate���ڶ���ɨ�������ж�candidate���ֵĴ����Ƿ���� n/2 ��
* һ��ⷨ��
*  		�ȶ���������Ȼ��ȡ�м�λ�õ�Ԫ�أ��ٶ�����ɨ��һ�����жϴ�Ԫ���Ƿ�Ϊ����Ԫ�ء�ʱ�临�Ӷ�O(nlog(n))���ռ临�Ӷ�O(1)��
		ʹ��һ��hash�����������һ��ɨ��ͳ��ÿ��Ԫ�س��ֵĴ��������ɵõ�����Ԫ�ء�ʱ�临�Ӷ�O(n)���ռ临�Ӷ�O(n)��
* 
* Given an integer array of size n, find all elements that appear more than  n/3 times.
Note: The algorithm should run in linear time and in O(1) space.
Example 1:
Input: [3,2,3]
Output: [3]
Example 2:
Input: [1,1,1,3,3,2,2,2]
Output: [1,2]
*/
public class _229_Majority_Element_II_ͳ�����ֳ��ֵĸ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
    public static List<Integer> majorityElement(int[] nums) {
    	  List<Integer> ans = new ArrayList<>();
          if (nums.length == 0) {
  			return ans;
  		}
          int count1=0;
          int count2=0;
          int candidate1=nums[0];
          int candidate2=nums[0];
          
          for (int i = 0; i < nums.length; i++) {
  			if (nums[i] == candidate1) {
  				count1++;
  			}else if (nums[i] == candidate2) {
  				count2++;
  			}else if (count1==0) {
  				candidate1 = nums[i];
                  count1 =1;
  			}else if (count2 == 0) {
  				candidate2 = nums[i];
                  count2= 1;
  			}else {
  				count1--;
  				count2--;
  			}
  		}
          count1 = count2 = 0;
          for (int i : nums) {
          	if (i == candidate1) {
  				count1++;
  			}else if (i == candidate2) {
  				count2++;
  			}
  		}
          if (count1>nums.length/3) {
  			ans.add(candidate1);
  			
  		}
          if (count2>nums.length/3  && candidate2!=candidate1) {
  			ans.add(candidate2);
  			
  		}
          
          
          return ans;

    }
}
