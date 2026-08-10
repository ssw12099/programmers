class Solution {
    public int solution(String t, String p) {
        if(!(1<=p.length()||p.length()<=18)){
            if(p.length()<=t.length()||t.length()<=10000){
                return 0;
            }
        }
        int answer = 0;
        String arr = "";
        for(int i=0;i<t.length();i++){
            if(i<p.length()){
                arr = arr.concat(t.substring(i,i+1));
            }else{
                    arr = arr.concat(t.substring(i,i+1));
                    arr = arr.substring(1);
            }
            if(arr.length()!=p.length()){
                continue;
            }
            if(Long.parseLong(arr)<=Long.parseLong(p)){
                answer++;
            }
        }
        
        return answer;
    }
}