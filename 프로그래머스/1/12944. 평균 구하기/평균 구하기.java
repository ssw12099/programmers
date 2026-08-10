class Solution {
    public double solution(int[] arr) {
        double tmp = 0;
        for(int i =0;i<arr.length;i++){
            tmp+=arr[i];
        }
        double answer = tmp / arr.length;
        return answer;
    }
}