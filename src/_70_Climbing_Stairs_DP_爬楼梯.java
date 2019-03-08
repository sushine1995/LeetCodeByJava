

/** 
* @author  suzw
* @version 创建时间：2018年10月18日 下午8:55:32 
* 类说明 
* You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Note: Given n will be a positive integer.

Example 1:

Input: 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:

Input: 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
*/
public class _70_Climbing_Stairs_DP_爬楼梯 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//f(n)=f(n-1_+f(n-2)
	/*
	 * 方法一：利用n个楼梯的步数，与n-1还有n-2之间的关系可以退出，f(n)==f(n-1)+f(n-2),相当于是直接考虑为n-1再上一步，
	 * 和n-2直接上两步，不能考虑n-2有两种走法（一步一步，和一次两步，一步一步的会和n-1中的重复，导致算多了），
	 * 最后不断的迭代直至可以n==1或者n==2，可以直接求出结果。
	 * 这个方法相当于是根据各个阶段之间的关系，列出迭代关系，并且写出临界解，从而结束递归的过程，
	 * 否则将一直递归下去（所有的递归都是如此，如果没有边界条件提前结束递归，递归将不会停止。
	 * 这个时间复杂度是2^n相当于是一颗二叉树来着，leetcode显示time limit exceed
	 */

	 public static int climbStairsByRecursion(int n) {
		 
		 if (n==1 || n==2) 
			return n;
		 return climbStairsByRecursion(n-1)+climbStairsByRecursion(n-2);
	 }	
	 /*方法二：利用迭代来实现尾递归
	  * 由于方法一是利用了尾递归来实现算法，考虑采用迭代来实现递归，并且递归本身算法复杂度是要远远大于其对应的迭代循环算法复杂度的，
	  * 所以考虑利用迭代来减少时间复杂度。两种方法的差别在于递归是从上往下算，迭代是从下往上算。
	  */
	 public static int climbStairs(int n) {
		    if(n==1 || n==2) return n;
	        int[] ans= new int[n+1];
	        ans[1] = 1;
	        ans[2] = 2;
	        for (int i = 3; i < n+1; i++) {
	        	ans[i] = ans[i-1]+ ans[i-2];
			}
	        return ans[n];
	    }

}
