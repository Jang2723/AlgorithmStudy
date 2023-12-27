package W5;
// https://www.acmicpc.net/problem/1075
// 나누기 -브루트포스 알고리즘- 브2
/* 두 정수 n, f
n의 가장 뒤 두 자리를 적절히 바꿔서(임의의 숫자로)
100 < n < 2000000000(int 가능)
n을 f로 나눠서 떨어지게 만들려고 한다.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1075 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int f = Integer.parseInt(br.readLine());

        // 끝이 0이 아니라면
        // 맨 뒤의 두자리만 바꿀 것이기 때문에 일단 무조건 00으로 만들어주기
        int changeN = 0;
        if (n % 100 != 0){
            changeN = n / 100 * 100;
        }
        else{
            // 이미 끝자리가 00인 경우
            changeN = n;
        }
        // changeN을 f로 나눠보고 f에서 나머지를 뺸 값을 더해줌
        // 가능하면 두 자리를 작게 만들려고 함
        int sumF = f - (changeN % f);
        // 더해주려는 값이 한자리수면 앞에 0을 붙여서 출력
        if (changeN % f == 0){
            // 00으로 바꾼 후가 약수일때 00 출력
            System.out.println("00");
        }
        else{
            if (sumF / 10 == 0) {
                // 한자리일 경우 0붙여서 출력
                String num = "0";
                System.out.println(num+sumF);
            }
            else{
                // 두 자리 수라면 그냥 출력
                System.out.println(sumF);
            }
        }
    }
}
