class Solution {
    public String solution(String my_string) {
        int len = my_string.length();
        char[] ch = new char[len];
        int count = 0;
        int flag = 0;
        String answer = "";
        for(int i =0;i<len;i++){
            for(int j=0;j<count;j++){
                if(my_string.charAt(i)==ch[j]){
                    flag = 1;
                }
            }
            if(flag==1){
                flag = 0;
                continue;
            }
            answer = answer.concat(my_string.substring(i,i+1));
            ch[count++] = my_string.charAt(i);
        }
        return answer;
    }
}