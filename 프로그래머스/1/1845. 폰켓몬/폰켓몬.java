import java.util.Arrays;

class Solution {
    public int solution(int[] nums) {
        Arrays.sort(nums);
        int answer = 1;
        for(int i=1;i<nums.length;answer+=(nums[i-1]!=nums[i++])?1:0);
        return (nums.length / 2 < answer)?nums.length / 2 : answer;
    }
}