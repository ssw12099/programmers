class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        for(int i=0;i<k;answer[i++]=-1);
        answer[0] = arr[0];
        for(int i=1,c=1;c<k&&i<arr.length;i++){
            boolean tmp = false;
            for(int j=0;j<c&&!tmp;tmp=(arr[i]==answer[j++])?true:false);
            answer[c]=(!tmp)?arr[i+(0*c++)]:-1;
        }
        return answer;
    }
}