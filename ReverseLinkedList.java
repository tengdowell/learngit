package leetcode.linkedList01;

/**
 * @author:�ﲩ��
 * @E-mail:tengdowell@gmail.com
 * @version ����ʱ�䣺2018��1��29�� ����7:14:58
 * @��˵��:
 */
public class ReverseLinkedList {

	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode reverseList(ListNode head) {
		// ˼·���ȶ�����㽻������������ָ�� ͬʱ��������
		if (head == null) {
			return null;
		}
		ListNode newHead = null;
		ListNode pre = null;
		ListNode current = head;

		while (current != null) {
			ListNode next = current.next;

			if (next == null) {
				newHead = current;
			}
			current.next = pre;

			pre = current;
			current = next;

		}
		return newHead;
	}
}
