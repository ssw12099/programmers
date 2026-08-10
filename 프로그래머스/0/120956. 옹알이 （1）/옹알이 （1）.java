class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] aw={"aya", "ye", "woo", "ma"};
        for(int i=0;i<babbling.length;i++){
            for(int j=0;j<aw.length;j++){
                babbling[i] = babbling[i].replaceFirst(aw[j]," ");
            }
            babbling[i] = babbling[i].replace(" ","");
            if(babbling[i]=="")answer++;
        }
        return answer;
    }
}