import java.util.Arrays;
class Solution
{
    public int solution(int []A, int []B)
    {
        Arrays.sort(A);
        Arrays.sort(B);
        int answer = 0;
        for(int i=0;i<A.length;answer+=A[i]*B[B.length-++i]);
        return answer;
    }
}