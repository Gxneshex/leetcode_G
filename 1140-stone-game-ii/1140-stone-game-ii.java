class Solution {
    public int stoneGameII(int[] piles) {
        int n=piles.length;
        int[] s=new int[n+1];
        int[][] dp=new int[n][n+1];
        for(int i=n-1;i>=0;--i){
            s[i]=s[i+1]+piles[i];
        }
        for(int i=n-1;i>=0;--i){
            for(int m=1;m<=n;m++){
                for(int x=1; x<=2*m && i+x<=n; x++){
                    dp[i][m]=Math.max(dp[i][m], s[i] - (i + x < n ? dp[i + x][ Math.max(m, x)] : 0));
                    }
                }
            }
        return dp[0][1];
    }
}
