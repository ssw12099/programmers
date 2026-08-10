class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = arr;
        for(int i=0;i<arr.length;answer[i]=(k%2==1)?answer[i++]*k:answer[i++]+k);
        return answer;
    }
}