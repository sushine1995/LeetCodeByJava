/** 
* @author  suzw
* @version ����ʱ�䣺2018��9��1�� ����11:33:36 
* ��˵�� 
* 
*/
public class _202_Happy_Number_�ݹ��ж��Ƿ���happyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isHappy(16));

	}
	
	public static boolean isHappy(int m) {
		int sum = 0;
		int quyu = 0;
		int times= 0;
		while(true) {
			sum=0;
			while(m!=0) {
				quyu=m%10;
				m/=10;
				System.out.println("yushu:"+quyu);
				sum +=quyu*quyu;
		}
			System.out.println("sum:"+sum);
		if (sum==1) 	return true;
		else m = sum;
		times++;
		if (times>10000) {
			return false;
			
		}
		}
		
	}
}
