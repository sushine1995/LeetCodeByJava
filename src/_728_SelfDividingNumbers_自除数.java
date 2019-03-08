

import java.util.ArrayList;
import java.util.List;

/** 
* @author  suzw
* @version 创建时间：2018年4月19日 下午4:44:51 
* 类说明 
* 自除数 是指可以被它包含的每一位数除尽的数。
例如，128 是一个自除数，因为 128 % 1 == 0，128 % 2 == 0，128 % 8 == 0。
还有，自除数不允许包含 0 。
给定上边界和下边界数字，输出一个列表，列表的元素是边界（含边界）内所有的自除数。
示例 1：
输入： 
上边界left = 1, 下边界right = 22
输出： [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
注意：
每个输入参数的边界满足 1 <= left <= right <= 10000。
*/
public class _728_SelfDividingNumbers_自除数 {
	public static void main(String[] args) {
		int left = 1;
		int right = 22;
		System.out.println(selfDividingNumbers(left,right));
	}
	
	
	public  static List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> ans = new ArrayList<>();
		//int temp;
		for (int i = left; i <= right; i++) {
			if(isSelfDividingNumbers(i))
				ans.add(i);
		}
		return ans;
	}
	
	public static boolean isSelfDividingNumbers(int num) {

		int mod = num%10;
		int temp = num;
		
		while(temp!=0) {
			if (mod==0 ||num%mod != 0) {
				return false;
			}else {
				temp=temp/10;
				mod = temp%10;
			}			
		}
		return true;	
	}
	

	public static boolean isSelfDividingNumbersbak(int num) {
		boolean ans = true;
		String snum = Integer.toString(num);
		
		char[] cnum = snum.toCharArray();
		System.out.println(cnum);
		for (char c : cnum) {
			if(c == '0') {
				ans = false;
				break;
			}
			else if ( num%(c - '0')!=0) {
				ans = false;
				break;
			}
		}
		return ans;	
	}
}
