class Solution {
    public String solution(String[] survey, int[] choices) {
        int[][] c = new int[4][2];
        // [0][0] = R  [0][1] = T
        // [1][0] = C  [1][1] = F
        // [2][0] = J  [2][1] = M  
        // [3][0] = A  [3][1] = N
        for(int i=0;i<survey.length;i++){
            char ch = survey[i].charAt(0);
            int num = choices[i];
            switch(ch){
                case 'R'-> c[0][(num>4)?1:0]+=(num>4)?num-4:4-num;
                case 'T'-> c[0][(num>4)?0:1]+=(num>4)?num-4:4-num;
                    
                case 'C'-> c[1][(num>4)?1:0]+=(num>4)?num-4:4-num;
                case 'F'-> c[1][(num>4)?0:1]+=(num>4)?num-4:4-num;
                    
                case 'J'-> c[2][(num>4)?1:0]+=(num>4)?num-4:4-num;
                case 'M'-> c[2][(num>4)?0:1]+=(num>4)?num-4:4-num;
                    
                case 'A'-> c[3][(num>4)?1:0]+=(num>4)?num-4:4-num;
                case 'N'-> c[3][(num>4)?0:1]+=(num>4)?num-4:4-num;
            }
        }
        return ((c[0][0]>=c[0][1])?"R":"T")+((c[1][0]>=c[1][1])?"C":"F")+
            ((c[2][0]>=c[2][1])?"J":"M")+((c[3][0]>=c[3][1])?"A":"N");
    }
}