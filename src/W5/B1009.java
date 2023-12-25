package W5;
// https://www.acmicpc.net/problem/1009
// 분산처리 - 브2
// 최대 10대의 컴퓨터
// 1번 데이터는 1번, 2번은 2번 컴퓨터....
// 10번은 10번 컴퓨터, 11번은 1번 컴퓨터...
// 총 데이터의 개수는 항상 a^b개의 형태
// 마지막 데이터가 처리될 컴퓨터의 번호가 궁금
// 첫줄에는 테스트케이스의 갯수 다음에는 a와 b

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1009 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] arr = br.readLine().split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            int com = 1;
            for (int j = 0; j < b; j++) {
                com *= a;
                com %= 10;
            }
            if (com == 0) com = 10;
            System.out.println(com);
        }
    }
}

/*
처음에는 Math.pow를 이용해서 제곱 수를 구한다음 10으로 나눈 나머지를 구했지만
test case : 7 100, 9 635 에서 계속 값이 다르게 나왔다.
문제의 해결법은 결국 a를 b번 곱한 값의 1의 자리를 알면 되기 때문에
방법을 바꿔서 처음 a를 10으로 나눈 나머지에 a를 곱하는 것을 b번 반복하면 된다고 생각했다.
나머지가 0일 경우 10번 컴퓨터가 출력되도록 주의하고 풀었다.
*/