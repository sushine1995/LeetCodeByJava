

/** 
* @author  suzw
* @version ����ʱ�䣺2018��10��30�� ����9:49:29 
* ��˵�� 
* ���������� n���ҵ����ɸ���ȫƽ���������� 1, 4, 9, 16, ...��ʹ�����ǵĺ͵��� n������Ҫ����ɺ͵���ȫƽ�����ĸ������١�

ʾ�� 1:

����: n = 12
���: 3 
����: 12 = 4 + 4 + 4.
ʾ�� 2:

����: n = 13
���: 2
����: 13 = 4 + 9.
https://leetcode.com/problems/perfect-squares/discuss/71488/Summary-of-4-different-solutions-(BFS-DP-static-DP-and-mathematics)
������4��C++����
1. DP;2static DP,�����ظ����㣻3 Mathematic;4 BFS
����������1��2����22ms����3(1ms)��
*/
public class _279_Perfect_Squares_��n��Ϊ��ȫƽ�����ĺ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	//����һ����̬�滮Dynamic Programming
	
	public static int numSquares1(int n ) {
		if(n<=0)	return 0;
		int[] dp = new int[n+1];
		for(int i = 1;i<=n;i++) {
			dp[i] = Integer.MAX_VALUE;
			int sqrt = (int)Math.sqrt(i);
			//���i����ȫƽ��������ô�ͽ�dp[i]��Ϊ1
			if(sqrt * sqrt == i) {
				dp[i] = 1;
				continue;
			}
			//���ڷ���ȫƽ���������������¼�����������Ǵ���ѡȡ��С��ֵ
			/*
			 * dp[n-1]+1
			 * dp[n-4]+1
			 * dp[n-9]+1
			 * dp[n-16]+1�ȵ�
			 */
			for(int j =1;j <= sqrt; j++) {
				int dif = i - j*j;
				dp[i] = Math.min(dp[i], dp[dif]+1);
			}
		}
		return dp[n];
	}
	/*
	 * dp[0] = 0 
dp[1] = dp[0]+1 = 1
dp[2] = dp[1]+1 = 2
dp[3] = dp[2]+1 = 3
dp[4] = Min{ dp[4-1*1]+1, dp[4-2*2]+1 }  = Min{ dp[3]+1, dp[0]+1 }  = 1				
dp[5] = Min{ dp[5-1*1]+1, dp[5-2*2]+1 }  = Min{ dp[4]+1, dp[1]+1 }  = 2
						.
dp[13] = Min{ dp[13-1*1]+1, dp[13-2*2]+1, dp[13-3*3]+1 } 
       = Min{ dp[12]+1, dp[9]+1, dp[4]+1 }       = 2
						.
dp[n] = Min{ dp[n - i*i] + 1 },  n - i*i >=0 && i >= 1
	 */
	/*
	 * ����������ѧ����
	 * ������ƽ������[ Lagrange's Four Square theorem ]�� �κ�һ�������������Ա�ʾ�ɲ������ĸ�������ƽ��֮�͡�
	 * ���ֻ��1��2��3��4���������
	 * 
	 * 
	 
	 */
	
	public static int numSquaresByMathematical(int n) {
		int sqrt = (int)Math.sqrt(n);
		//1. �������ʱ��ȫƽ����ʱ������1
		if(sqrt * sqrt == n)	return 1;
		//2. �����������д�� n = 4^k * (8*m+7)ʱ������4
		//Legendre's three-square theorem
		while((n & 3) == 0)	//n%4 == 0
			n >>=2;
		if((n & 7 ) == 7)// n %8 == 7
			return 4;
		//3. ���������ܱ�ʾ��������ȫƽ�����ĺ͵���ʽ���򷵻�2
		for (int i = 1; i <=sqrt; i++) {
			int sqrt_i = (int)Math.sqrt(n - i*i);
			if (sqrt_i*sqrt_i == (n- i*i)) 		
				return 2;
		}
		//4. ���򷵻�3
		return 3;
	}
}
