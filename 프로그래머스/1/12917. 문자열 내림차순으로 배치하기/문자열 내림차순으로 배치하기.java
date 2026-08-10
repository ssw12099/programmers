import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String[] tmp = s.split("");
        Arrays.sort(tmp);
        //Arrays.sort(tmp, Collections.reverseOrder());
        //String은 리버스 가능 콜렉션 임포트해야함
        //이문제는 char[] tmp = s.toCharArray();
        //이방식이 메모리에 더 좋을듯 문자열 처리를 문자 처리 후 합치기
        
        for(int i=0;i<tmp.length/2;i++){
            String t = tmp[i];
            tmp[i] = tmp[tmp.length-i-1];
            tmp[tmp.length-i-1] = t;
        }
        String answer = String.join("",tmp);
        
        return answer;
    }
}