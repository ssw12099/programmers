class Solution {
    public int[] solution(int[] arr) {
        int size = 0;
        for(int i=0;i<arr.length;size+=arr[i++]);
        int[] answer = new int[size];
        int c=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i];j++){
                answer[c++] = arr[i];
            }
        }
        return answer;
    }
}