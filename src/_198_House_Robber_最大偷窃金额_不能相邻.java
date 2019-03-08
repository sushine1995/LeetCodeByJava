/** 
* @author  suzw
* @version 创建时间：2018年9月12日 上午10:52:22 
* 类说明 :对比213_首尾的房屋相邻
* 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
给定一个代表每个房屋存放金额的非负整数数组，计算你在不触动警报装置的情况下，能够偷窃到的最高金额。
* Example 1:
Input: [1,2,3,1]
Output: 4
Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
             Total amount you can rob = 1 + 3 = 4.
Example 2:
Input: [2,7,9,3,1]
Output: 12
Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
             Total amount you can rob = 2 + 9 + 1 = 12.
*/
public class _198_House_Robber_最大偷窃金额_不能相邻 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}



	public int robModel(int[] num) {
    int[][] dp = new int[num.length + 1][2];
    for (int i = 1; i <= num.length; i++) {
        dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1]);
        dp[i][1] = num[i - 1] + dp[i - 1][0];
    }
    return Math.max(dp[num.length][0], dp[num.length][1]);
}
	public int rob(int[] num) {
		int preYes = 0;
		int preNo = 0;
		for (int i : num) {
			int temp = preNo;
			preNo = Math.max(preNo, preYes);
			preYes = i + temp;
		}
		return Math.max(preNo, preYes);
		
	}
}
