class Solution {
    public int[] solution(int[] answers) {
        int[] c ={0,0,0,0};
        int tmp1 = 0;
        int tmp2[] = {3,1,2,4,5};
        int tmp3 = 0;
        for(int i=0;i<answers.length;i++){
            if(answers[i]==(i%5)+1)c[0]++;
            if(tmp1%5==1)tmp1++;
            if(answers[i]==((i%2==0)?2:(tmp1++%5)+1))c[1]++;
            if(answers[i]==((i%2==0)?tmp2[tmp3%5]:tmp2[tmp3++%5]))c[2]++;
        }
        int max = c[0];
        for(int i=1;i<3;i++){
            max = (max<c[i])?c[i]:max;
        }
        for(int i=0;i<3;i++){
            if(max == c[i])c[3]++;
        }
        int[] answer = new int[c[3]];
        int j=0;
        for(int i=0;i<3;i++){
            if(max == c[i])answer[j++] = i+1; 
        }
        return answer;
    }
}