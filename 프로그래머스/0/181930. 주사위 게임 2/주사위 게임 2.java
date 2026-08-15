class Solution {
    public int solution(int a, int b, int c) {
        return ((a*2-b-c)==0)?((a+b+c)*(a*a+b*b+c*c)*(a*a*a+b*b*b+c*c*c)):(a==b||a==c||b==c)?((a+b+c)*(a*a+b*b+c*c)):(a+b+c);
    }
}