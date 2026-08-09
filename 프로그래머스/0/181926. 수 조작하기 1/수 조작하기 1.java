class Solution {
    public int solution(int n, String control) {
        for(int i=0;i<control.length();i++){
            char ch = control.charAt(i);
            n += (ch=='w')?1:(ch=='s')?-1:(ch=='d')?10:(ch=='a')?-10:0;
        }
        return n;
    }
}