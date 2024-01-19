package W7.extra_study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//https://www.acmicpc.net/problem/2587
// 대표값2 - 수학-브2
public class B2587 {
    public static void main(String[] args) throws IOException {
        // 5개의 자연수 평균과 중앙값을 구해라
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = new int[5];
        for (int i = 0; i < 5; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }
        int avg=0;
        for (int i = 0; i < 5; i++) {
            avg += nums[i];
        }
        avg /= 5;
        Arrays.sort(nums);
        System.out.println(avg);
        System.out.println(nums[2]);
    }
}
