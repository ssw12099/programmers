class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        for(int i = 2; i<=a&&i<=b;i+=((a%i)+(b%i)==0)?-i+2+(0*((a=a/i)+(b=b/i))):1);
        for(;b!=1;b = (b%5==0)?b/5:(b%2==0)?b/2:answer++);
        return answer;
    }
}