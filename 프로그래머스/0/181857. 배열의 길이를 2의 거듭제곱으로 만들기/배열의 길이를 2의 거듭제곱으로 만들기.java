class Solution {
    public int[] solution(int[] arr) {
        int size=1;
        for(;size<arr.length;size*=2);
        int[] answer = new int[size];
        for(int i=0;i<size;i++){
            if(i<arr.length){
                answer[i]=arr[i];
            }else{
                answer[i]=0;
            }
        }
        return answer;
    }
}