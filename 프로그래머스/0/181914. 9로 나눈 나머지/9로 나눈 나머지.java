class Solution {
    public int solution(String number) {
        int r = 0;
        for(int i=0;i<number.length();r+=number.charAt(i++)-'0');
        return r%9;
    }
}