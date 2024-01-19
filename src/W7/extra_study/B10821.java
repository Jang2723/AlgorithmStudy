package W7.extra_study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/10821
// 정수의 개수 - 파싱- 브2
public class B10821 {
    public static void main(String[] args) throws IOException {
        // 숫자와 콤마로만 이루어진 문자열 S, s에 포함되어 있는 정수의 개수를 구하시오
        // 첫문자와 마지막 문자는 항상 숫자, 콤마는 연속해서 주어지지 않고 0으로 시작하는 정수는 주어지지 않는다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(",");
        System.out.println(str.length);
    }
}
