class Solution {
    public int[][] solution(int[][] arr) {
        int[][] answer = {};
        if(arr.length==arr[0].length){
            answer = arr;
        }else if(arr.length<arr[0].length){
            answer = new int[arr[0].length][arr[0].length];
            for(int i=0;i<arr[0].length;i++){
                for(int j=0;j<arr[0].length;j++){
                    answer[i][j]=(i<arr.length)?arr[i][j]:0;
                }
            }
        }else if(arr.length>arr[0].length){
            answer = new int[arr.length][arr.length];
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr.length;j++){
                    answer[i][j]=(j<arr[0].length)?arr[i][j]:0;
                }
            }
            
        }
        return answer;
    }
}