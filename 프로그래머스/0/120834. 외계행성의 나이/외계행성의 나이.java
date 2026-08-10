class Solution {
    public String solution(int age) {
        String a = "";
        for(int i=0;i<Integer.toString(age).length();a+=(char)(Integer.toString(age).charAt(i++)-'0'+'a')+"");
        return a;
    }
}