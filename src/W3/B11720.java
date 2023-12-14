package W3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/11720
// 숫자의 합
public class B11720 {
    public static void main(String[] args) throws IOException {
        //  n개의 숫자가 공백없이 쓰여있을 때 이 숫자를 모두 합해서 출력하는 프로그램
        // 첫줄에는 숫자의 개수, 둘쨰줄에 숫자n개가 공백없이 주어진다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split("");
        int[] num = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
                num[i] = Integer.parseInt(str[i]);
                sum += num[i];
        }
        System.out.println(sum);
    }
}
