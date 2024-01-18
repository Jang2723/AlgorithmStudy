package W7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/1978
// 소수 찾기 - 약수, 배수- 브2
public class B1978 {
    public static void main(String[] args) throws IOException {
        /*
        주어진 수 n개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램
        첫줄에 수의 개수 n (n <= 100)
        다음으로는 n개의 수가 주어짐 (<= 1000)
        소수 : 1이 아닌 자연수 중 자기자신과 1만 약수로 갖는 자연수
        */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        // 소수 판별
        int cnt = 0;
        for (int num : nums) {
            int error = 0;
            if (num > 1){
                for (int i = 2; i <num ; i++) {
                    if (num % i == 0)
                        error += 1;
                }
                if (error == 0)
                    cnt++;
            }
        }
        System.out.println(cnt);
    }
}
