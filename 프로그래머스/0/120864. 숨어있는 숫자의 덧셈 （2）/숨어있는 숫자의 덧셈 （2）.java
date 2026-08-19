class Solution {
    public int solution(String my_string) {
        if(my_string.replaceAll("[^0-9]","").length()==0)return 0;
        String[] tmp = my_string.replaceAll("[^0-9]"," ").trim().split("\\s+");
        int answer = 0;
        for(int i=0;i<tmp.length;answer+=Integer.parseInt(tmp[i++]));
        return answer;
    }
}