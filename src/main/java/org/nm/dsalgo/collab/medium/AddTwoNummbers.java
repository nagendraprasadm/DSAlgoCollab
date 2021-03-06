/*
You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order and each of their nodes contain a single digit.
Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
 */
package org.nm.dsalgo.collab.medium;

public class AddTwoNummbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sumNode = null;
        ListNode sumNodeRet = null;
        int carry = 0;
        int sum = 0;
        while(l1 != null || l2 != null){
            sum = ((l1 != null) ? l1.val : 0) + ((l2 != null) ? l2.val : 0) + carry;
            carry = sum / 10;
            if(sumNode == null){
                sumNode = new ListNode(sum % 10);
                sumNodeRet = sumNode;
            }else{
                sumNode.next = new ListNode(sum % 10);
                sumNode = sumNode.next;
            }

            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }

        }
        if(carry != 0){
            sumNode.next = new ListNode(carry);
        }
        return sumNodeRet;
    }
}
