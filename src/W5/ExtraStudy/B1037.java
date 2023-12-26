package W5.ExtraStudy;

// https://www.acmicpc.net/problem/1037
// 약수 - 수학,문자열 -브1

/*
양수 A가 N의 진짜 약수가 되려면
N이 A의 배수이고, A가 1과 N이 아니어야 한다.
어떤 수 N의 진짜 약수가 주어질때 N을 구하는 프로그램을 작성하시오

첫째 줄에 N의 진짜 약수의 개수 50보다 작거나 같은 자연수
둘째 줄에는 N의 진짜 약수가 주어진다. 중복되지 않는다.-> 숫자가 하나라면 그 숫자의 제곱이 N
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class B1037 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str;
        int a = 0;
        str = br.readLine().split(" ");
        if (n == 1){
            a = Integer.parseInt(str[0]);
        }

        int max = 0;
        // 가장 작은 수를 0으로 두면 무조건 답이 0으로 나옴
        int min = Integer.parseInt(str[0]);

        for (int i = 0; i < n; i++) {
            if (max < Integer.parseInt(str[i])){
                max = Integer.parseInt(str[i]);
            }
            if (min > Integer.parseInt(str[i])){
                min = Integer.parseInt(str[i]);
            }
        }

        if (n == 1){
            System.out.println(a*a);
        }
        else{
            System.out.println(max * min);
        }
    }
}
