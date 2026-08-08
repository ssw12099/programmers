class Solution {
    public String solution(String[] seoul) {
        int in;
        for(in = 0;in<seoul.length&&!seoul[in].equals("Kim");in++); 
        return "김서방은 "+in+"에 있다";
    }
}