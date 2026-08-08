import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;
        char[] ch = (n+"").toCharArray();
        Arrays.sort(ch);
        for(int i=ch.length-1;i>=0;i--){
            answer*=10;
            answer+=ch[i]-'0';
        }
        return answer;
    }
}