package day1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/** 
* @author  suzw
* @version 创建时间：2018年4月12日 上午10:07:06 
* 类说明 
*/
public class LongestSubstringWithoutRepeatChars {

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

    public static int lengthOfLongestSubstring(String s) {
    	String answer = new String();
    	int lenOfAns = 0;
    	int lenBak = 0;
    	//标记首尾位置
    	int mark[] = new int[2];
    	if (s.length() == 0) {
			//return lenBak;
		}
    	else {
    		lenOfAns = lenBak = 1;
	    	String temp = new String();
	    	int j = 0;
	    	for (int i = 0; i < s.length()-1; i++) {
	    		answer = "";
				//answer = answer+s.charAt(i);
				for (; j < s.length(); j++) {
					int a=answer.indexOf(s.charAt(j));
					if (a == -1) {
						answer += s.charAt(j);
						lenOfAns = j-i+1;
						if (lenOfAns>lenBak) {
							mark[0]=i;
							mark[1]=j;
							lenBak=lenOfAns;
						}
						//System.out.println(answer);
						if(j == s.length()-1) {
							return lenBak;
						}
					}
					else {
						j = a + lenBak;
						//System.out.println(i);
						break;
					}
				}	
			}
    	}
    	//System.out.println(lenBak +' '+ lenOfAns);
		return lenBak;
    }
    
    public static int lengthOfLongestSubstring2(String s) {
        char[] chars = s.toCharArray();
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        int max = 0;
        for (int i = 0; i < chars.length; i++) {
            map.clear();
            for(int j = i;j < chars.length; j++) {
                if (map.containsKey(chars[j])) {
                    max = Math.max(map.size(),max);
                    break;
                }
                map.put(chars[j], j);
                if(j == chars.length-1)
                    max = Math.max(map.size(),max);
            }
        }
        return max;
    }

}
