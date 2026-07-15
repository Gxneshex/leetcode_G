class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumodd=0;
        int sumeven=0;
        int odd=1;
        for (int i = 0; i < n; i++) {
            sumodd += odd;
            odd += 2;
        }
        int even = 2;
        for (int i = 0; i < n; i++) { 
            sumeven += even; 
            even += 2;
        }
    return gcd(sumodd,sumeven);
    }


    public int gcd(int a, int b) {
        while(b!=0){
            int temp = b;
            b= a%b;
            a=temp;
        }
        return a;
    }
}
