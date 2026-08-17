class Solution {
    public int[] solution(String myString) {
        int len = 1;
        for(int i=0;i<myString.length();len+=(myString.charAt(i++)=='x')?1:0);
        int[] answer = new int[len];
        for(int i=0,c=0;i<myString.length();answer[c]+=(myString.charAt(i++)=='x')?0*c++:1);
        return answer;
    }
}