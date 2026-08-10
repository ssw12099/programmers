class Solution {
    public String[] solution(String my_str, int n) {
        int len = (my_str.length()%n==0)?my_str.length()/n:(my_str.length()/n)+1;
        String[] answer = new String[len];
        int i=0;
        for(i=0;i<len-1;i++){
            answer[i] = my_str.substring(i*n,i*n+n);
        }
        answer[i] = my_str.substring(i*n);
        return answer;
    }
}