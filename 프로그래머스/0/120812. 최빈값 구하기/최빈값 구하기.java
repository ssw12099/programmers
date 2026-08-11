import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
            
        int[] tmp = {0,0,0,0,0}; //0=현재 숫자, 1=현재카운트, 2=최빈값, 3=최빈카운트, 4=중복최빈;
        for(int i=0;i<array.length;i++){
            if(tmp[0]!=array[i]){
                if(tmp[1]>tmp[3]){
                    tmp[2]=tmp[0];
                    tmp[3]=tmp[1];
                    tmp[4] = 0;
                }else if(tmp[1]==tmp[3]){
                    tmp[4]++;
                }
                tmp[0]=array[i];
                tmp[1]=0;
            }
            tmp[1]++;
        }
        
        if(tmp[1]>tmp[3]){
                tmp[2]=tmp[0];
                tmp[3]=tmp[1];
                tmp[4] = 0;
        }else if(tmp[1]==tmp[3]){
                tmp[4]++;
        }
        
        return (tmp[4]>0)?-1:tmp[2];
    }
}