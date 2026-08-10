class Solution {
    public int[] solution(int[] numbers) {
        int len = numbers.length;
        System.out.println(len);
        int[] answer = new int[len];
        
        for(int i=0;i<len;i++){
            answer[i]=numbers[i]*2;
        }
        return answer;
    }
}