class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int i=0;i<array.length;i++){
            String tmp = Integer.toString(array[i]);
            answer += tmp.length()-tmp.replaceAll("7","").length();
        }
        return answer;
    }
}