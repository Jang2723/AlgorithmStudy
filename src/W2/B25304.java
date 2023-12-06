package W2;

import java.util.Scanner;
// https://www.acmicpc.net/problem/25304
/*
구매한 각 물건의 가격과 개수
구매한 물건들의 총 금액
을 보고, 구매한 물건의 가격과 개수로 계산한 총 금액이
영수증에 적힌 총 금액과 일치하는지 검사
*/
public class B25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 영수증에 적힌 총 금액 x
        int x = sc.nextInt();
        // 구매한 물건의 종류 n
        int n = sc.nextInt();
        // 내가 계산한 총 금액
        int sum = 0;
        // n개의 줄에는 물건의 가격 a와 개수 b가 공백을 두고 주어짐
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            sum += a * b;
        }
        if (x == sum){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");

        }
    }
}
