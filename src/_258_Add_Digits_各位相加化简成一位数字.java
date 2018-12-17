/** 
* @author  suzw
* @version ����ʱ�䣺2018��10��22�� ����4:10:34 
* ��˵�� 
* ����˼·�������ַ���������Ч�ʵ�
* 
* Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

Example:

Input: 38
Output: 2 
Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2. 
             Since 2 has only one digit, return it.
Follow up:
Could you do it without any loop/recursion in O(1) runtime?
*/
public class _258_Add_Digits_��λ��ӻ����һλ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addDigits(38));
	}
	
    public static int addDigits(int num) {
    	 return (num - 1) % 9 + 1;
    	/*
        if(num==0)
            return 0;
        else if(num%9==0)
            return 9;
        else
            return num%9;
            */
    }
    /*
     * ��20�����е�������
1    1
2    2
3    3
4    4
5    5
6    6
7    7
8    8    
9    9    
10    1
11    2
12    3    
13    4
14    5
15    6
16    7
17    8
18    9
19    1
20    2
����������о٣����ǿ��Եó����ɣ�ÿ9��һѭ�������д���9�������������Ƕ�9ȡ�࣬��ô���ڵ���9������9ȡ�����0�ˣ�
Ϊ�˵õ��䱾������ͬ��ҲҪ�Դ���9�������ã����Ǿ���(n-1)%9+1������ʽ���������е����[n-1Ϊ�˻رܶ��Ƿ���9�ı������ж�]
     */
    public int addDigits2(int num) {
        	 // return (num - 1) % 9 + 1;
             // until we get num to one digit
         while (num / 10 > 0) {
            // reintitialise sum on each loop
            int sum = 0;
            // increment sum by whatever is left over when you divide by 10 (last digit in num)
            // then divide number by 10 (because it an int we will discard the last number)
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
	   public static int addDigitsBak(int num) {
	       //int ans = 0;
	       
	       while(num>9) {
	    	   int[] numTo = intToSingleNum(num);
	    	   num = 0;
	    	   for (int i : numTo) {
				num +=i;
	    	   }
	       }
	       return num;
		   
	    }
	   public static int[] intToSingleNum(int num) {
		String numS = Integer.toString(num);
		int len = numS.length();
		int[] ans = new int[len];
		for (int i = 0; i < len; i++) {
			ans[i] = Integer.parseInt(String.valueOf(numS.charAt(i)));
		}
		return ans;
	}
}
