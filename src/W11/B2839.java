package W11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/2839
// 설탕 배달  - 실4
public class B2839 {
    public static void main(String[] args) throws IOException {
        /*
        n킬로그램 배달
        봉지는 3킬로그램 봉지, 5킬로그램 봉지
        최대한 적은 봉지를 들고 가려고 함
        ex) 18킬로그램
        = 3 * 6 : 3킬로그램 6개
        = 5 * 3 + 3 * 1 : 5킬로그램 3개 3킬로그램 1개 => 총 4개
        정확하게 n킬로그램을 만들수 없다면 -1 출력
        */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int cnt = 0;
        while (true) {
            if (n % 5 == 0) {
                System.out.println(n / 5 + cnt);
                break;
            } else if (n < 0) {
                System.out.println(-1);
                break;
            }
            n -= 3;
            cnt++;
        }
    }
}