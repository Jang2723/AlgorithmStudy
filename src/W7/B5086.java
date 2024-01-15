package W7;
//https://www.acmicpc.net/problem/5086
// 배수와 약수 - 약수,배수와 소수-브3
/*
두 수가 주어졌을 때, 다음 3가지 중 어떤 관계인지 구하는 프로그램을 작성하시오.
첫 번째 숫자가 두 번째 숫자의 약수이다.
첫 번째 숫자가 두 번째 숫자의 배수이다.
첫 번째 숫자가 두 번째 숫자의 약수와 배수 모두 아니다.
마지막 줄에는 0이 2개 주어진다
첫 번째 숫자가 두 번째 숫자의 약수라면 factor를, 배수라면 multiple을, 둘 다 아니라면 neither를 출력한다.
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B5086 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String[] str = br.readLine().split(" ");
            int n = Integer.parseInt(str[0]);
            int m = Integer.parseInt(str[1]);
            // 반복문 종료 조건
            if(n == 0 && m == 0)
                break;

            if (m % n == 0)
                System.out.println("factor");
            else if (n % m == 0)
                System.out.println("multiple");
            else
                System.out.println("neither");
        }
    }
}
