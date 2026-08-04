class Solution {
    public int solution(String before, String after) {
        String answer = before;
        for(int i=0;i<after.length();i++){
            answer = answer.replaceFirst(after.charAt(i)+"","");
        }
        return answer.length()==0?1:0;
    }
}