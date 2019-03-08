/** 
* @author  suzw
* @version 创建时间：2019年2月15日 下午9:55:13 
* 类说明 https://www.cnblogs.com/linghu-java/p/9001738.html
* 20190215:
* A linked list is given such that each node contains an additional random pointer 
* 	which could point to any node in the list or null.
Return a deep copy of the list.
*/
public class _002_Copy_List_With_Random_Pointer_深拷贝带有随机指针的链表 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public RandomListNode copyRandomList(RandomListNode head) {
		if (head == null) {
			return head;
		}
		RandomListNode p=head;
		//1. 将链表进行拷贝，每个节点后面插入自己的拷贝
		while(p!=null) {
			RandomListNode tmp = new RandomListNode(p.label);
			tmp.next = p.next;
			p.next = tmp;
			p=tmp.next;
		}
		//2.拷贝random指向
		p = head;
		while(p!=null) {
			if(p.random!=null) {
				//将p的拷贝.random指向p.random的拷贝，即拷贝指向拷贝
				p.next.random = p.random.next;
			}
			p=p.next.next;
		}
		//3.将链表分离
		RandomListNode head2 = head.next,q = head2;
		p = head;
		while(p!=null) {
			//3.1
			p.next = p.next.next;
			if (q.next==null) {
				break;
			}
			q.next = q.next.next;
			p =p.next;
			q = q.next;
		}
		return head2;
	}

}

class RandomListNode{
	int label;
	RandomListNode next,random;
	 RandomListNode(int val) {
		// TODO Auto-generated constructor stub
		 this.label = val;
	}
}
