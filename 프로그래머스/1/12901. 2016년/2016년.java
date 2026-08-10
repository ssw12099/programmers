class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String day[] = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        int start=5;
        for(int i=1;i<=a;i++){
            for(int j=1;j<=31;j++){
                if(i==a&&j==b){
                    answer = day[start];
                }
                start = (start+1)%7;
                if(i==1||i==3||i==5||i==7||i==8||i==10||i==12){
                    if(j==31){
                        break;
                    }
                }else if(i==4||i==6||i==9||i==11){
                    if(j==30){
                        break;
                    }
                }else if(i==2){
                    if(j==29){
                        break;
                    }
                }
            }
        }
        return answer;
    }
}