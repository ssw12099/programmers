class Solution {
    public int[] solution(int[] arr, int[] query) {
        for(int i=0;i<query.length;i++){
            int[] tmp = new int[(i%2==1)?(arr.length-query[i]):(query[i]+1)];
            if(i%2==0) System.arraycopy(arr,0,tmp,0,tmp.length);
            else System.arraycopy(arr,query[i],tmp,0,tmp.length);
            arr = tmp;
        }
        return arr;
    }
}