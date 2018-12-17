/**
 * @author suzw
 * @version ����ʱ�䣺2018��10��26�� ����2:56:25 ��˵��
 *          ����һλ�о������ı����ô��������飨�����ô����ǷǸ�����������дһ��������������о��ߵ� h ָ����
 * 
 *          h ָ���Ķ���: ��һλ�� h ָ����ѧ�ߣ��������������� N ƪ������������ h ƪ���ģ��ֱ����������� h �Σ������ N - h
 *          ƪ����ÿƪ�����ô��������� h �Ρ���
 * 
 *          ʾ��:
 * 
 *          ����: citations = [3,0,6,1,5] ���: 3 ����: ���������ʾ�о����ܹ��� 5 ƪ���ģ�ÿƪ������Ӧ�ı�������
 *          3, 0, 6, 1, 5 �Ρ� �����о����� 3 ƪ����ÿƪ���ٱ������� 3 �Σ�������ƪ����ÿƪ�����ò����� 3 �Σ��������� h
 *          ָ���� 3�� ˵��: ��� h �ж��ֿ��ܵ�ֵ��h ָ�������������Ǹ��� 
 *          https://leetcode.com/problems/h-index/discuss/70768/Java-bucket-sort-O(n)-solution-with-detail-explanation
 *          This type of problems always
 *          throw me off, but it just takes some getting used to. The idea
 *          behind it is some bucket sort mechanisms. First, you may ask why
 *          bucket sort. Well, the h-index is defined as the number of papers
 *          with reference greater than the number. So assume n is the total
 *          number of papers, if we have n+1 buckets, number from 0 to n, then
 *          for any paper with reference corresponding to the index of the
 *          bucket, we increment the count for that bucket. The only exception
 *          is that for any paper with larger number of reference than n, we put
 *          in the n-th bucket.
 * 
 *          Then we iterate from the back to the front of the buckets, whenever
 *          the total count exceeds the index of the bucket, meaning that we
 *          have the index number of papers that have reference greater than or
 *          equal to the index. Which will be our h-index result. The reason to
 *          scan from the end of the array is that we are looking for the
 *          greatest h-index. For example, given array [3,0,6,5,1], we have 6
 *          buckets to contain how many papers have the corresponding index.
 *          Hope to image and explanation help.
 */
public class _274_H_Index_H����ָ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int hIndex(int[] citations) {
		int sum = 0;
		int n = citations.length;
		int[] counts = new int[n + 1];
		/*
		 * for (int i = 0; i < counts.length; i++) { if (citations[i]>=i) { counts[i]++;
		 * } }
		 */
		for (int i : citations) {
			if (i >= n) {
				counts[n]++;
			} else
				counts[i]++;
		}

		for (int i = n; i >= 0; i--) {
			sum += counts[i];
			if (sum >= i) {
				return i;
			}
		}

		return 0;
	}

}
