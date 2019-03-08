import javax.print.attribute.standard.RequestingUserName;

/**
 * @author suzw
 * @version 创建时间：2018年12月21日 下午2:07:47 类说明 Given a 32-bit signed integer,
 *          reverse digits of an integer.
 * 
 *          Example 1:
 * 
 *          Input: 123 Output: 321 Example 2:
 * 
 *          Input: -123 Output: -321 Example 3:
 * 
 *          Input: 120 Output: 21 Note: Assume we are dealing with an
 *          environment which could only store integers within the 32-bit signed
 *          integer range: [−231, 231 − 1]. For the purpose of this problem,
 *          assume that your function returns 0 when the reversed integer
 *          overflows.
 */
public class _007_Reverse_Integer_反转数字 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_007_Reverse_Integer_反转数字 t = new _007_Reverse_Integer_反转数字();
		System.out.println(t.reverse(1534236469));//使用方法2会出错，超出范围
		// System.out.println(t.reverse(2147483647));
	}
	public int reverse(int x) {
        long rev= 0;
        while( x != 0){
            rev= rev*10 + x % 10;
            x= x/10;
            if( rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
                return 0;
        }
        return (int) rev;
    }
	// 该方法没有考虑超出int范围的情况

	public int reverse_bak(int x) {
		int ans;
		int temp = x > 0 ? 0 : 1;
		char[] c = String.valueOf(x).toCharArray();
		System.out.println(String.valueOf(c));
		int length = x > 0 ? c.length : c.length + 1;
		for (; temp < length - temp - 1; temp++) {
			c[temp] ^= c[length - temp - 1];
			c[length - temp - 1] ^= c[temp];
			c[temp] ^= c[length - temp - 1];
		}
		System.out.println(String.valueOf(c));
		return Integer.valueOf(String.valueOf(c));
	}
}
