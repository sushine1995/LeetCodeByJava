/** 
* @author  suzw
* @version ����ʱ�䣺2018��9��12�� ����10:52:22 
* ��˵�� :�Ա�213_��β�ķ�������
* ����һ��רҵ��С͵���ƻ�͵���ؽֵķ��ݡ�ÿ�䷿�ڶ�����һ�����ֽ�Ӱ����͵�Ե�Ψһ��Լ���ؾ������ڵķ���װ���໥��ͨ�ķ���ϵͳ������������ڵķ�����ͬһ���ϱ�С͵���룬ϵͳ���Զ�������
����һ������ÿ�����ݴ�Ž��ķǸ��������飬�������ڲ���������װ�õ�����£��ܹ�͵�Ե�����߽�
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
public class _198_House_Robber_���͵�Խ��_�������� {

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
