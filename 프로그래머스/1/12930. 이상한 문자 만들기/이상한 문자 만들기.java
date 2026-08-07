class Solution {
    public String solution(String s) {
        String answer = "";
        int in = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                in = 0;
                answer += " ";
                continue;
            }
            answer+=(in++%2==0)?(s.charAt(i)+"").toUpperCase():(s.charAt(i)+"").toLowerCase();
        }
        /*
        1차 도전 코드
        문제점 : 두개 이상의 공백 처리 미흡
        String[] tmp = s.split(" ");
        String answer = "";
        for(int i=0;i<tmp.length;i++){
            for(int j=0;j<tmp[i].length();j++){
                answer += (j%2==0)?(tmp[i].charAt(j)+"").toUpperCase():(tmp[i].charAt(j)+"").toLowerCase();
            }
            answer +=(i<tmp.length-1)?" ":"";
        }
        */
        return answer;
    }
}