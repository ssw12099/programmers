class Solution {
    boolean solution(String s) {
        int pc = 0;
        int yc = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='Y'||s.charAt(i)=='y')yc++;
            if(s.charAt(i)=='P'||s.charAt(i)=='p')pc++;
        }
        boolean answer = (pc == yc)? true:false;
        return answer;
    }
}