class Solution {
    int[][] answer;
    int idx = 0;
    public void move(int s, int d, int c, int n) {
        if (n == 0) return;

        move(s, c, d, n - 1);

        answer[idx][0] = s;
        answer[idx][1] = d;
        idx++;

        // n-1개를 보조 -> 목적지
        move(c, d, s, n - 1);
    }
    public int[][] solution(int n) {
        answer = new int[(1 << n) - 1][2];
        move(1, 3, 2, n);
        return answer;
    }
}