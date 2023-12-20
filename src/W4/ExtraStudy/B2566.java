package W4.ExtraStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

// https://www.acmicpc.net/problem/2566
// 최댓값
public class B2566 {
    public static void main(String[] args) throws IOException {
        // 9 * 9 배열에 81개의 숫자가 있을 때 
        // 최댓값과 위치를 출력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int [9][9];
        // 81개의 자연수 입력
        for (int i = 0; i < 9; i++) {
            String[] num = br.readLine().split(" ");
            for (int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(num[j]);
            }
        }

        int max = 0;
        int row = 0;
        int col = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (max <= arr[i][j]){ // 최댓값이 2개 이상인 경우 하나만 출력
                    max = arr[i][j];
                    row = i + 1;
                    col = j + 1;
                }
            }
        }

        System.out.println(max);
        System.out.println(row +" "+col);
    }
}
