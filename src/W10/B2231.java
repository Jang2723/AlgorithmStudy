package W10;
// https://www.acmicpc.net/problem/2231
// 분해합 - 브2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2231 {
    public static void main(String[] args) throws IOException {
        /*
        자연수 n의 분해합은 n과 n을 이루는 각 자리수의 합을 의미한다.
        어떤 자연수 m의 분해합이 n인 경우, m을 n의 생성자라고 한다.

        245 의 분해합 : 245 + 2 + 4 + 5
        = 256
        245는 256의 생성자
        자연수 n이 주여졌을 때 n의 가장 작은 생성자
        생성자는 여러개 일수 있다.
        생성자가 없는 경우 0 출력
        */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 0; i < n; i++) {
            int num = i;
            int sum = 0; // 각 자릿수 합

            while(num != 0){
                sum += num % 10; // 각 자릿수 더하기
                num /= 10;
            }

            if (sum + i == n) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
