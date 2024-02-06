package W10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/1018
// 체스판 다시 칠하기 - 실4
public class B1018 {
    public static void main(String[] args) throws IOException {
        /*
        MN 개의 단위 정사각형으로 나누어져 있는 M * N 크기의 보드
        어떤 정사각형은 검은색, 나머지는 흰색
        이 보드를 잘라서 8 * 8 체스판을 만드려고 한다.
        체스판 : 검은색, 흰색 번갈아서 색칠
        1. 맨 왼쪽 위가 흰색인 경우
        2. 맨 왼쪽 위가 검은색인 경우

        다시 칠해야 하는 정사각형의 최소 개수를 구해라

        첫째줄에  M N (8<= M , N <= 50)
        둘째줄 ~ N개의 줄 보드의 각 행의 상태

        B 는 검은색
        W 는  흰색

        */
        /*
        체스판을 만드는 경우의 수 (가로 칸 - 7) * (세로 칸 - 7)
        최소 크기 8 * 8일때 경우의 수가 1이므로 각 길이에 -7
        첫 칸의 색이 B W 2가지 경우
        = 2 * (가로 칸 - 7) * (세로 칸 - 7)
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        char[][] board = new char[m][n];
        // board 입력
        for (int i = 0; i < m; i++) {
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++){
                board[i][j] = str.charAt(j);
            }
        }

        // 체스판 다시 칠해야 하는 최소 횟수 계산
        int minCount = count(board, m, n);
        System.out.println(minCount);
    }

    static int count(char[][] board, int m, int n){
        int result = Integer.MAX_VALUE;

        for (int i = 0; i <= m - 8; i++) {
            for (int j = 0; j <= n - 8; j++) {
                // 시작 위치가 (i, j)인 8x8 체스판을 색칠하는데 필요한 최소 횟수 계산
                result = Math.min(result, repaint(board, i, j));
            }
        }
        return result;
    }

    static int repaint(char[][] board, int x, int y) {
        int count = 0;
        // 체스판 색깔 계산
        // 시작 위치의 보드 값으로 초기화 => 시작 색깔 지정
        char startColor = board[x][y];

        for (int i = x; i < x + 8; i++) {
            for (int j = y; j < y + 8; j++) {
                // (i+j)가 짝수이면 체스판의 시작 색과 같은지 비교
                // 뎨를들어 흰 검 흰 검 ... -> 흰 흰 : 1 + 3 = 짝수, 흰 검 1 + 2: 홀수
                // 홀수이면 체스판의 시작 색과 다른지 비교
                if ((i + j) % 2 == 0) { // 짝수이면 시작 색과 같은지 비교
                    if (board[i][j] != startColor) { // 색이 다르면 다시 칠해야 하니 증가
                        count++;
                    }
                } else { // 홀수이면
                    if (board[i][j] == startColor) { // 색이 같을 경우 다시 칠해야 하니 증가
                        count++;
                    }
                }
            }
        }
        // 현재 시작 위치에서 바꿔야 할 최소 횟수 반환, 64는 8*8 체스판의 칸수
        // 시작 색깔과 다를 경우 칠해주는 경우 count
        // 시작 색깔을 바꾸는데 사용, 위에서 계산한 다시 칠해야 하는 색깔을 유지하려는 경우가 64 - count
        return Math.min(count, 64 - count);
    }
}
