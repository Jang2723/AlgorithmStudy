package W7.extra_study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/1292
// 쉽게 푸는 문제 - 수학-브1
public class B1292 {
    public static void main(String[] args) throws IOException {
        /*
        1을 한 번, 2를 두 번, 3을 세 번, 이런 식으로 1 2 2 3 3 3 4 4 4 4 5 ..
        이러한 수열을 만들고 어느 일정한 구간을 주면 그 구간의 합을 구하는 것
        첫째 줄에 구간의 시작과 끝을 나타내는 정수 A, B(1 ≤ A ≤ B ≤ 1,000)가 주어진다.
        즉, 수열에서 A번째 숫자부터 B번째 숫자까지 합을 구하면 된다.
        */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int sum = 0;
        int cnt = 0;
        for (int i = 1; i <= b ; i++) {
            for (int j = 1; j <=i ; j++) {
                cnt++;
                if (a <= cnt && cnt <= b){
                    sum += i;
                }
            }
        }
        System.out.println(sum);
    }
}
