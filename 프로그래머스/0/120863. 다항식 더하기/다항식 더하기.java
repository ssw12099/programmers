class Solution {
    public String solution(String polynomial) {
        String[] str = polynomial.replaceAll(" \\+ "," ").split(" ");
        int x=0,c=0;
        for(int i=0;i<str.length;i++){
            if(str[i].charAt(str[i].length()-1)=='x'){
                if((str[i].length()==1))x++;
                else x+=(Integer.parseInt(str[i].replace("x","")));
            }else c+=Integer.parseInt(str[i]);
        }
        return((x==0)?"":((x==1)?"x":x+"x"))+((x!=0&&c!=0)?" + ":"")+((c==0)?"":""+c);
    }
}