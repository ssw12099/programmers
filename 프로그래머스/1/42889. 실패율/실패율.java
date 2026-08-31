import java.util.Arrays;
class Solution {
    public int[] solution(int N, int[] stages) {
        Integer[] answer = new Integer[N];
        for(int i=0;i<N;answer[i]=++i);
        
        double[] tmp = new double[N+1];
        for(int i=0;i<stages.length;tmp[stages[i++]-1]++);
        int c = 0;
        for(int i=0;i<N&&c<stages.length;i++){
            double count = tmp[i];
            tmp[i] = count == 0 ? 0 : count / (stages.length - c);
            c += count;
        }
        
        Arrays.sort(answer, (a, b) -> {
            if (tmp[a-1] == tmp[b-1]) {
                return a - b;
            }
            return Double.compare(tmp[b-1], tmp[a-1]);
        });
        
        int[] r = new int[answer.length];
        for(int i=0;i<r.length;r[i]=answer[i++]);
        return r;
    }
}