package W6;

// https://www.acmicpc.net/problem/2745
// 진법 변환-일반수학-브2
/*
B진법 수 n이 주어진다.
이를 10진법으로 바꿔 출력하는 프로그램
10진법으로 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있다
알파벳 사용 -> A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35
A아스키코드 65 Z 90
첫 줄에 n과 b가 주어진다.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class B2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println((int)('A'-10));
        String[] str = br.readLine().split(" ");
        int B = Integer.parseInt(str[1]);
        int sum= 0;
        int temp = 1; //몇 승인지

        for (int i = str[0].length()-1; i >= 0; i--) { // 오른쪽부터 계산
            if ('A' <= (str[0].charAt(i)) && (str[0].charAt(i)) <= 'Z' ){
                // 10이상, 알파벳
//                sum += (int)(str[0].charAt(i) - 55) * temp;
                sum += (str[0].charAt(i) - 'A' + 10) * temp; // A의 아스키 코드 65 - 10진법으로 변환이므로 10더해줌 = 55
            }
            else{
                // 9이하, 숫자일 경우
                sum += (str[0].charAt(i) -'0') * temp;
                // -'0'을 해주지 않으면 채점에서 오류가 발생
                // char형을 int형으로 보면 아스키코드값이 나오므로
                // '0' 혹은 48을 빼주어야 원하는 값이 나온다
            }
            temp *= B;
        }
        System.out.println(sum);
    }
}
