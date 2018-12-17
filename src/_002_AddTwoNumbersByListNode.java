
/** 
* @author  suzw
* @version 创建时间：2018年4月11日 上午11:33:38 
* 类说明 
*/

public class _002_AddTwoNumbersByListNode {

	public static void main(String[] args) {
		ListNode[] l1 = new ListNode[3];
		ListNode[] l2 = new ListNode[1];
		//ListNode l2 = new ListNode(1);
		for (int i = 0; i < l1.length; i++) {
			l1[i]=new ListNode(i*4+1);
		}
		for (int i = 0; i < l2.length; i++) {
			l2[i]=new ListNode(i+2);
		}
		l1[0].val=8;
		l1[1].val=9;
		l1[2].val=9;
		
		for (int i = 0; i < l1.length; i++) {
			if(i < l1.length-1)
				l1[i].next = l1[i+1];
		}
		System.out.print("list1:");
		ListNode temp = l1[0];
		while (temp!=null) {
			System.out.print(temp.val+",");
			temp=temp.next;
		}
		System.out.println();
		System.out.print("list2:");
		for (int i = 0; i < l2.length; i++) {
			if(i < l2.length-1)
				l2[i].next = l2[i+1];
		}
		for (int i = 0; i < l2.length; i++) {
			System.out.print(l2[i].val+",");
		}
		System.out.println();
		addTwoNumbers(l1[0], l2[0]);
	}
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode temp = null;
		ListNode longList = null;
		ListNode longListBak = null;
		ListNode shortlist = null;
		int lenOfl1 = 0;
		int lenOfl2 = 0;
		temp = l1;
		
		while(temp!=null) {
			lenOfl1++;
			temp=temp.next;
		}
		
		temp = l2;
		while(temp!=null) {
			lenOfl2++;
			temp=temp.next;
		}
		if (lenOfl1>=lenOfl2) { 
			longListBak=longList = l1;
			shortlist =l2;}
		else {
			longListBak=longList = l2;
			shortlist =l1;
		}
		
		temp = longList;
		while(shortlist!=null) {
			longList.val = shortlist.val+longList.val;
			//进位部分注释后，运行时间变长
			//第一次进位
			/*
			if (longList.val>=10) {
				if (longList.next==null) {
					longList.next = new ListNode(1);
				}
				else {
					longList.next.val+=1;
					//连续两次进位
					if(longList.next.val>=10) {
						if (longList.next.next==null) {
							longList.next.next = new ListNode(1);
						}else longList.next.next.val +=1;
						longList.next.val-=10;
					}	
				}
				longList.val-=10;
				
			}*/
			//System.out.println(shortlist.val + "+" + longList.val + "=" +longList.next.val);
			//temp = temp.next;
			shortlist = shortlist.next;
			longList = longList.next;
			
		}
		temp = longListBak;
		System.out.println();
		System.out.print("answer:");
		while(temp!=null) {
			
			if (temp.val>=10) {
				if (temp.next==null) {
					temp.next = new ListNode(1);
				}
				else temp.next.val+=1;
				temp.val-=10;
			}
			System.out.print(temp.val);
			//System.in.read(b, off, len)
			temp=temp.next;
			
		}
					
		return longListBak;
	}
}
/*
 * while(l1!=null || l2!=null) {
			if (time == 0) {			
				time+=1;
				temp = l3;
			}
			//if(l1!=null&&l2!=null) {
			temp.val = (l1.val+l2.val);
			System.out.println(l1.val+"+" + l2.val +"="+temp.val );
			if(temp.val>=10) {
				//ListNode temp = new ListNode(1);
				temp.val -=10;
				temp.next = new ListNode(1);	
			}
			else temp.next = new ListNode(0);
			temp = temp.next;
			l1 = l1.next;
			l2 = l2.next;
			//System.out.println(temp.val);
		}
		temp = l3;
		while(temp!=null) {
			System.out.println(temp.val);
			temp=temp.next;
		}
 * 
 */

