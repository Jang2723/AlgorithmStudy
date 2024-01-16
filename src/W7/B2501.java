package W7;
// https://www.acmicpc.net/problem/2501
// 약수 구하기- 약수,배수- 브3
/*
어떤 자연수 p와 q가 있을때, 만일 p를 q로 나눴을 때 나머지가 0이면
q는 p의 약수이다.
두 자연수 n,k가 있을 때, n의 약수들 중 k번째로 작은 수를 출력하는 프로그램
1 <= k <= n <= 10000
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class B2501 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int k = Integer.parseInt(str[1]);

        List<Integer> num = new ArrayList<>();
        for (int i = 1; i <= n ; i++) {
            if(n % i == 0)
                num.add(i);
        }
        Arrays.sort(new List[]{num});
        if (num.size() < k){
            System.out.println(0);
        }else{
            System.out.println(num.get(k-1));
        }
    }
}
