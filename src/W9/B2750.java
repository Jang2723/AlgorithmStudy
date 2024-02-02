package W9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// https://www.acmicpc.net/problem/2750
// 수 정렬하기 - 브2, 정렬
public class B2750 {
    public static void main(String[] args) throws IOException {
        //n개의 수가 주어졌을 떄 오름차순 정렬
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            System.out.println(nums[i]);
        }
    }
}
