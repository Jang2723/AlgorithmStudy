package W3.extraStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/2563
// 색종이
public class B2563 {
    public static void main(String[] args) throws IOException {
        // 가로세로 100인 정사각형 도화지 위애 가로세로 10 정사각형 색종이이를 여러장 붙인 다
        // 색종이가 붙은 영역의 넓이를 구해라
        // 색종이의 수 = 첫째줄
        // 둘재줄부터 색종이 붙인 위치 자연수 2개 a,b a는 왼쪽변과의 거리, b는 아래쪽 변과의 겨리
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] board = new int[100][100]; // 도화지의 크기는 정해져 있다.

        for (int i = 0; i < n; i++) {
            // 입력받는ㄴ 내용은 왼쪽 아래의 점이다.
            String[] leftdown = br.readLine().split(" ");
            int startLeft = Integer.parseInt(leftdown[0]);
            int startdown = Integer.parseInt(leftdown[1]);
            for (int j = startLeft; j < startLeft +10; j++) {
                for (int k = startdown; k < startdown + 10; k++) {
                    board[j][k] = 1;
                }
            }
        }

        // 100 * 100을 전부 순회하며 1을 센다.
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                sum += board[i][j];
            }
        }
        System.out.println(sum);
    }
}
