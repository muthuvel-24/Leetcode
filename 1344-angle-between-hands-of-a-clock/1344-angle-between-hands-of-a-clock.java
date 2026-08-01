class Solution {
    public double angleClock(int h, int m) {
        int min=m*6;
        double hr=(h*30)+(m*0.5);
        double ans=Math.abs(min-hr);
        return Math.min(ans,360-ans);
    }
}