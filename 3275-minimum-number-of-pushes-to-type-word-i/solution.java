class Solution {
    public int minimumPushes(String word) {
        int n=word.length();
        int rev=0;
        for(int i=0; i<n;i++){
            rev=rev+(i/8+1);
        }
        return rev;
    }
}
