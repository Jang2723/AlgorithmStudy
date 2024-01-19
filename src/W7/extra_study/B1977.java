package W7.extra_study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// https://www.acmicpc.net/problem/1977
// 완전제곱수 - 구현-브2
public class B1977 {
    public static void main(String[] args) throws IOException {
        // m이상 n이하 자연수 중 완전제곱수인 것을 모두 골라
        // 그 합을 구하고 그 중 최솟값을 구하시오
        // m <= n <= 10000
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        // 완전제곱수인 자연수들의 합
        int sum =0;
        List<Integer> list = new ArrayList<>();
        // 완전 제곱수 판별
        // 입력값의 최대는 10000 -> 100의 제곱값이므로
        // 1부터 100까지 제곱값을 찾으면서 주어진 범위인지 판단하면 된다.
        // 제곱값이 n(주어진 범위 최댓값)을 넘어가면 for문 종료
        // Math.pow() -> 제곲값
        // Math.sqrt() -> 제곱근
        for (int i = 1; i <=100 ; i++) {
            int tmp = (int)Math.pow(i,2);
            if (tmp <= n && tmp >= m) list.add(tmp);
            if(tmp > n) break;
        }

        if (list.isEmpty()) System.out.println(-1);
        else{
            for(int i : list) {
                sum+= i;
            }
            System.out.println(sum);
            System.out.println(list.get(0));
        }
    }
}
