
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 
 */
/** 
* @author  suzw
* @version 创建时间：2018年7月3日 下午2:35:55 
* 类说明 
*/
/*Given a string S, we can transform every letter individually to be lowercase or uppercase to create another string.  Return a list of all possible strings we could create.
Examples:
Input: S = "a1b2"
Output: ["a1b2", "a1B2", "A1b2", "A1B2"]

Input: S = "3z4"
Output: ["3z4", "3Z4"]

Input: S = "12345"
Output: ["12345"]
Note:
S will be a string with length at most 12.
S will consist only of letters or digits.
*/
/**
 * @author su823
 *
 */

/*递归算法
 * class Solution {
    public List<String> letterCasePermutation(String s) {
        char[] c = s.toCharArray();
        List<String> perms = new ArrayList();
        backtrack(c, perms, 0);
        return perms;
    }
    private void backtrack(char[] c, List<String> perms, int i) {
        if (i == c.length) {
            perms.add(new String(c));
            return;
        }
        if (Character.isDigit(c[i])) {
            backtrack(c, perms, i+1);
            return;
        }
        c[i] = Character.toLowerCase(c[i]);
        backtrack(c, perms, i+1);
        c[i] = Character.toUpperCase(c[i]);
        backtrack(c, perms, i+1);
    }
}
 * */
 
public class LetterCasePermutation784 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println();
		String string= "a1b2";

		List<String> ans = letterCasePermutation(string);
		for (int i = 0; i < ans.size(); i++) {
			System.out.println(String.valueOf(ans.get(i)));
			
		}

	}
    public static List<String> letterCasePermutation(String S) {
    	//System.out.println(S);
        char[] chars = S.toCharArray();
        int length = S.length();     
       Queue<String> queue = new LinkedList<>();
        queue.offer(S);
        for (int i = 0; i < length; i++) {
			if (Character.isDigit(chars[i])) {	continue;
			}
			int size = queue.size();
		
			//strings.add(chars);
			for (int j = 0; j < size; j++) {
				char[] temp = queue.poll().toCharArray();
				
				temp[i] = Character.toUpperCase(temp[i]);
				queue.offer(String.valueOf(temp));
				
				temp[i] = Character.toLowerCase(temp[i]);
				queue.offer(String.valueOf(temp));
			}
			
		}
    	return new LinkedList<>(queue);
    }
}
