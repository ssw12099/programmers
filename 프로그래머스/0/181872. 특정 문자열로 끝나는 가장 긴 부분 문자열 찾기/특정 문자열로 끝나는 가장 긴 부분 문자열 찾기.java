class Solution {
    public String solution(String myString, String pat) {
        String answer = myString;
        for(int i=myString.length();!answer.substring(i-pat.length(),i--).equals(pat);){
            answer = answer.substring(0,i);
            System.out.println(answer);
        }
        return answer;
    }
}