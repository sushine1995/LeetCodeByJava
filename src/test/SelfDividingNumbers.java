package test;

import java.util.ArrayList;
import java.util.List;
import org.junit.*;
/** 
* @author  suzw
* @version 创建时间：2018年4月19日 上午10:19:13 
* 类说明 
*/
public class SelfDividingNumbers {
	
	@Test
	public  void test01() {
		int left = 1;
		int right = 22;
		System.out.println(selfDividingNumbers(left,right));
		System.out.println(isSelfDividingNumbers(15));
	}
	
	
	public static List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> ans = new ArrayList<>();
		//int temp;
		for (int i = left; i <= right; i++) {
			if(isSelfDividingNumbers(i))
				ans.add(i);
		}
		return ans;
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
	
}
	
