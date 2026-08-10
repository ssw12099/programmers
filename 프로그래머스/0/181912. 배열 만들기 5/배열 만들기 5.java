class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int len = 0;
        for(int i=0;i<intStrs.length;i++){
            if(Integer.parseInt(intStrs[i].substring(s,s+l))>k)len++;
        }
        int[] answer = new int[len];
        len =0;
        for(int i=0;i<intStrs.length;i++){
            int tmp = Integer.parseInt(intStrs[i].substring(s,s+l));
            if(tmp>k)answer[len++]=tmp;
        }
        return answer;
    }
}