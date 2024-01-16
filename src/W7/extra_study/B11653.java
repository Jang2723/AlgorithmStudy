package W7.extra_study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// https://www.acmicpc.net/problem/11653
// 소인수분해 - 약수,소수,배수 - 브1
public class B11653 {
    public static void main(String[] args) throws IOException {
        // 정수 n이 주어졌을 때 소인수 분해하는 프로그램
        //  1 <= n <= 10000000
        // 결과를 한줄에 하나씩 오름차순으로 출력
        // n이 1인 경우 아무것도 출력 x

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> num = new ArrayList<>();
        int k = 2;
        int temp = n;
        while(temp >1){
            if (temp % k == 0){
                temp /= k;
                num.add(k);
            }
            else{
               k++;
            }
        }

        if (n == 1){
            System.out.println();
        }else {
            for(int a: num)
                System.out.println(a);
        }
    }
}
