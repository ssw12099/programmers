import java.util.Arrays;
class Solution {
    public int[] solution(int[] numbers) {
        int max = Arrays.stream(numbers).max().getAsInt()*2;
        int c = 0;
        for(int n = 0;n<=max;n++){
            boolean flag = false;
            for(int i=0;i<numbers.length;i++){
                for(int j=0;j<numbers.length;j++){
                    if(i==j)continue;
                    if(numbers[i]+numbers[j]==n){
                        flag = true;
                        break;
                    }
                }
                if(flag)break;
            }
            if(flag)c++;
        }
        int[] answer = new int[c];
        c=0;
        for(int n = 0;n<=max;n++){
            boolean flag = false;
            for(int i=0;i<numbers.length;i++){
                for(int j=0;j<numbers.length;j++){
                    if(i==j)continue;
                    if(numbers[i]+numbers[j]==n){
                        flag = true;
                        break;
                    }
                }
                if(flag)break;
            }
            if(flag)answer[c++] = n;
        }
        return answer;
    }
}