class Solution {
    public int solution(String s) {
        int answer = 0;
        int tmp = 0;
        String[] str = s.split(" ");
        for(int i=0;i<str.length;i++){
            if(str[i].equals("Z")){
                answer -=tmp;
            }else{
                tmp = Integer.parseInt(str[i]);
                answer += tmp;
            }
        }
        return answer;
    }
}