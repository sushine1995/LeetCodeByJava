/** 
* @author  suzw
* @version ����ʱ�䣺2018��9��1�� ����10:46:15 
* ��˵�� 
* 
* Input: [5,7]
	Output: 4
*/
public class _201_Bitwise_AND_of_Numbers_Range_�������䰴λ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 5;
		int n =7;
		System.out.println(rangeBitwiseAnd(m, n));
		_202_Happy_Number_�ݹ��ж��Ƿ���happyNumber.isHappy(m);
	}
	
	public static int rangeBitwiseAnd(int m,int n) {
		if (m ==0) {
			return 0;
		}
		int moveStep = 1;
		while(m!=n) {
			m >>=1;
			n>>=1;
			moveStep <<=1;
		}
		return m*moveStep;
		
	}

}
