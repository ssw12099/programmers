class Solution {
    public int solution(int n) {
        String tmp  = Integer.toString(n,3);
        tmp = new StringBuilder(tmp).reverse().toString();
        return Integer.parseInt(tmp,3);
    }
}