class Solution {
    public String solution(String new_id) {
        String answer = new_id.toLowerCase().replaceAll("[^a-z0-9_.-]","").replaceAll("\\.+",".").replaceAll("^\\.|\\.$", "");
        return (answer.length()==0)?"aaa":(answer.length()>=16)?answer.substring(0,15).replaceAll("\\.$", ""):(answer.length()==1)?(answer+answer+answer):(answer.length()==2)?(answer+answer.charAt(1)+""):answer;
    }
}