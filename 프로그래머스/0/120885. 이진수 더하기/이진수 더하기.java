class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        while(bin1.length()!=bin2.length()){
            if(bin1.length()>bin2.length()){
                bin2="0"+bin2;
            }else{
                bin1="0"+bin1;
            }
        }
        int carry=0;
        for(int i=bin1.length()-1;i>=0;i--){
            int tmp = (bin1.charAt(i)-'0')+(bin2.charAt(i)-'0')+carry;
            carry = (tmp > 1)?1:0;
            answer = "" + ((tmp==1||tmp==3)?1:0) + answer;
        }
        answer = ((carry==1)?"1":"")+answer;
        return answer;
    }
}