import java.util.HashMap;

import java.util.Scanner;

/**
 * @author suzw
 * @version 创建时间：2018年4月12日 上午10:07:06 类说明 Given a string, find the length of
 *          the longest substring without repeating characters.
 * 
 *          Example 1:
 * 
 *          Input: "abcabcbb" Output: 3 Explanation: The answer is "abc", with
 *          the length of 3. Example 2:
 * 
 *          Input: "bbbbb" Output: 1 Explanation: The answer is "b", with the
 *          length of 1. Example 3:
 * 
 *          Input: "pwwkew" Output: 3 Explanation: The answer is "wke", with the
 *          length of 3. Note that the answer must be a substring, "pwke" is a
 *          subsequence and not a substring.
 */
public class _003_LongestSubstringWithoutRepeatChars_最长不重复字串 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String getS = new String();
		int answer = 0;
		getS = s.nextLine();

		System.out.println(getS);
		answer = lengthOfLongestSubstring(getS);
		System.out.println(answer);
	}
	//使用j表示字串的起始位置，用i后移，Map更新每个字符最后出现的位置
	
	public static int lengthOfLongestSubstring2(String s) {
		if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max=0;
        for (int i=0, j=0; i<s.length(); ++i){
        	//如果该字符已经出现了，则需要重新计算字串
        	//Max(旧字串的起始位置，重复字符的下一个字符)；
            if (map.containsKey(s.charAt(i))){
                j = Math.max(j,map.get(s.charAt(i))+1);
            }
            //更新
            map.put(s.charAt(i),i);
            max = Math.max(max,i-j+1);
        }
        return max;
    }
	public static int lengthOfLongestSubstring(String s) {
		String answer = new String();
		int lenOfAns = 0;
		int lenBak = 0;
		// 标记首尾位置
		int mark[] = new int[2];
		if (s.length() == 0) {
			// return lenBak;
		} else {
			lenOfAns = lenBak = 1;

			int j = 0;
			for (int i = 0; i < s.length() - 1; i++) {
				answer = "";
				// answer = answer+s.charAt(i);
				for (; j < s.length(); j++) {
					int a = answer.indexOf(s.charAt(j));
					if (a == -1) {
						answer += s.charAt(j);
						lenOfAns = j - i + 1;
						if (lenOfAns > lenBak) {
							mark[0] = i;
							mark[1] = j;
							lenBak = lenOfAns;
						}
						// System.out.println(answer);
						if (j == s.length() - 1) {
							return lenBak;
						}
					} else {
						j = a + lenBak;
						// System.out.println(i);
						break;
					}
				}
			}
		}
		// System.out.println(lenBak +' '+ lenOfAns);
		return lenBak;
	}

	

}
