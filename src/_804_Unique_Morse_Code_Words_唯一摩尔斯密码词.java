

import java.util.HashSet;
import java.util.Set;

/** 
* @author  suzw
* @version 创建时间：2018年4月14日 上午11:05:48 
* 类说明 
*/
/*International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows: "a" maps to ".-", "b" maps to "-...", "c" maps to "-.-.", and so on. */
/*For convenience, the full table for the 26 letters of the English alphabet is given below:
[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
Now, given a list of words, each word can be written as a concatenation of the Morse code of each letter. For example, "cab" can be written as "-.-.-....-", (which is the concatenation "-.-." + "-..." + ".-"). We'll call such a concatenation, the transformation of a word.
Return the number of different transformations among all words we have.
Example:
Input: words = ["gin", "zen", "gig", "msg"]
Output: 2
Explanation: 
The transformation of each word is:
"gin" -> "--...-."
"zen" -> "--...-."
"gig" -> "--...--."
"msg" -> "--...--."

There are 2 different transformations, "--...-." and "--...--.".
*/
/**
 * @author su823
 *
 */
public class _804_Unique_Morse_Code_Words_唯一摩尔斯密码词 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	   public static int uniqueMorseRepresentations(String[] words) {
	     //int ans = 0;
	     String[] code = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
	     Set<String> trans = new HashSet<>();
	     String temp = null;
	     for (String word : words) {
	    	 temp = "";
			for (char c : word.toCharArray()) {
				temp =temp +code[c - 'a' ];
			}
			trans.add(temp);
		}
	     //ans = ;
		   return trans.size();
	    }
	
}
