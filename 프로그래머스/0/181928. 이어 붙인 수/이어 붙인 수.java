class Solution {
    public int solution(int[] num_list) {
        int n1 = 0;
        int n2 = 0;
        for(int i=0;i<num_list.length;i++){
            if(num_list[i]%2==0){
                n2*=10;
                n2+=num_list[i];
            }else{
                n1*=10;
                n1+=num_list[i];
            }
        }
        int answer = n1+n2;
        return answer;
    }
}