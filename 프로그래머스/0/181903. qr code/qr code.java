class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        for(int i=r;i<code.length();answer+=code.charAt(i+0*(i=i+q))+"");
        return answer;
    }
}