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
    public ListNode mergeNodes(ListNode head) {
       List<Integer> list=new ArrayList<>();
       for(ListNode curr=head;curr!=null;curr=curr.next)
       {
         list.add(curr.val);
       } 
       List<Integer> temp=new ArrayList<>();
       int r=0;
       int sum=0;
       while(r<list.size())
       {
         if(list.get(r)!=0)
         {
            sum+=list.get(r);
            r++;
         }
         else{
            if(sum!=0){
            temp.add(sum);
            sum=0;
            }
            r++;
         }
       }
       //System.out.print(temp);
       if(temp.size()<1) return null;
       ListNode res=new ListNode(temp.get(0));
       ListNode t=res;
       for(int i=1;i<temp.size();i++)
       {
          t.next=new ListNode(temp.get(i));
          t=t.next;
       }
       return res;
    }
}