class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String sb = "";
        for(int i=0;i<todo_list.length;sb+=(finished[i++])?"":todo_list[i-1]+" ");
        String[] answer = sb.split(" ");
        return answer;
    }
}