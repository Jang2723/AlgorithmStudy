package W9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/9063
// 대지 - 브3
public class B9063 {
    public static void main(String[] args) throws IOException {
        /*옥구슬 위치 n개가 주어질대 대지의 크기를 계산
          옥구슬 위치는 2차원 정수좌표
          첫째 줄에는 점의 개수 N (1 ≤ N ≤ 100,000)
          이어지는 N 줄에는 각 점의 좌표가 두 개의 정수로 한 줄에 하나씩 주어진다.
          각각의 좌표는 -10,000 이상 10,000 이하의 정수
        * */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] nums = new int[n][2];
        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");
            nums[i][0] = Integer.parseInt(str[0]);
            nums[i][1] = Integer.parseInt(str[1]);
        }
        int xMax = nums[0][0];
        int xMin = nums[0][0];
        int yMax = nums[0][1];
        int yMin = nums[0][1];

        for (int i = 0; i < n; i++) {
            if (nums[i][0] >= xMax )
                xMax = nums[i][0];
            if (nums[i][0] <= xMin)
                xMin = nums[i][0];
        }

        for (int i = 0; i < n; i++) {
            if (nums[i][1] >= yMax )
                yMax = nums[i][1];
            if (nums[i][1] <= yMin)
                yMin = nums[i][1];
        }
        System.out.println((xMax-xMin)*(yMax-yMin));
    }
}
