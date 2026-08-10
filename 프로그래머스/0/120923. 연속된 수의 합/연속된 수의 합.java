class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int mid = total / num + ((num%2==0)?1:0);
        for(int i=0;i<num/2;i++){
            
            answer[i] = mid - (num/2-i);
            answer[num-i-1] = total / num + (num/2-i);
        }
        if(num%2==1)answer[num/2]= total / num;
        return answer;
    }
}