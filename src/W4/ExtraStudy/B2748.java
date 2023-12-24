package W4.ExtraStudy;
// bottom-up 접근방식
import java.util.Scanner;

// https://www.acmicpc.net/problem/2748
// 피보나치 수2
public class B2748 {
    static long[] dp;
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        dp = new long[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i < n+1 ; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        System.out.println(dp[n]);
    }
}