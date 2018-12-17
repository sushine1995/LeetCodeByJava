

/** 
* @author  suzw
* @version ����ʱ�䣺2018��9��29�� ����2:49:00 
* ��˵�� 
* Given a singly linked list, determine if it is a palindrome.
Example 1:
Input: 1->2
Output: false
Example 2:
Input: 1->2->2->1
Output: true
Follow up:
Could you do it in O(n) time and O(1) space?
1��������������������ÿ���ڵ��ֵ��¼�������У����ж������ǲ���һ���������飬ʱ�临�Ӷ�ΪO��n����
      ���ռ临�Ӷ�ҲΪO��n����������ռ临�Ӷ�Ҫ��
2������ջ�Ƚ���������ʣ�������ǰ���ѹ��ջ�У������������������αȽϡ�ʱ�临�Ӷ�O��n����
      ����Ȼ��Ҫn/2��ջ�ռ䣬�ռ临�Ӷ�ΪO��n����
3����ת���������������ԭ�ط�ת���ٽ�ǰ��Ρ��������αȽϣ��ж��Ƿ���ȣ�ʱ�临�Ӷ�O��n����
      �ռ临�Ӷ�ΪO��1��������ĿҪ��

---------------------

�������� ��θ�� ��CSDN ���� ��ȫ�ĵ�ַ������https://blog.csdn.net/sunao2002002/article/details/46918645?utm_source=copy 
*/
public class _234_Palindrome_Linked_List_�������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
    public static boolean isPalindrome(ListNode head) {
    	//0��1���ڵ�
        if (head==null || head.next==null) 		return true;
        ListNode slow = head;
        ListNode fast = head;
    	//��slowָ��������м�ڵ�
        while(fast.next!=null && fast.next.next !=null) {
        	fast= fast.next.next;
        	slow = slow.next;
        }
        //��������з�ת
        //ListNode 
        //ListNode reverseHead = slow.next;	//���εĵ�һ���ڵ�
        ListNode cur = slow.next;			//����Ľڵ�Ӻ��ε�һ���ڵ�ĺ�һ����ʼ
        //reverseHead.next = null;			//���εĵ�һ���ڵ㽫������һ���ڵ�
        ListNode prev = null;
        //����reverseHead��cur��ָ���˺��ε�ͷ�ڵ㣬����ڵ㽫������һ���ڵ�
        //�����ε�next������ָ�������˷�ת
        //cur��Ϊ�м����
        while(cur!=null) {
        	ListNode next = cur.next;
        	cur.next = prev;
        	prev = cur;
        	cur = next;
        }
        //��ʱ��preָ�������һ���ڵ㣬�ٽ�pre��head���бȽ�
        while(prev!=null) {
        	if (prev.val != head.val) {
				return false;
			}
        	prev = prev.next;
        	head = head.next;
        }
        
    	return true;
    }
}
