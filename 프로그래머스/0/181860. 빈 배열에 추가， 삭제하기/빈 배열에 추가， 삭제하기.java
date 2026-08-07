import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        //int c=0;
        //for(int i=0;i<flag.length;c+=(flag[i++])?arr[i-1]*2:-arr[i-1]);
        //int[] answer = new int[c];
        //길이 확인코드인데 스트링이면 필요없다
        
        String tmp = ""; //한자리수 숫자니깐 스트링으로 만들고 스플릿
        for(int i=0;i<flag.length;i++){
            if(flag[i]){
                for(int j=0;j<arr[i]*2;tmp = tmp + arr[i+(0*j++)]);
            }else{
                tmp = tmp.substring(0,tmp.length()-arr[i]);
            }
        }
        
        int[] answer = new int[tmp.length()];
        for (int i = 0; i < tmp.length(); i++) {
            answer[i] = tmp.charAt(i) - '0';
        }
        return answer;
    }
}