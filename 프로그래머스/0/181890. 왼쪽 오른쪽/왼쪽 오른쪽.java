class Solution {
    public String[] solution(String[] str_list) {
        int[] idx = {-1,0};
        for(int i=0;i<str_list.length;i++){
            if(str_list[i].equals("l")||str_list[i].equals("r")){
                idx[0] = i;
                idx[1] = (str_list[i].equals("r"))?1:0;
                break;
            }
        }
        String[] answer = new String[(idx[0]==-1)?0:(idx[1]==0)?idx[0]:str_list.length-idx[0]-1];
        int c=0;
        for(int i=(idx[1]==0)?0:idx[0]+1;i<str_list.length&&( c<answer.length);i++){
            answer[c++]=str_list[i];
        }
        return answer;
    }
}