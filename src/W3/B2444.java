package W3;

import java.util.Scanner;

// https://www.acmicpc.net/problem/2444
// 별찍기7
public class B2444 {
    public static void main(String[] args) {
        // 첫쨰 줄에 n이 주어진다.
        // 첫째줄부터 2*n-1번째 줄까지 차례대로 별 출력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n-1; i >= 1 ; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
