class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i=0;i<s.length();i++){
            char tmp = s.charAt(i);
            answer += (tmp==' ')?" ":(tmp>='a')?(char)((tmp-'a'+n)%26+'a')+"":(char)((tmp-'A'+n)%26+'A')+"" ;
        }
        return answer;
    }
}