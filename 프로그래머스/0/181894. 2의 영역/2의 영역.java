class Solution {
    public int[] solution(int[] arr) {
        int[] idx = {-1,-1};
        for(int i=0;i<arr.length;i++){
            if(arr[i]==2&&idx[0]==-1){
                idx[0] = i;
                continue;
            }
            if(arr[i]==2){
                idx[1] = i;
            }
        }
        int[] answer = new int[(idx[1]==-1)?1:(idx[1]-idx[0]+1)];
        if(idx[1]==-1)answer[0]=(idx[0]==-1)?-1:arr[idx[0]];
        for(int i=0;idx[1]!=-1&&idx[0]+i<=idx[1];i++){
            answer[i] = arr[idx[0]+i];
        }
        return answer;
    }
}