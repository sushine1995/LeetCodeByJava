
/** 
* @author  suzw
* @version 
* 编写一个函数，其作用是将输入的字符串反转过来。
示例 1:
输入: "hello"
输出: "olleh"
示例 2:
输入: "A man, a plan, a canal: Panama"
输出: "amanaP :lanac a ,nalp a ,nam A"
*/

public  class _344_ReverseString_反转字符串 {
	public static void main(String[] args) {
		String string = "hello";
		System.out.println(reverseString(string));
	}
	
    public static String reverseString2(String s) {
        String rS = new String();
        StringBuffer buffer= new StringBuffer(s);
        buffer=buffer.reverse();
        rS = buffer.toString();
        return rS;
  
    }
  public static String reverseString(String s) {
        
        char[] chars= s.toCharArray();
        int length = s.length();

        int i = 0;
        for (char c : chars) {
        	chars[i] = chars[length - i-1];
        	chars[length - i-1] = c;
        	if (i >= length/2) {
        		break;
			}
        	i++;
        	
		}
        System.out.println(chars);
       
        return String.valueOf(chars);
    }
     
}
