package W4.ExtraStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/11050
// 이항계수 n,k -> n! / (k! * (n-k)!)
// 팩토리얼 재귀함수 만들어서 해결하면 될듯
public class B11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] num = br.readLine().split(" ");
        int n = Integer.parseInt(num[0]);
        int k = Integer.parseInt(num[1]);
        System.out.println(factorial(n)/((factorial(k)) * factorial(n-k)));
    }

    public static int factorial(int n){
        if (n == 0){ //  n == 1일 때 런타임에러(스택오버플로우)가 발생
                    //  재귀함수가 제대로 끝나기 않아서라고 인터넷에 나온다.
            return 1;
        }
        return n * factorial(n-1);
    }
}
