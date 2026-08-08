import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        Integer[] idx = new Integer[emergency.length]; // 컴페어 소트는 객체만 !
        for (int i = 0; i < emergency.length; i++) {
            idx[i] = i;
        }
        //idx를 뒷 기준으로 정렬   -뒷기준은 람다식 컴페어 음수 양수로 정렬되는 그런 느낌인거지
        Arrays.sort(idx, (a, b) -> Integer.compare(emergency[a], emergency[b]));
        
        //idx를 정렬한걸 그 순서마다로 등수 넣는거지
        for(int i=0;i<emergency.length;i++){
            answer[idx[i]] = emergency.length - i;
        }
        
        return answer;
    }
}