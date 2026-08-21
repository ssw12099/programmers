class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for(int i=0;i<answer.length;i++){
            int tmp = 1000001;
            for(int j=queries[i][0];j<=queries[i][1];tmp=(tmp>arr[j]&&arr[j]>queries[i][2])?arr[j++]:tmp+(0*j++));
            answer[i] = (tmp==1000001)?-1:tmp;
        }
        return answer;
    }
}