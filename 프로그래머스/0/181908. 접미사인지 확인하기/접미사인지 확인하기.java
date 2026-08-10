class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        int len = my_string.length();
        for(int i=0;i<len;i++){
            if(my_string.length()<is_suffix.length())break;
            if(my_string.compareTo(is_suffix)==0){
                answer = 1;
                break;
            }
            my_string = my_string.substring(1);
        }
        return answer;
    }
}