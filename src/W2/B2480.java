package W2;

import java.util.Scanner;
// https://www.acmicpc.net/problem/2480
/* 주사위 3개를 던져
같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.
*/
public class B2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int reward = 0;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // a,b가 같을 떄
        if ( a == b){
            if(a == c){ //abc 10,000원+(같은 눈)×1,000원
                reward = 10000 + a * 1000;
            }
            else { //ab  1,000원+(같은 눈)×100
                reward = 1000 + a * 100;
            }
        }
        else{ // a,b가 다를때
            if(b == c) {//bc  1,000원+(같은 눈)×100
                reward = 1000 + b * 100;
            } else if (a == c) { // ac  1,000원+(같은 눈)×100
                reward = 1000 + a * 100;
            } else{ //(그 중 가장 큰 눈)×100원
                // a,b,c 모두 다름 제일 큰 수 구하기
                int max = 0;
                if(a>b){
                    if(a>c) max = a;
                    else max = c;
                }
                else{
                    if(b>c) max = b;
                    else max = c;
                }
                reward = max * 100;
            }
        }
        System.out.println(reward);

    }
}
