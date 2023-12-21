package W4.ExtraStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/2475
// 검증 수
public class B2475 {
    public static void main(String[] args) throws IOException {
        // 5자리 수가 들어옴
        // 각자리의 제곱의 합을 10으로 나눈 나머지가 검증 수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] num = br.readLine().split(" ");
        int sum = 0;
        for(String n : num){
            int temp = Integer.parseInt(n);
            sum += temp * temp;
        }
        System.out.println(sum%10);
    }
}
