package W5;
// https://www.acmicpc.net/submit/2738
// 행렬 덧셉 - 2차원 배열 - 브5
/*
n * m 행렬 2개
예전에 Scanner로 풀얼본 적이 있음
BufferedReader로 풀어보기
===============================
1. Scanner 풀이           ->  메모리 : 36936KB, 시간: 652ms, 코드 길이: 781KB
2. BufferedReader 풀이    ->  메모리 : 18956KB, 시간: 384ms, 코드 길이: 1258KB
코드 길이는 BufferedReader가 더 길었는데 메모리, 시간이 거의 절반정도 감소했다.
확실히 Scanner 보다는 BufferedReader가 빠른 듯
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        // 행렬 a,b
        int[][] arrA = new int[n][m];
        int[][] arrB = new int[n][m];

        for (int i = 0; i <n ; i++) {
            String[] numA = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                arrA[i][j] = Integer.parseInt(numA[j]);
            }
        }
        for (int i = 0; i <n ; i++) {
            String[] numB = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                arrB[i][j] = Integer.parseInt(numB[j]);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arrA[i][j] + arrB[i][j] +" ");
            }
            System.out.println();
        }
    }
}
