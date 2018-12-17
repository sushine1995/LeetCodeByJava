/**
 * @author suzw
 * @version ����ʱ�䣺2018��9��12�� ����3:30:28 ��˵�� ���һ��
 * 
 * 
 *          ����һ��רҵ��С͵���ƻ�͵���ؽֵķ��ݣ�ÿ�䷿�ڶ�����һ�����ֽ�����ط����еķ��ݶ�Χ��һȦ��
 *          ����ζ�ŵ�һ�����ݺ����һ�������ǽ����ŵġ�ͬʱ�����ڵķ���װ���໥��ͨ�ķ���ϵͳ�������������
 *          �ķ�����ͬһ���ϱ�С͵���룬ϵͳ���Զ�������
 * ʾ�� 1:
����: [2,3,2]
���: 3
����: �㲻����͵�� 1 �ŷ��ݣ���� = 2����Ȼ��͵�� 3 �ŷ��ݣ���� = 2��, ��Ϊ���������ڵġ�         
ʾ�� 2:
����: [1,2,3,1]
���: 4
����: �������͵�� 1 �ŷ��ݣ���� = 1����Ȼ��͵�� 3 �ŷ��ݣ���� = 3����
     ͵�Ե�����߽�� = 1 + 3 = 4 ��
 */
public class _213_House_Robber_II_��ҽ���2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int rob(int[] num) {
		if (num.length == 1)
			return num[0];
		return Math.max(rob(num, 0, num.length - 2), rob(num, 1, num.length - 1));
	}

	public int rob(int[] num, int lo, int hi) {
		int preYes = 0;
		int preNo = 0;
		for (int i = lo; i <= hi; i++) {
			int temp = preNo;
			preNo = Math.max(preNo, preYes);
			preYes = num[i] + temp;
		}
		return Math.max(preNo, preYes);

	}
}
