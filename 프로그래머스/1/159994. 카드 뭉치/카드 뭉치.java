class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int idx = 0;
        int[] tmp = {0,0};
        while(idx<goal.length){
            if(tmp[0]<cards1.length&&cards1[tmp[0]].equals(goal[idx])){idx++;tmp[0]++;}
            else if(tmp[1]<cards2.length&&cards2[tmp[1]].equals(goal[idx])){idx++;tmp[1]++;}
            else break;
        }
        
        return (idx == goal.length ) ? "Yes":"No";
    }
}