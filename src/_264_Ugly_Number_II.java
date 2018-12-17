/** 
* @author  suzw
* @version ����ʱ�䣺2018��10��24�� ����2:24:55 
* ��˵�� 
* Write a program to find the n-th ugly number.
Ugly numbers are positive numbers whose prime factors only include 2, 3, 5. 
Example:
Input: n = 10
Output: 12

  �ؼ���Ҫʵ��ÿ�����ֿ��Բ��ұ�����ǰһ�����ֳ���2,3��5���ɣ�
����
1 2 3 4 5 6 8 9 10 12 15 .. 
��������ʲô��
��������x * 2��y * 3��z * 5������x��y��z���������֡�

�������ȷ��x��y��z�أ�
��Ȼ������ֻ��������Ϊֹ���������д�1 ... 15��ֱ���ҵ�������x��y��z��x * 2��Y * 3��Z * 5ֻ��15���������������£�x = 8��y = 6��z = 4��Ȼ����Ƚ�x * 2��y * 3��z * 5������֪����һ�����ֽ���x * 2 = 8 * 2 = 16. 
k����������1,2,3,4��....��15 ��16��

Ȼ����һ����ʲô��
�����ٴ���ͬ���Ĺ������ҵ��µ�x��y��z��������ʶ�����ȵȣ����Ƿ�����ٴ�
�������ɵ����У�

û�У���Ϊ��֪���ϴΣ�x = 8��y = 6��z = 4��x = 8��������16��������һ�Σ����������֪��new_x = 9������8��8����һ��������9�����У���y = 6��z = 4��
Ȼ������Ҫ�Ƚ�new_x * 2��y * 3��z * 5.��֪����һ��������9 * 2 = 18;

����Ҳ֪��������new_x = 9���ʹ������һ��x����10��
������������ʲô����Ȼ�����y = 6,6 * 3 = 18�����Ѿ��ڱ����в����������㻹��Ҫ����һ��y��6���µ�8��

����������뷨����ʵ���Ͽ��Դ�һ��ʼ������x��y��z������Ӧ�ظ���x��y��z�������յõ�O��n�����������

Explanation: 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 is the sequence of the first 10 ugly numbers.
15 16 18 20 

1 1
2 2
3 3
4 4 
5 5
6 6
7 8
8 9
9 10
10 12
11 15 
12 16
13 18
14 20
15 24
16 25
17 27
18 30

*/
public class _264_Ugly_Number_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public  static int nthUglyNumber(int n) {
	        int[] nums = new int[n];
	        int index2= 0,index3 = 0, index5 = 0;
	        int num2 = 2, num3 = 3, num5 = 5;
	        nums[0] = 1;
	        
	        for(int i =1;i<n;i++) {
	        	
	        	int min = Math.min(Math.min(num2, num3), num5);
	        	nums[i] = min;
	        	if(min == num2)	num2 = 2*nums[++index2];
	        	if(min == num3)	num3 = 3*nums[++index3];
	        	if(min == num5)	num5 = 5*nums[++index5];
                /*
	        	//���ߣ�
	        	int min = Math.min(Math.min(nums[index2]*2, nums[index3]*3), nums[index5]*5);
	        	nums[i] = min;
	        	if(min == nums[index2]*2)	index2++;
	        	if(min == nums[index3]*3)	index3++;
	        	if(min == nums[index5]*5)	index5++;
	        	*/
	        }
	        
	        return nums[n-1];
	    
	 }
}
