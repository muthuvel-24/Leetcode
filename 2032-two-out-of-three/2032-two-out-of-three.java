class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> s1=new HashSet<>();
        Set<Integer> s2=new HashSet<>();
        Set<Integer> s3=new HashSet<>();
        for (int i:nums1) s1.add(i);
        for (int i:nums2) s2.add(i);
        for (int i:nums3) s3.add(i);
        List<Integer> ans = new ArrayList<>();
        for (int i=1;i<=100;i++) {
            int count=0;
            if(s1.contains(i)) count++;
            if(s2.contains(i)) count++;
            if(s3.contains(i)) count++;
            if(count>=2) ans.add(i);
        }
        return ans;
    }
}