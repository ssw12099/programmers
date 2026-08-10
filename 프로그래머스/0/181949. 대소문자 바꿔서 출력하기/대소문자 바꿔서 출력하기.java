import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String r = "";
        for(int i=0;i<a.length();i++){
            r+=(a.charAt(i)<'a')?(char)(a.charAt(i)+'a'-'A'):(char)(a.charAt(i)+'A'-'a')+"";
        }
        System.out.println(r);
    }
}