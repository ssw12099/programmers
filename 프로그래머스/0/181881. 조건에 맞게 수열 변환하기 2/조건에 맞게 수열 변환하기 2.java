class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        for(;;answer++){
            int flag = 0;
            for(int i=0;i<arr.length;i++){
                int tmp=(arr[i]>=50&&arr[i]%2==0)?arr[i]/2:(arr[i]<50&&arr[i]%2==1)?arr[i]*2+1:arr[i];
                if(tmp == arr[i]) flag++;
                arr[i]=tmp;
            }
            if(flag==arr.length)break;
        }
            
        return answer;
    }
}