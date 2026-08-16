class Solution {
    public String[] solution(String[] strArr) {
        int len = 0;
        for(int i=0;i<strArr.length;len+=(strArr[i].length()==strArr[i].replace("ad","1").length())?1+(strArr[i++].replace("1","ad").length()*0):0*i++);
        if(len==strArr.length)return strArr;
        String[] answer = new String[len];
        for(int i=0,j=0;i<strArr.length&&j<answer.length;answer[j]=(strArr[i].length()==strArr[i++].replace("ad","").length())?strArr[i-1+(j++*0)]:answer[j]);
        return answer;
    }
}