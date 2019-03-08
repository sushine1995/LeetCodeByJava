/**
 * @author suzw
 * @version 创建时间：2018年12月20日 下午3:15:42 类说明 将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。
 * 
 *          比如输入字符串为 "LEETCODEISHIRING" 行数为 3 时，排列如下：
 * 
 *          L C I R E T O E S I I G E D H N
 *          之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："LCIRETOESIIGEDHN"。
 * 
 *          请你实现这个将字符串进行指定行数变换的函数：
 * 
 *          string convert(string s, int numRows); 示例 1:
 * 
 *          输入: s = "LEETCODEISHIRING", numRows = 3 输出: "LCIRETOESIIGEDHN" 示例 2:
 * 
 *          输入: s = "LEETCODEISHIRING", numRows = 4 输出: "LDREOEIIECIHNTSG" 解释:
 * 
 *          L D R E O E I I E C I H N T S G
 */
public class _006_ZigZag_Conversion_Z字变换 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_006_ZigZag_Conversion_Z字变换 t = new _006_ZigZag_Conversion_Z字变换();
		System.out.println(t.convert("PAYPALISHIRING", 3));
	}
	/*
	 * 1.先计算存储的矩阵大小 PAYPALISHIRING，14个字符，三行排列： P A H N A P L S I I G Y I R
	 * 三行排列：每两列4个字符，3+1： n*2-2,需要7列： 14/4 = 3```2<n=3,3*2+1
	 * 四行排列：每三列4+2=6个字符,需要7列，14/6=2```2<4，2*3+1 n行排列，每n-1列有2n-2个字符，需要的列数根据情况：
	 * l/n=a·····b,当0<b<=n时，需要a*(n-1)+1列； 当b>=n时，需要a*(n-1)+1+(b-n)列
	 * 
	 */

	public String convert(String s, int numRows) {
		if (s == null || numRows == 1)
			return s;

		int col = getCol(numRows, s.length());
		// System.out.println(col);
		char[][] ans = new char[numRows][col];
		int k = 0;
		char[] c = s.toCharArray();
		for (int i = 0; i < col; i++) {
			// 该列完整填充
			if (k < s.length()) {
				if (i % (numRows - 1) == 0 || i == 0)
					for (int j = 0; j < numRows && k < s.length(); j++) {
						ans[j][i] = c[k++];
					}
				else
					ans[numRows - i % (numRows - 1) - 1][i] = c[k++];
			} else
				break;
		}
		StringBuffer sz = new StringBuffer();
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {
				if (ans[i][j] != 0) {
					sz.append(ans[i][j]);
				}
			}
		}
		return sz.toString();
	}

	public int getCol(int numRows, int length) {
		int quotient = length / (2 * numRows - 2); // 商，
		int remainder = length % (2 * numRows - 2); // 余数
		if (remainder == 0)
			return (numRows - 1) * quotient;
		else if (remainder <= numRows)
			return (numRows - 1) * quotient + 1;
		else if (remainder > numRows)
			return (numRows - 1) * quotient + 1 + remainder - numRows;

		return 0;
	}
	
}
//17ms
class Solution2 {
    public String convert(String s, int numRows) {
        int length = s.length();
        if (numRows < 2 || length <= numRows) {
            return s;
        }
        final char[] res = new char[length];
        final int fullStep = 2 * numRows - 2;
        int z = fill(s, fullStep, res, 0, 0);
        for (int r = 1; r < numRows - 1; r++) {
            int shortStep = fullStep - (2 * r);
            for (int j = r; j < length; j += fullStep){
    		   	res[z] = s.charAt(j);
    			z++;
    			if (shortStep < fullStep 
                        //&& z < length
                        && shortStep > 0 
                        && j + shortStep < length){
    				res[z] = s.charAt(j + shortStep);
    				z++;
    			}
    		}
        }
        fill(s, fullStep, res, numRows - 1, z);
        return new String(res);
    }
    private static int fill(String s, int fullStep, char[] res, int r, int  z) {
        for (int j = r; j < s.length(); j += fullStep){
    		   	res[z] = s.charAt(j);
    			z++;
        }
        return z;
    }
}