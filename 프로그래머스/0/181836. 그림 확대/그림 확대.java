class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length*k];
        for(int i=0;i<picture.length;i++){
            String tmp = "";
            for(int j=0;j<picture[i].length();j++){
                for(int b=0;b<k;tmp+=(picture[i].charAt(j+(0*b++))+""));
            }
            for(int x=0;x<k;answer[i*k+x++]=tmp);
        }
        return answer;
    }
}