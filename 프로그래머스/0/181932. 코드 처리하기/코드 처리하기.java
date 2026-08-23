class Solution {
    public String solution(String code) {
        String answer = "";
        int m = 0;
        for(int i=0;i<code.length();i++){
            if(code.charAt(i)=='1')m=(m==1)?0:1;
            else if(m==0&&i%2==0)answer+=code.charAt(i)+"";
            else if(m==1&&i%2==1)answer+=code.charAt(i)+"";
        }
        return (answer.equals(""))?"EMPTY":answer;
    }
}