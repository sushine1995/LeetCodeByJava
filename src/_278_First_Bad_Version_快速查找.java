/**
 * @author suzw
 * @version ����ʱ�䣺2018��10��29�� ����8:02:56 ��˵��
 * 
 *          ���ǲ�Ʒ����Ŀǰ���ڴ���һ���Ŷӿ����µĲ�Ʒ�����ҵ��ǣ���Ĳ�Ʒ�����°汾û��ͨ��������⡣
 *          ����ÿ���汾���ǻ���֮ǰ�İ汾�����ģ����Դ���İ汾֮������а汾���Ǵ�ġ�
 * 
 *          �������� n ���汾 [1, 2, ..., n]�������ҳ�����֮�����а汾����ĵ�һ������İ汾��
 * 
 *          �����ͨ������ bool isBadVersion(version) �ӿ����жϰ汾�� version
 *          �Ƿ��ڵ�Ԫ�����г���ʵ��һ�����������ҵ�һ������İ汾����Ӧ�þ������ٶԵ��� API �Ĵ�����
 * 
 *          ʾ��:
 * 
 *          ���� n = 5������ version = 4 �ǵ�һ������İ汾��
 * 
 *          ���� isBadVersion(3) -> false ���� isBadVersion(5) -> true ����
 *          isBadVersion(4) -> true
 * 
 *          ���ԣ�4 �ǵ�һ������İ汾��
 */
public class _278_First_Bad_Version_���ٲ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(9 / 2);
	}

	public static int firstBadVersion(int n) {
		int lo = 1;
		int hi = n;
		//���ӵȺŵĻ���hi = mid�� ������޷�����ѭ��
		while (lo <=hi) {
			// int mid = (lo + hi)/2;��ʽ�ɱ���IntԽ��
			int mid = lo + (hi - lo) / 2;
			// ��mid����badBersionʱ��
			if (!isBadVersion(mid)) {
				lo = mid + 1;

			} else
				hi = mid-1 ;

		}
		return lo;
	}

	public static boolean isBadVersion(int n) {
		return false;

	}
}
