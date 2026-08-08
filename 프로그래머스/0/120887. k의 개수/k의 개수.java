class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int num=i;num<=j;num++){
            int tmp = (num+"").replace((k+""),"").length();
            answer+=tmp!=(num+"").length()?((num+"").length()-tmp):0;
        }
        return answer;
    }
}