import java.util.HashSet;

public class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums1) {
            set.add(num);
        }
        boolean varun=false;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums2) {
            if (set.contains(num)) {
                varun=true;
                smallest = Math.min(smallest, num);
            }
        }
        if(!varun) return -1;
        return smallest;
    }
}