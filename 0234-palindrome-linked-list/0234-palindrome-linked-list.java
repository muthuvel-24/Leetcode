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
    public boolean isPalindrome(ListNode head) {
        List<Integer> list=new ArrayList<>();
        for(ListNode curr=head;curr!=null;curr=curr.next)
        {
            list.add(curr.val);
        }
        List<Integer> res=new ArrayList<>();
        for(int i=list.size()-1;i>=0;i--)
        {
            res.add(list.get(i));
        }
        return list.equals(res);
    }
}