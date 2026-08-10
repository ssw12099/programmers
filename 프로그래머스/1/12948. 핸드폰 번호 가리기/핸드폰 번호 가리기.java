class Solution {
    public String solution(String phone_number) {
        String answer =phone_number.substring(0,phone_number.length()-4);
        
        answer =answer.replaceAll("[0-9]","*") + phone_number.substring(phone_number.length()-4);
        return answer;
    }
}