class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {((numer1*denom2)+(numer2*denom1)),(denom1*denom2)};
        int a = answer[0], b = answer[1];
        while (b != 0) { int r = a % b; a = b; b = r; }
        answer[0]/=a;
        answer[1]/=a;        
        return answer;
    }
}