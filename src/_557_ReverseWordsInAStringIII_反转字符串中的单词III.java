
/** 
* @author  suzw
* @version 创建时间：2018年5月5日 上午10:13:43 
* 类说明 
* 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
示例 1:
输入: "Let's take LeetCode contest"
输出: "s'teL ekat edoCteeL tsetnoc" 
注意：在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。
*/
public class _557_ReverseWordsInAStringIII_反转字符串中的单词III {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "abc def";
		System.out.println(reverseWords(string));
		

	}
    public static String reverseWords(String s) {
        String[] strings = s.split(" ");
        StringBuffer  buffer2=new StringBuffer();
        for (String string : strings) {
        	StringBuffer  buffer=new StringBuffer(string);
			buffer2.append(buffer.reverse().toString());
			buffer2.append(" ");
		}
        buffer2.deleteCharAt(buffer2.length()-1);
        return buffer2.toString();
    }
}
