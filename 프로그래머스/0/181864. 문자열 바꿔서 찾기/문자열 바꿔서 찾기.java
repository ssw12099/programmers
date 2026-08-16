class Solution {
    public int solution(String myString, String pat) {
        return myString.replace("A","c").replace("B","A").replace("c","B").contains(pat)?1:0;
    }
}