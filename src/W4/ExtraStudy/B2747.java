package W4.ExtraStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// https://www.acmicpc.net/problem/2747
// 피보나치 수1 - 수학(브2)
public class B2747 {
    // 재귀함수로 풀면 시간초과 에러
    static int[] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dp = new int[n + 1];
        System.out.println(fibo(n));
    }
    // Top-down
    static int fibo(int x) {
        if (x == 1 || x == 2) return 1;
        // 0이 아니면 그 값을 전달
        if (dp[x] != 0) return dp[x];
        // 1,2도 아니고 그 값이 0이라면
        // 그 전에 저장해놓은 값을 호출해서 더해준다.
        dp[x] = fibo(x - 1) + fibo(x - 2);
        return dp[x];
    }
}