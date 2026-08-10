class Solution {
    public int solution(String str1, String str2) {
        int answer = (str1.length()==str1.replace(str2,"").length())?2:1;
        return answer;
    }
}