class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] str = my_string.toCharArray();
        for(int i=0;i<queries.length;i++){
            while(queries[i][0]<queries[i][1]){
                char tmp = str[queries[i][0]];
                str[queries[i][0]++]=str[queries[i][1]];
                str[queries[i][1]--]=tmp;
            }
        }
        return new String(str);
    }
}