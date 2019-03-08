/** 
* @author  suzw
* @version 创建时间：2018年9月6日 下午1:37:49 
* 类说明 
*/

public class LinkedList {

	public static void printLinkedList(ListNode last) {
		
		while(last!=null) {
			System.out.println(last.val);
			last = last.next;
		}
	}
	public static int getLinkedListLength(ListNode head) {
		int length = 0;
		while(head!=null)
		{
			length++;
			head=head.next;
		}
		return length;
	}
}
