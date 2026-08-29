class Solution {
    public int solution(int[][] sizes) {
        int w = Math.max(sizes[0][0],sizes[0][1]),h=Math.min(sizes[0][0],sizes[0][1]);
        for(int i=1;i<sizes.length;i++){
            int t = Math.max(sizes[i][0],sizes[i][1]),t2=Math.min(sizes[i][0],sizes[i][1]);
            if(w<t)w=t;
            if(h<t2)h=t2;
        }
        int answer = w*h;
        return answer;
    }
}