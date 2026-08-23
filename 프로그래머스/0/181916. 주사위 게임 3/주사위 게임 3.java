import java.util.Arrays;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] arr = {a,b,c,d};
        Arrays.sort(arr);
        int answer = (a==b&&a==c&&a==d)?1111*a:(arr[0]!=arr[1]&&arr[1]==arr[2]&arr[2]==arr[3])?(arr[1]*10+arr[0])*(arr[1]*10+arr[0]):(arr[0]==arr[1]&&arr[1]==arr[2]&arr[2]!=arr[3])?(arr[1]*10+arr[3])*(arr[1]*10+arr[3]):(arr[0]==arr[1]&&arr[2]==arr[3])?(arr[1]+arr[3])*((arr[1]>arr[3])?(arr[1]-arr[3]):(arr[3]-arr[1])):(arr[0]==arr[1]&&arr[2]!=arr[3])?arr[2]*arr[3]:(arr[1]==arr[2]&&arr[0]!=arr[3])?arr[0]*arr[3]:(arr[2]==arr[3]&&arr[0]!=arr[1])?arr[0]*arr[1]:arr[0];
        return answer;
    }
}