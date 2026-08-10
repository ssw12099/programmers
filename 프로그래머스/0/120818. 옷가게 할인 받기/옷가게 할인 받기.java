class Solution {
    public int solution(int price) {
        int answer =(int) ((price/500000>=1)?price*0.8:((price/300000>=1)?price*0.9:((price/100000>=1)?price*0.95:price)));
        return answer;
    }
}