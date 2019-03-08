

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/** 
* @author  suzw
* @version 创建时间：2018年5月16日 上午10:00:04 
* 类说明 
* 给定两个没有重复元素的数组 nums1 和 nums2 ，其中nums1 是 nums2 的子集。找到 nums1 中每个元素在 nums2 中的下一个比其大的值。
nums1 中数字 x 的下一个更大元素是指 x 在 nums2 中对应位置的右边的第一个比 x 大的元素。如果不存在，对应位置输出-1。
示例 1:
输入: nums1 = [4,1,2], nums2 = [1,3,4,2].
输出: [-1,3,-1]
解释:
    对于num1中的数字4，你无法在第二个数组中找到下一个更大的数字，因此输出 -1。
    对于num1中的数字1，第二个数组中数字1右边的下一个较大数字是 3。
    对于num1中的数字2，第二个数组中没有下一个更大的数字，因此输出 -1。
示例 2:
输入: nums1 = [2,4], nums2 = [1,2,3,4].
输出: [3,-1]
解释:
    对于num1中的数字2，第二个数组中的下一个较大数字是3。
    对于num1中的数字4，第二个数组中没有下一个更大的数字，因此输出 -1。
注意:
nums1和nums2中所有元素是唯一的。
nums1和nums2 的数组大小都不超过1000。


您是否在真实的面试环节中遇到过这道题目呢？  是的没有

题目难度：
简单

*/
public class _496_NextGreaterElementI_下一个更大元素 {
/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {4,1,2};
		int[] nums2 = {1,3,4,2};
		nextGreaterElement(nums1, nums2);
	}
	*/
	 public  int[] nextGreaterElement(int[] nums1, int[] nums2) {
	        int[] ans = new int[nums1.length];
	        Map<Integer, Integer> map = new HashMap<>();
	        Stack<Integer> stack = new Stack<>();
	        //将nums2降序排列，并在map中存储比num大的数
	        for (int num : nums2) {
	        	while( !stack.empty() && stack.peek()< num)
	        		map.put(stack.pop(), num);
	        	stack.push(num);
			}
	        for(int i=0 ;i<nums1.length;i++)
	        	ans[i]=map.getOrDefault(nums1[i], -1);
	        return ans;
	    }
	 public static int[] nextGreaterElement1(int[] nums1, int[] nums2) {
	        int[] ans = new int[nums1.length];
	        Map<Integer, Integer> map = new HashMap<>();
	        Stack<Integer> stack = new Stack<>();
	        //将nums2降序排列，并在map中存储比num大的数
	        for (int num : nums2) {
	        	//只要找到比num大的第一个数，就pop. 
	        	while( !stack.empty() && stack.peek()< num) {
	        		int a=stack.pop();
	        		System.out.println(a +"+" + num);
	        		map.put(a, num);
	        	}
	        	System.out.println(num);
	        	stack.push(num);
			}
	        for(int i=0 ;i<nums1.length;i++)
	        	ans[i]=map.getOrDefault(nums1[i], -1);
	        return ans;
	    }
}
