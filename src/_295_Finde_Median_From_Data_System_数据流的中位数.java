import java.util.PriorityQueue;
import java.util.Queue;

/** 
* @author  suzw
* @version ����ʱ�䣺2018��11��7�� ����10:09:24 
* ��˵�� 
* 
��λ���������б��м����������б�����ż������λ�������м���������ƽ��ֵ��

���磬

[2,3,4] ����λ���� 3

[2,3] ����λ���� (2 + 3) / 2 = 2.5

���һ��֧���������ֲ��������ݽṹ��

void addNum(int num) - �������������һ�����������ݽṹ�С�
double findMedian() - ����Ŀǰ����Ԫ�ص���λ����
ʾ����

addNum(1)
addNum(2)
findMedian() -> 1.5
addNum(3) 
findMedian() -> 2
����:

����������������������� 0 �� 100 ��Χ�ڣ��㽫����Ż�����㷨��
����������� 99% ���������� 0 �� 100 ��Χ�ڣ��㽫����Ż�����㷨��
*/
/*
 * Median is the middle value in an ordered integer list. If the size of the list is even, 
 * there is no middle value. So the median is the mean of the two middle value.

For example,
[2,3,4], the median is 3

[2,3], the median is (2 + 3) / 2 = 2.5

Design a data structure that supports the following two operations:

void addNum(int num) - Add a integer number from the data stream to the data structure.
double findMedian() - Return the median of all elements so far.
 

Example:

addNum(1)
addNum(2)
findMedian() -> 1.5
addNum(3) 
findMedian() -> 2
 * ˼·һ��ʹ������/���еķ�ʽʵ�֣������������򣬵��ǲ����ڲ�����λ��
 * ˼·����https://leetcode.com/problems/find-median-from-data-stream/discuss/74062/Short-simple-JavaC%2B%2BPython-O(log-n)-%2B-O(1)
 * ����small��������Сһ�롣
��С��large��һ������֡�
��ʹ�ҿ���ֱ�ӷ���һ���������м�ֵ�������ǶѵĶ���������˻����λ����ҪO��1��ʱ�䡣���һ��������ҪO��log n��ʱ�䡣
 */
public class _295_Finde_Median_From_Data_System_����������λ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class MedianFinder {

    /** initialize your data structure here. */
	private Queue<Integer> large = new PriorityQueue<>();
	private Queue<Integer> small = new PriorityQueue<>();
	
    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        large.add(num);				//���Ǳ����� large.size >= small.size
        small.add(-large.poll());
        if (large.size() < small. size()) {
			large.add(-small.poll());
		}
    }
    
    public double findMedian() {
    	return large.size()>small.size()? large.peek():((double)(large.peek())/2.0+ (double)(-small.peek())/2.0); 
    }
}

