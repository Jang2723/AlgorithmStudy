package W11;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/15894
// 수학은 체육과목입니다. - 브3
public class B15894 {
    public static void main(String[] args) throws IOException {
        /*
        한 변의 길이가 1인 정사각형을 피라미드 모양으로 쌓아나간다.
        가장 아랫부분의 정사각형이 n개가 되었을 때
        실선으로 이루어진 도형의 둘레의 길이를 구하시오
        가장 아랫부분 정사각형 개수가 주어지면 답을 출력하라
        ( 1 <= n <= 10^9)
        */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 또 입력 범위 살피지 않아서 틀림, int 범위 잘 알아둘것
        long n = Long.parseLong(br.readLine());
        System.out.println(n*4);
    }
}
