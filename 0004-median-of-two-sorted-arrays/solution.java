class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length+nums2.length;
        int merge[] = new int[n]; 
        int i=0;
        for(int num:nums1)merge[i++]=num;
        for(int num:nums2)merge[i++]=num;
        Arrays.sort(merge);
        if(n%2!=0)return merge[n/2];
        else return(double)(merge[n/2]+merge[n/2-1])/2;
    }
}
