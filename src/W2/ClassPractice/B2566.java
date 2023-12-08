package W2.ClassPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//   https://www.acmicpc.net/problem/2566
// 최댓값
public class B2566 {
    public static void main(String[] args) throws IOException {
        // 9*9 배열에 81개의 자연수 또는 0이 주어지면 최댓값의 위치를 출력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[9][9];
        int max =0;

        for (int i = 0; i < 9; i++) {
            String[] str = br.readLine().split(" ");
            for (int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(str[j]);
            }
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (max < arr[i][j]){
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
