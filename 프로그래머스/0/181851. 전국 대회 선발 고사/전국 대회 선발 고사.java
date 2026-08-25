import java.util.Arrays;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int a=-1,b=-1,c=-1;
        for(int i=0;i<rank.length;i++){
            if(a==-1&&attendance[i])a=i;
            if(a!=-1&&rank[a]>rank[i]&&attendance[i])a=i;
        }
        for(int i=0;i<rank.length;i++){
            if(b==-1&&a!=i&&attendance[i])b=i;
            if(b!=-1&&a!=i&&rank[b]>rank[i]&&attendance[i])b=i;
        }
        for(int i=0;i<rank.length;i++){
            if(c==-1&&a!=i&&b!=i&&attendance[i])c=i;
            if(c!=-1&&a!=i&&b!=i&&rank[c]>rank[i]&&attendance[i])c=i;
        }
        
        return 10000*a+100*b+c;
    }
}