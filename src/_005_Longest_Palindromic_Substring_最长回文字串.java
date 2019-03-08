

/** 
* @author  suzw
* @version 创建时间：2018年12月18日 下午5:02:20 
* 类说明 
* 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
关键在于：区分奇数和偶数长度的回文串
示例 1：

输入: "babad"
输出: "bab"
注意: "aba" 也是一个有效答案。
示例 2：

输入: "cbbd"
输出: "bb"
*/
public class _005_Longest_Palindromic_Substring_最长回文字串 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(longestPalindrome("babad"));
		//System.out.println(longestPalindrome("bb"));
		_005_Longest_Palindromic_Substring_最长回文字串 t= new _005_Longest_Palindromic_Substring_最长回文字串();
		System.out.println(t.longestPalindrome("cccc"));
	}
	
	private int lo, maxLen;

	public String longestPalindrome(String s) {
		int len = s.length();
		if (len < 2)
			return s;
		
	    for (int i = 0; i < len-1; i++) {
	     	extendPalindrome(s, i, i);  //assume odd length, try to extend Palindrome as possible
	     	extendPalindrome(s, i, i+1); //assume even length.
	    }
	    return s.substring(lo, lo + maxLen);
	}

	private void extendPalindrome(String s, int j, int k) {
		while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
			j--;
			k++;
		}
		if (maxLen < k - j - 1) {
			lo = j + 1;
			maxLen = k - j - 1;
		}
	}
}
