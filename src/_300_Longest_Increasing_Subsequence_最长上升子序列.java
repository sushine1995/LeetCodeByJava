import java.util.Arrays;

/** 
* @author  suzw
* @version ����ʱ�䣺2018��11��7�� ����5:07:18 
* ��˵�� 
* 1. https://leetcode.com/problems/longest-increasing-subsequence/discuss/152065/Python-explain-the-O(nlogn)-solution-step-by-step
* 2. https://leetcode.com/problems/longest-increasing-subsequence/discuss/74824/JavaPython-Binary-search-O(nlogn)-time-with-explanation
* 3. ��2 ���·����ж��������ķ���
* 
* ����һ�� ����������ʱ�临�Ӷ���2^n������
* �������� DP��ʱ�临�Ӷ�n^2��32ms����
* ��������n*logn
* 	�����Ƚ���һ������ ends������Ԫ�طŽ�ȥ��Ȼ��Ƚ�֮���Ԫ�أ�

	�������������Ԫ�ر�ends�����е���Ԫ��С�Ļ����滻��Ԫ��Ϊ����Ԫ�أ�
	�������������Ԫ�ر�ends�����е�ĩβԪ�ػ���Ļ���������Ԫ����ӵ�ends����ĩβ(ע�ⲻ����ԭĩβԪ��)��
	�������������Ԫ�ر�ends������Ԫ�ش󣬱�βԪ��Сʱ����ʱ�ö��ֲ��ҷ��ҵ���һ����С�ڴ���Ԫ�ص�λ�ã����ǵ�λ�õ�ԭ�������֣�
�Դ�����ֱ������������ nums ���飬��ʱ ends ����ĳ��Ⱦ�������Ҫ��� LIS �ĳ��ȣ��ر�ע����� ends 
�����ֵ���ܲ���һ����ʵ��LIS����������������numsΪ {4, 2�� 4�� 5�� 3�� 7}����ô������ends����Ϊ
{2�� 3�� 5�� 7}�����Է���������һ��ԭ�����LIS��ֻ�ǳ�����ȶ��ѣ�ǧ��Ҫע����㡣

* �����ģ� ʹ�ö��ֲ����Ż���˼·��������n*logn��1ms
* �������ַ��������ƣ�˼·���Ƚ���һ���յ�dp���飬Ȼ��ʼ����ԭ���飬����ÿһ�������������֣�
* �����ö��ֲ��ҷ���dp�����ҵ�һ����С���������֣����������ֲ����ڣ���ôֱ����dp����������
* �����������֣�������ڣ���������ָ���Ϊ��ǰ�����������֣���󷵻�dp���ֵĳ��ȼ��ɣ�ע����ǣ�
* ������ķ���һ�����ر�ע�����dp�����ֵ���ܲ���һ����ʵ��LIS���μ��������£�
--------------------- 
���ߣ�Inside_Zhang 
��Դ��CSDN 
ԭ�ģ�https://blog.csdn.net/lanchunhui/article/details/51611970 
��Ȩ����������Ϊ����ԭ�����£�ת���븽�ϲ������ӣ�
* 
*/
public class _300_Longest_Increasing_Subsequence_����������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] nums = {1,3,2,4,5};
		int[] nums = {10,9,2,5,3,4};
		System.out.println(lengthOfLISBasicN2(nums));
	}
	/*
	 * Explain:
	 * tails is an array storing the smallest tail of all increasing subsequences with 
	 * length i+1 in tails[i].
	For example, say we have nums = [4,5,6,3], then all the available increasing subsequences are:

	len = 1   :      [4], [5], [6], [3]   => tails[0] = 3
	len = 2   :      [4, 5], [5, 6]       => tails[1] = 5
	len = 3   :      [4, 5, 6]            => tails[2] = 6
	We can easily prove that tails is a increasing array. Therefore it is possible to
	 do a binary search in tails array to find the one needs update.
	
	Each time we only do one of the two:
	
	(1) if x is larger than all tails, append it, increase the size by 1
	(2) if tails[i-1] < x <= tails[i], update tails[i]
	Doing so will maintain the tails invariant. The the final answer is just the size.
	 */
	public int lengthOfLIS(int[] nums) {
	    int[] tails = new int[nums.length];
	    int size = 0;
	    for (int x : nums) {
	        int i = 0, j = size;
	        while (i != j) {
	            int m = (i + j) / 2;
	            if (tails[m] < x)
	                i = m + 1;
	            else
	                j = m;
	        }
	        tails[i] = x;
	        if (i == size) ++size;
	    }
	    return size;
	}
	// Runtime: 2 ms
	public int lengthOfLISByBinarySearch(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        if(nums.length == 1) return 1;
        int[] dp = new int[nums.length];
        Arrays.fill(dp,Integer.MAX_VALUE);
        for(int i = 0;i< dp.length;i++){
            int pos = binarySearchPosition(dp,nums[i],i);
            dp[pos] = nums[i];
        }
        for(int i = dp.length - 1;i >= 0;i--){
            if(dp[i] != Integer.MAX_VALUE) return i + 1;
        }
        return 0;
    }
    private int binarySearchPosition(int[] dp,int target,int hi){
        int low = 0;
        while(low <= hi){
            int mid = low + (hi - low)/2;
            if(target == dp[mid]) return mid;
            else if(target < dp[mid]) hi = mid - 1;
            else if(target > dp[mid]) low = mid + 1;
        }
        return low;
    }
    
    //ʹ�� DP�㷨
    public  static int lengthOfLISBasicN2(int[] nums) {
    	int ans = 0;
    	int[] dp = new int[nums.length];
    	for (int i = 0;i<nums.length;i++) {
    		dp[i] = 1;	//��ʼ��
			for (int j = 0 ;j<i;j++) 
				if (nums[j]< nums[i]) 
					dp[i] = Math.max(1 + dp[j], dp[i]);
			ans = Math.max(ans, dp[i]);
		}
    	
    	return ans;
    	
    }
}
