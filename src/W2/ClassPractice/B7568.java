package W2.ClassPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/7568
// 덩치를 키와 몸무게 두개의 값으로 등수를 매기려고 함
// 덩치는(몸무게, 키) 로 표현
// 덩치끼리 크기를 정할 수 없는 경우, 몸무게는 한사람이 크고 키는 다른사람이 클 경우
// 자신보다 덩치가 큰 사람이 k명이면 자신의 등수는 k+1
public class B7568 {
    public static void main(String[] args) throws IOException {
        // 첫줄에는 전체 사람 수 n
        // 공백으로 몸무게와 키가 주어진다.
        // 덩치의 등수를 구해서 첫줄에 출력하라
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        String[] str;
        for (int i = 0; i < n; i++) {
            str = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(str[0]); // 몸무게
            arr[i][1] = Integer.parseInt(str[1]); // 키
        }

        for (int i = 0; i < n ; i++) {
            int rank = 1; // 다 동일하게 등수를 1로 하고 덩치가 작을 떄는 등수 증가
            for (int j = 0; j < n; j++) {
                if (i == j) continue; // 비교하려는 사람이 같을 떄
                if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]){ // 키와 몸무게가 클 때만 RANK 증가
                    rank++;
                }
            }
            System.out.print(rank + " ");
        }

    }
}
