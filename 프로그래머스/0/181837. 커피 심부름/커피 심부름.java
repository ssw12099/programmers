class Solution {
    public int solution(String[] order) {
        int answer = 0;
        for(int i = 0;i<order.length;i++){
            switch(order[i]){
                case "iceamericano":
                case "americanoice":
                case "hotamericano": 
                case "americanohot":
                case "americano":
                case "anything":
                    answer+=4500;
                    break;
                case "icecafelatte":
                case "cafelatteice":
                case "hotcafelatte":
                case "cafelattehot":
                case "cafelatte":
                    answer+=5000;
            }
        }
        return answer;
    }
}