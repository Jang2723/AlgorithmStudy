package W6;
// https://www.acmicpc.net/problem/11005
// 진법 변환2 - 일반수학-브2
/*
10진법 수 n이 주어진다.
b진법으로 바꿔 출력하는 프로그램
A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35
A아스키코드 65 Zz/ 0 아스키 코드 48
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]); // 2<= b <= 36

        // n을 나눈 나머지를 변환한 것을 저장할 StringBuilder
        StringBuilder sb = new StringBuilder();

        while(n > 0){
            if (n % b < 10){
                // 그냥 숫자일 경우
                sb.append((char)(n % b + '0'));
            }
            else{
                // 알파벳일 경우
                sb.append((char)(n % b - 10 + 'A'));
            }
            n /= b;
        }
        // 거꾸로 출력
        System.out.println(sb.reverse());
    }
}
