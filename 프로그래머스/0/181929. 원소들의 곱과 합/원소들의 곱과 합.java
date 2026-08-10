class Solution {
    public int solution(int[] num_list) {
        int[] answer = {1,0};
        for(int i=0;i<num_list.length;answer[1]+=num_list[i],answer[0]*=num_list[i++]);
        return answer[0]>answer[1]*answer[1]?0:1;
    }
}