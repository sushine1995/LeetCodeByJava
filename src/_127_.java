/** 
* @author  suzw
* @version 创建时间：2019年3月1日 下午8:52:34 
* 类说明 
*/
public class _127_ {


	//给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
	/*
	给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
	说明：本题中，我们将空字符串定义为有效的回文串。
	示例 1:
	输入: "A man, a plan, a canal: Panama"
	输出: true
	示例 2:
	输入: "race a car"
	输出: false
	 */

		public static void main(String[] args) {
			Solution solution = new Solution();
			//String string = 
			System.out.println(isPalindom("A man,a plan"));
		}
	    


	
			   public static  boolean isPalindrome(String str) {
		            String s = str.toLowerCase();
		            int i = 0, j = str.length() - 1, len = j;
		            while (i < j) {
		                while (i <= len&& (!(s.charAt(i) >= '0' && s.charAt(i) <= '9') && !(s.charAt(i) >= 'a' && s.charAt(i) <= 'z')))
		                    i++;
		                while (j >= 0&& (!(s.charAt(j) >= '0' && s.charAt(j) <= '9') && !(s.charAt(j) >= 'a' && s.charAt(j) <= 'z')))
		                    j--;
		                if (i > len || j < 0)
		                    break;
		                if (s.charAt(i) != s.charAt(j))
		                    return false;
		                i++;
		                j--;
		            }
		            return true;
		        }
			   public static boolean isPalindom(String s) {
				   s=s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
				   System.out.println(s);
				   int i = 0;
				   int j = s.length()-1;
				   while(i<j) {
					   if (s.charAt(i)== s.charAt(j)) {
						   i++;
						   j--;
					   }else return false;
					   if(i == j || i-j==1) return true;
					 
				   }
				   return false;
			   }

		    
	
}
