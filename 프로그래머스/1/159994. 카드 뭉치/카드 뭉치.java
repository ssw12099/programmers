class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer;
        
        boolean flag = true;
        int count1=0;
        int count2=0;
        for(int i=0;i<goal.length;i++){
            if(count1<cards1.length&&cards1[count1].equals(goal[i])){
                count1++;
            }else if(count2<cards2.length&&cards2[count2].equals(goal[i])){
                count2++;
            }else{
                flag = false;
                break;
            }
        }   
        
        if(flag){
            answer = "Yes";
        }else{
            answer = "No";
        }
        return answer;
    }
}