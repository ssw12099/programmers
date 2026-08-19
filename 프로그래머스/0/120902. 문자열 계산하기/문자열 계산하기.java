class Solution {
    public int solution(String my_string) {
        String[] str = my_string.split(" ");
        int answer = Integer.parseInt(str[0]);
        for(int i=1;i<str.length;answer+=(str[i++].equals("+"))?Integer.parseInt(str[i++]):-Integer.parseInt(str[i++]));
        return answer;
    }
}