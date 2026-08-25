class Solution {
    public String solution(String a, String b) {
        String answer = "";
        while(a.length()!=b.length()){
            if(a.length()>b.length())b = "0"+b;
            else a = "0"+a;
        }
        int carry = 0;
        for(int i=a.length()-1;i>=0;i--){
            int tmp = (a.charAt(i)-'0')+(b.charAt(i)-'0')+carry;
            carry = tmp / 10;
            answer = "" + (tmp % 10) + answer;
        }
        answer = ((carry==1)?"1":"")+answer;
        
        
        return answer;
    }
}