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
    public int[] nextLargerNodes(ListNode head) {
       List<Integer> list=new ArrayList<>();
       for(ListNode curr=head;curr!=null;curr=curr.next)
       {
        list.add(curr.val);
       } 
       int  h=0;
       int a[]=new int[list.size()];
       for(int i:list)
       {
        a[h++]=i;
       }
       int arr[]=new int[list.size()];
       for(int i=0;i<a.length-1;i++)
       {
        arr[i]=0;
         for(int j=i+1;j<a.length;j++)
         {
            if(a[i]<a[j])
            {
                arr[i]=a[j];
                break;
            }
         }
       }
       arr[arr.length-1]=0;
       return arr;
    }
}