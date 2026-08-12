class Solution {
    public int[] solution(int n) {
        int[] answer = new int[(n+1)/2];
        for(int i=0;i<answer.length;answer[i]=i+(i++)+1);
        return answer;
    }
}