/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] answer = {-1, -1};

        if (head == null || head.next == null || head.next.next == null) {
            return answer;
        }

        int first = -1, last = -1, min = Integer.MAX_VALUE, pos = 1;
        ListNode prev = head;
        ListNode curr = head.next;

        while (curr.next != null) {
            if ((curr.val > prev.val && curr.val > curr.next.val) ||
                (curr.val < prev.val && curr.val < curr.next.val)) {

                if (first == -1) {
                    first = pos;
                } else {
                    min = Math.min(min, pos - last);
                }
                last = pos;
            }
            prev = curr;
            curr = curr.next;
            pos++;
        }
        if (first == last) {
            return answer;
        }
        answer[0] = min;
        answer[1] = last - first;
        return answer;
    }
}
