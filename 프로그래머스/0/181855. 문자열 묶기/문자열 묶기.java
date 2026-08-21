import java.util.Arrays;
class Solution {
    public int solution(String[] strArr) {
        int[] c = new int[30];
        for(int i=0;i<strArr.length;c[strArr[i++].length()-1]++);
        Arrays.sort(c);
        return c[29];
    }
}