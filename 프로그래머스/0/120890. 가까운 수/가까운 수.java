class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        for(int i=0;i<array.length;i++){
            if(Math.abs(array[i]-n)<=Math.abs(answer-n)){
                if(Math.abs(array[i]-n)==Math.abs(answer-n)){
                    answer = (array[i]<answer)?array[i]:answer;
                    continue;
                }
                answer = array[i]; 
            }
        }
        return answer;
    }
}