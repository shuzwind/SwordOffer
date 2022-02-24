/**
 * 链表的倒数第k个值
 * 
 * @author shuzhuo
 *
 */
public class SwordOffer22 {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode getKthFromEnd(ListNode head, int k) {
		int count = 0;
		ListNode first = head;
		ListNode second = head;
		while (count < k - 1 && first.next != null) {
			first = first.next;
			count++;
		}
		while (first.next != null) {
			first = first.next;
			second = second.next;
		}
		return second;
	}

}
