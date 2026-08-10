class Solution {
    public int[] solution(String s) {
        int[] in= new int[26];
        for(int i=0;i<26;in[i++]=-1);
        int[] answer = new int[s.length()];
        for(int i=0;i<answer.length;i++){
            answer[i] = (in[s.charAt(i)-'a']==-1)?-1:i-in[s.charAt(i)-'a'];
            in[s.charAt(i)-'a'] = i;
        }
        return answer;
    }
}