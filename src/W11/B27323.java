package W11;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/27323
// 직사각형 - 브5
public class B27323 {
    public static void main(String[] args) throws IOException {
        // 정수 A,B가 주어진다.
        // 세로 Acm 가로 Bcm인 직사각형의 넓이를 cm^2단위로 구하시오
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        System.out.println(a*b);

    }
}
