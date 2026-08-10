class Solution {
    public int[] solution(int[] arr) {
		int[] tmp = new int[arr.length];
		int in = -1;
        int i = 0;
        while(i<arr.length){
            if(in == -1){
                tmp[++in]=arr[i++];
            }else if(in!=-1&&tmp[in]<arr[i]){
                tmp[++in]=arr[i++];
            }else if(in!=-1&&tmp[in]>=arr[i]){
                in--;
            }
        }
        int[] stk = new int[++in];
        for(int j =0;j<in;j++){
            stk[j]=tmp[j];
        }
        return stk;
    }
}