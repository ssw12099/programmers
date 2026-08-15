class Solution {
    public int solution(int a, int b, int c) {
        return ((a-b)*(a-b) + (b-c)*(b-c) + (c-a)*(c-a) == 0)
            ? (a+b+c)*(a*a+b*b+c*c)*(a*a*a+b*b*b+c*c*c)
            : ((a-b)*(b-c)*(c-a) == 0)
            ? (a+b+c)*(a*a+b*b+c*c)
            : (a+b+c);
    }
}