package org.jasonxiao.lintcode;

/**
 * 链表求和
 * http://www.lintcode.com/zh-cn/problem/add-two-numbers/
 *
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class AddTwoNumbers {
    /**
     * @param l1: the first list
     * @param l2: the second list
     * @return: the sum list of l1 and l2
     */
    public ListNode addLists(ListNode l1, ListNode l2) {
        // write your code here
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }

        int val = 0;
        int up = 0;
        ListNode head = new ListNode(-1);
        ListNode result = head;

        while (l1 != null && l2 != null) {
            val = l1.val + l2.val + up;
            up = val / 10;
            val = val % 10;
            result.next = new ListNode(val);

            result = result.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            val = l1.val + up;
            up = val / 10;
            val = val % 10;
            result.next = new ListNode(val);

            result = result.next;
            l1 = l1.next;
        }

        while (l2 != null) {
            val = l2.val + up;
            up = val / 10;
            val = val % 10;
            result.next = new ListNode(val);

            result = result.next;
            l2 = l2.next;
        }

        if (up != 0) {
            result.next = new ListNode(up);
        }

        return head.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}