class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[(arr.length!=1)?arr.length-1:1];
        if(arr.length==1){
            answer[0] = -1;
        }else{
            int min = arr[0];
            int in = 0;
            for(int i = 1;i<arr.length;i++){
                if(min>arr[i]){
                    min = arr[i];
                    in = i;
                }
            }
            int count = 0;
            for(int i = 0;i<arr.length;i++){
                if(i==in)continue;
                answer[count++] = arr[i];
            }
        }
        return answer;
    }
}