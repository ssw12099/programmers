class Solution {
    public String[] solution(String myStr) {
        myStr = myStr.replaceAll("[abc]"," ").replaceAll("\\s+"," ");
        String[] answer = myStr.trim().split(" ");
        if(answer[0].equals(""))answer[0]="EMPTY";
        return answer;
    }
}