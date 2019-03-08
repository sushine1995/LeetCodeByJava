
/** 
* @author  suzw
* @version 创建时间：2018年4月24日 上午10:04:41 
* 类说明 
* 给定一个字符串 S 和一个字符 C。返回一个代表字符串 S 中每个字符到字符串 S 中的字符 C 的最短距离的数组。
示例 1:
输入: S = "loveleetcode", C = 'e'
输出: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]
说明:
字符串 S 的长度范围为 [1, 10000]。
C 是一个单字符，且保证是字符串 S 里的字符。
S 和 C 中的所有字母均为小写字母。
*/
public class _821_ShortestDistanceToACharacter_字符的最短距离 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "loveleetcode";
		char C = 'e';
		shortestToChar(S, C).toString();
		//System.out.println(shortestToChar(S, C).toString());
	}
	
	
	public static int[] shortestToChar(String S, char C) {
		int len = S.length();
		int[] ans = new int[len];
		int pos= len;
		
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i)== C) {
				pos = i;
			}
			ans[i] = Math.min(Math.abs(i-pos), len);
		}
		/*
		for (int i : ans) {
			System.out.println(i);
			
		}
		*/
		for (int i = len-1; i >=0 ; i--) {
			if (S.charAt(i)== C) {
				pos = i;
			}
			ans[i] = Math.min(Math.abs(i-pos), ans[i]);
		}
		for (int i : ans) {
			System.out.println(i);
		}
        return ans;
    }
}

