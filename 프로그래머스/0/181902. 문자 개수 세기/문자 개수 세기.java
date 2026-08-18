class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for(int i=0;i<my_string.length();answer[my_string.charAt(i)-((my_string.charAt(i++)<'a')?'A':'A'+6)]++);
        return answer;
    }
}