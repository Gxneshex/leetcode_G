class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int pref[]=new int[n];
        int sufx[]=new int[n];
        pref[0]=height[0];
        for(int i=1;i<n;i++){
            pref[i]=Math.max(pref[i-1],height[i]);
        }
        sufx[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            sufx[i]=Math.max(sufx[i+1],height[i]);
        }
        int total=0;
        for(int i=0;i<n;i++){
            total+=Math.min(pref[i],sufx[i])-height[i];
        }
        return total;
    }
}
