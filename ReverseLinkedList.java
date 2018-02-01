package leetcode.linkedList01;

/**
 * @author:孙博腾
 * @E-mail:tengdowell@gmail.com
 * @version 创建时间：2018年1月29日 下午7:14:58
 * @类说明:
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
		// 思路：先定义逐层交换两个，三个指针 同时发起作用
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
