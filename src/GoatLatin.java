
/** 
* @author  suzw
* @version 创建时间：2018年5月22日 上午9:39:53 
* 类说明 
* 824. Goat Latin
* A sentence S is given, composed of words separated by spaces. Each word consists of lowercase and uppercase letters only.
We would like to convert the sentence to "Goat Latin" (a made-up language similar to Pig Latin.)
The rules of Goat Latin are as follows:
If a word begins with a vowel (a, e, i, o, or u), append "ma" to the end of the word.
For example, the word 'apple' becomes 'applema'.
 
If a word begins with a consonant (i.e. not a vowel), remove the first letter and append it to the end, then add "ma".
For example, the word "goat" becomes "oatgma".
 
Add one letter 'a' to the end of each word per its word index in the sentence, starting with 1.
For example, the first word gets "a" added to the end, the second word gets "aa" added to the end and so on.
Return the final sentence representing the conversion from S to Goat Latin. 

Example:
Input: "I speak Goat Latin"
Output: "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"
Input: "The quick brown fox jumped over the lazy dog"
Output: "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"

*/
public class GoatLatin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S =  "I speak Goat Latin";

		System.out.println(toGoatLatin(S));

	}

    public static String toGoatLatin(String S) {
    	String[] strings = S.split(" ");
    	StringBuffer Buffer2 = new StringBuffer();
    	String vowel = "aeiouAEIOU";
    	int num = 1;
    	for (String string : strings) {
			StringBuffer buffer = new StringBuffer(string);
			//首字母是vowel时
			if (vowel.indexOf(buffer.charAt(0))!=-1) {
				//buffer.append("ma");
			}
			//非vowel时，首字母后移
			else {
				char first = buffer.charAt(0);
				buffer.deleteCharAt(0);
				buffer.append(first);
			}
			
			buffer.append("ma");
			for(int i=0 ;i<num;i++)
				buffer.append('a');
			buffer.append(' ');	
			Buffer2.append(buffer.toString());	
			num++;
		}
    	Buffer2.deleteCharAt(Buffer2.length()-1);
    	
    	return Buffer2.toString();
        
    }
}
