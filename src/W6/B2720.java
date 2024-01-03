package W6;
// https://www.acmicpc.net/problem/2720
// 세탁소 사장 동혁 - 일반수학1- 브3
/*
거스름돈의 액수가 주어지면
쿼터($0.25)의 개수 q
다임($0.10)의 개수 d
니켈($0.05)의 개수 n
페니($0.01)의 개수 p
를 구하는 프로그램 작성
거스롬 돈은 항상 $5.00 이하
받는 동전의 개수는 최소
첫줄에는 테스트 케이스의 개수 t
거스름돈 c를 나타내는 정수, 단위는 센트이다 1달러 = 100센트
$1.24 =  4 쿼더, 2다임, 0니켈, 4페니
  = 4 * 0.25 + 2 * 0.1 + 0 + 4 * 0.01
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int c = Integer.parseInt(br.readLine()); // 거스름돈 c
            int q = c / 25;
            int d = (c % 25) / 10;
            int n = (c % 25) % 10 / 5;
            int p = (c % 25) % 10 % 5 / 1;
            System.out.print(q+" " + d +" " + n + " " + p + " ");
        }
    }
}
