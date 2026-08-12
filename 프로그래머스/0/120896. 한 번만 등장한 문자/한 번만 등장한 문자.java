import java.util.Arrays;

class Solution {
    public String solution(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        String answer = new String(chars);
        return answer.replaceAll("(.)\\1+", "");
    }
}