class Solution {
    public int solution(String binomial) {
        int in = 0;
        for(;!("+-*".contains(binomial.charAt(in)+""));in++);
        int a = Integer.parseInt(binomial.substring(0,in-1));
        int b = Integer.parseInt(binomial.substring(in+2));
        char op = binomial.charAt(in);
        int answer = (op=='+')?a+b:(op=='-')?a-b:(op=='*')?a*b:0;
        return answer;
    }
}