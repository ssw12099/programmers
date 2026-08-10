class Solution {
    public int[] solution(int[] arr) {
        int c=-1;
        int[] tmp = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(c==-1){
                tmp[++c]=arr[i];
            }else if(tmp[c]==arr[i]){
                c--;
            }else if(tmp[c]!=arr[i]){
                tmp[++c]=arr[i];
            }
        }
        int[] answer;
        if(c!=-1){
            answer = new int[c+1];
        }else{
            answer = new int[1];
            answer[0] = -1;
        }
        for(int i=0;i<c+1;i++){
            answer[i]=tmp[i];
        }
        return answer;
    }
}