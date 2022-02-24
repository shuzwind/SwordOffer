/**
 * 反转链表
 * 
 * @author shuzhuo
 *
 */

public class SwordOffer24 {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode reverseList(ListNode head) {
		ListNode p0 = null;
		ListNode p1 = head;
		while (p1 != null) {
			ListNode p2 = p1.next;
			p1.next = p0;
			p0 = p1;
			p1 = p2;
		}
		return p0;

	}

}
