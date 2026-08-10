class Solution {
    public int[] solution(int[] arr, int[][] in) {
        int[] answer = new int[(in[0][1]-in[0][0])+(in[1][1]-in[1][0])+2];
        int c=0;
        for(int i=in[0][0];i<=in[0][1];i++){
            answer[c++]=arr[i];
        }
        for(int i=in[1][0];i<=in[1][1];i++){
            answer[c++]=arr[i];
        }
        return answer;
    }
}