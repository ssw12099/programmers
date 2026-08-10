class Solution {
    public int solution(String A, String B) {
        int answer = -1;
        String tmp = A;
        for(int i=0;i<A.length();i++){
            if(tmp.equals(B)){
                answer = i;
                break;
            }
            tmp = tmp.substring(tmp.length()-1)+tmp.substring(0,tmp.length()-1);
        }
        return answer;
    }
}