class Solution {
    public boolean solution(int x) {
        int tmp = 0;
        for(int i=x;i>0;i/=10){
            tmp += i%10;
        }
        return x%tmp == 0?true:false;
    }
}