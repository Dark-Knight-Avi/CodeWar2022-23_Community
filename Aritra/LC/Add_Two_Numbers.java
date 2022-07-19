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
    public ListNode push(ListNode head, int data){
        ListNode new_node = new ListNode(data);
        if(head == null){
            new_node.next = null;
            return new_node;
        }
        ListNode cur = head;
        while(cur.next != null){
            cur = cur.next;
        }
        cur.next = new_node;
        new_node = null;
        return head;
    }
    public String toString(ListNode cur, String str){
        if(cur == null){
            return str;
        }
        return toString(cur.next, str + cur.val);
    }
    public ListNode addTwoNumbers(ListNode head1, ListNode head2) {
        ListNode head = null;
        ListNode temp1 = head1;
        ListNode temp2 = head2;
        int sum, carry = 0, data, last_carry;
        while (temp1 != null){
            if(temp2 == null && temp1 != null){
                while(temp1 != null){
                    head = push(head, (temp1.val + carry)%10);
                    carry = (temp1.val + carry) / 10;
                    temp1 = temp1.next;
                }
                break;
            }
            sum = temp1.val + temp2.val + carry;
            if(sum >= 10){
                carry = sum / 10;
                data = sum % 10;
            } else {
                carry = 0;
                data = sum;
            }
            head = push(head, data);
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        if(temp2 != null){
            while(temp2 != null){
                sum = (temp2.val + carry);
                carry = sum / 10;
                head = push(head, sum % 10);
                temp2 = temp2.next;
            }
        }
        if(carry > 0){
            head = push(head, carry);
        }
        return head;
    }
}
