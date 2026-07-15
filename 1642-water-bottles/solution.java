import java.util.*;
class Solution {
    public int numWaterBottles(int nb, int ne) {
        int ans=nb;
        while(nb>=ne){
            int n=nb/ne;
            int remaining=nb%ne;
            ans+=n;
            nb=remaining+n;
        } 
        return ans;       
    }
}
