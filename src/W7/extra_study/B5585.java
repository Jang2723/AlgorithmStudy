package W7.extra_study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/5585
// 거스름돈 - 수학-브2
public class B5585 {
    public static void main(String[] args) throws IOException {
        /*
        잔돈 500,100,50,10,5,1엔 충분히 있고
        거스름돈 개수가 가장 적게 잔돈을 준다.
        물건을 사고 1000엔 지폐를 냈을 때
        받을 잔돈에포함된 잔돈의 갯수
        지불할 돈을 입력받는다
        */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int pay = Integer.parseInt(br.readLine());
        int money = 1000 - pay;
        int cnt = 0;
        while(money!=0){
            if (money >= 500){
                int a = money / 500;
                money -= 500;
                cnt += a;
            }
            else if ( money >= 100 ) {
                    int a = money / 100;
                    money -= a * 100;
                    cnt += a;
            }
            else if (money >= 50) {
                    int a = money / 50;
                    money -= a * 50;
                    cnt += a;
            }
            else if (money >= 10) {
                int a = money / 10;
                money -= a * 10;
                cnt += a;
            }
            else if (money >= 5) {
                int a = money / 5;
                money -= a * 5;
                cnt += a;
            }
            else{
                cnt += money;
                break;
            }
        }

        System.out.println(cnt);
    }
}
