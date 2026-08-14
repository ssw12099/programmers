class Solution {
    public String solution(String my_string, int s, int e) {
        char[] str = my_string.toCharArray();
        for(int i=s;i<(e+s+1)/2;i++){
            char tmp = str[i];
            str[i]=str[(e+s)-i];
            str[(e+s)-i]=tmp;
        }
        return new String(str);
    }
}