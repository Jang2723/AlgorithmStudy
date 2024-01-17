package W7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// https://www.acmicpc.net/problem/9506
// 약수들의 합-  약수,배수- 브1
public class B9506 {
    public static void main(String[] args) throws IOException {
        /*어떤 숫자 n이 자신을 제오한 모든 약수들의 합과 같으면 완전수
        n이 완전수라면 약수들의 합으로 출력(오름차순)
        완전수가 아니면 n is NOT perfect출력
        -1이 입력되면 종료*/
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            int n = Integer.parseInt(br.readLine());
            if (n == -1) break;
            int sum =0; // 약수들의 합 저장
            List<Integer> num = new ArrayList<>();
            // 약수들의 합과 약수 구하기(자기자신뺴고)
            for (int i = 1; i < n ; i++) {
                if (n % i == 0){
                    //약수
                    sum += i;
                    num.add(i);
                }
            }

            // 완전수인지 판별
            if (n == sum){
                // 완전수
                System.out.print(n + " = ");
                for (int i = 0; i < num.size() -1 ; i++) {
                    System.out.print(num.get(i) + " + ");
                }
                System.out.println(num.get(num.size() - 1));
            }
            else{
                System.out.println(n + " is NOT perfect.");
            }
        }
    }
}
