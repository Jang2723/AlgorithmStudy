package W5.ExtraStudy;

// https://www.acmicpc.net/problem/1010
// 다리 놓기 - 다이나믹 프로그래밍-실버5

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1010 {
    static int[][] dp = new int [30][30]; // 최대 입력값이 29
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());
        int m,n;
        for (int i = 0; i < T; i++) {
            String[] temp = reader.readLine().split(" ");
            n = Integer.parseInt(temp[0]);
            m = Integer.parseInt(temp[1]);
            System.out.println(bridge(m,n));
        }
    }

    // 서족의 1번이 동쪽의 4번으 고르면 서족의 2번은 동쪽의 5번 이후로만 선택 가능
    // Combination 으로 풀 수 있음 n!/(r!(n-r)!)
    static int bridge(int n, int r){ // M개중 N개를 뽑는 것
        if (n == r || r == 0){ // 두 곳의 사이트 수가 같다면 방법은 한개
            return dp[n][r] = 1;
        }
        // 이미 탐색했던 경우라면 반환
        else if (dp[n][r] > 0) {
            return dp[n][r];
        }
        else{
            return dp[n][r] = bridge(n-1,r-1) + bridge(n-1, r);
        }
    }
}

/*
시간 초과 에러(Scanner -> BufferedReader)
처음에 귀찮아서 BufferedReader 안쓰고 Scanner를 써서 T,n,m 값을 입력 받았다.
인텔리제이에서는 문제없이 작동되었고 test case에 맞게 출력도 잘 됐다.
막상 제출하고 보니 시간초과 에러가 떴고 문제 요구사항에 시간제한이 다른 문제와 다르게 0.5초로 나와있는 것을 늦게 발견햇다.
BufferedReader로 고치고 n,m입력을 String 배열로 받아서 다시 저장해 주니 사이트에서도 잘 작동되었다.
*/
