package W8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/1085
// 직사각형에서 탈출
public class B1085 {
    public static void main(String[] args) throws IOException {
        /* 한수는 지금 (x, y)에 있다.
         직사각형은 각 변이 좌표축에 평행하고,
         왼쪽 아래 꼭짓점은 (0, 0), 오른쪽 위 꼭짓점은 (w, h)에 있다.
         직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.
         첫째 줄에 x, y, w, h가 주어진다.
         1 ≤ w, h ≤ 1,000
         1 ≤ x ≤ w-1
         1 ≤ y ≤ h-1
         x, y, w, h는 정수*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken()); // 가로
        int h = Integer.parseInt(st.nextToken()); // 세로

        int rowMin = 0;
        int colMin = 0;

        // 가로 최솟값
        rowMin = Math.min(w - x, x);
        // 세로 최솟값
        colMin = Math.min(h - y, y);
        int min = Math.min(rowMin, colMin);
        System.out.println(min);
    }
}
