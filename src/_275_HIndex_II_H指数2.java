/**
 * @author suzw
 * @version ����ʱ�䣺2018��10��29�� ����9:08:04 ��˵��
 *          ����һλ�о������ı����ô��������飨�����ô����ǷǸ��������������Ѿ������������С���дһ��������������о��ߵ� h ָ����
 * 
 *          h ָ���Ķ���: ��һλ�� h ָ����ѧ�ߣ��������������� N ƪ������������ h ƪ���ģ��ֱ����������� h �Σ������ N - h
 *          ƪ����ÿƪ�����ô��������� h �Ρ�"
 * 
 *          ʾ��:
 * 
 *          ����: citations = [0,1,3,5,6] ���: 3 ����: ���������ʾ�о����ܹ��� 5 ƪ���ģ�ÿƪ������Ӧ�ı�������
 *          0, 1, 3, 5, 6 �Ρ� �����о����� 3 ƪ����ÿƪ���ٱ������� 3 �Σ�������ƪ����ÿƪ�����ò����� 3 �Σ��������� h
 *          ָ���� 3�� ���ף�
 * 
 *          ���� Hָ�� ��������Ŀ�������е� citations �����Ǳ�֤����ġ� ������Ż�����㷨������ʱ�临�Ӷ���
 *          ��𣺶��ֲ��ң��ҵ����м��"���㣺 Citations[index]>=citations.length - index
 */
public class _275_HIndex_II_Hָ��2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0};
		//int[] nums = {0,1,3,5,6};
		System.out.println(hIndex(nums));
	}

	/*
	 * case 1: citations[mid] == len-mid, then it means there are citations[mid]
	 * papers that have at least citations[mid] citations. 
	 * case 2: citations[mid] >len-mid, then it means there are citations[mid] papers that have more than
	 * citations[mid] citations, so we should continue searching in the left half
	 
	 * case 3: citations[mid] < len-mid, we should continue searching in the right
	 * side After iteration, it is guaranteed that right+1 is the one we need to 
	 * find (i.e. len-(right+1) papars have at least len-(righ+1) citations)
	 */
	public static int hIndex(int[] citations) {
        
		if(citations.length == 0) return 0;
        int n = citations.length;
        int lo = 0;
        int hi = citations.length-1;
        while(lo<=hi) {
        	int mid = (lo+hi)/2;
        	if(citations[mid]==n-mid)	
        		return n - mid;
        		//return citations[mid];
        	//���ֲ��ң�ÿ��lo��hi������һ����λ������������ѭ��
        	else if(citations[mid]<n-mid) lo = mid+1;
        	else if(citations[mid]>n-mid) hi = mid-1;
        }
        
        return n-lo;
	}
}
