
/** 
* @author  suzw
* @version 创建时间：2018年4月18日 上午10:22:02 
* 类说明 
* Pick One

The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
Given two integers x and y, calculate the Hamming distance.
Note:
0 ≤ x, y < 231. 
Example: 
Input: x = 1, y = 4

Output: 2

Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑

The above arrows point to positions where the corresponding bits are different.
*/
public class _461_HammingDistance {
	public static void main(String[] args) {
		
		hammingDistance(1, 2);
	}
	
	public static int hammingDistance(int x ,int y) {
		int ans=0;
		int xor = x ^y;
		String Bxor = Integer.toBinaryString(xor);
		char[] cxor = Bxor.toCharArray();
		for (char c : cxor) {
			if (c == '1') {
				ans++;
				
			}
		}
		
		return ans;
		
	}
}
