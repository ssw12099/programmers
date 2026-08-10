import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int c=0;
        for(int i=0;i<arr.length;i++){
            c += (arr[i]%divisor==0)?1:0;
        }
        int[] answer = new int[(c==0)?1:c];
        answer[0] = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%divisor == 0){
                answer[--c] = arr[i];
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}