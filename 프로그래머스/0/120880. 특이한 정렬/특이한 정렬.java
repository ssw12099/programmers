class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        for(int i=0;i<answer.length;i++){
            int[] tmp = {10001+n,0};
            for(int j=0;j<numlist.length;j++){
                if(Math.abs(n - tmp[0]) > Math.abs(n - numlist[j]) ||
                   (Math.abs(n - tmp[0]) == Math.abs(n - numlist[j])
                    && tmp[0] < numlist[j])) {
                    tmp[0] = numlist[j];
                    tmp[1] = j;
                }
            }
            numlist[tmp[1]] = 10001+n;
            answer[i] = tmp[0];
        }
        return answer;
    }
}