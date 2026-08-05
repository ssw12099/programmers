class Solution {
    public int[] solution(int[] arr) {
        int[] answer = arr;
        for(int i=0;i<arr.length;answer[i]=(answer[i]>=50)?answer[i]%2==0?answer[i]/2:answer[i]:answer[i]%2==1?answer[i]*2:answer[i],i++);
        return answer;
    }
}