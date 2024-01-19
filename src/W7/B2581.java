package W7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// https://www.acmicpc.net/problem/2581
// 소수 - 약수, 배수 - 브2
public class B2581 {
    public static void main(String[] args) throws IOException {
        /*
        자연수 M이상 N이하의 자연수 중 소수인 것들을 모두골라
        소수의 합과 최솟값을 찾아라
        */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        List<Integer> nums = new ArrayList<>();
        int sum = 0;
        for (int i = m; i <= n ; i++) {
            int error = 0;
            if (i > 1){
                for (int j = 2; j <i ; j++) {
                    if(i % j == 0)
                        error += 1;
                }
                if (error== 0) {
                    nums.add(i);
                    sum += i;
                }
            }
        }
        if (nums.isEmpty()){
            System.out.println("-1");
        }
        else{
            System.out.println(sum);
            System.out.println(nums.get(0));
        }
    }
}
