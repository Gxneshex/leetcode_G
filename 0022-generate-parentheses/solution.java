class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        back(n,res,"",0,0);
        return res;
    }
    void back(int n,List<String>res,String str, int open, int close){
        if(str.length()==2*n){
            res.add(str);
            return;
        }
        if(open<n){
            back(n, res, str + "(", open + 1, close); 
        }
        if(close<open){
            back(n, res, str + ")", open, close + 1);
        }
    }
}
