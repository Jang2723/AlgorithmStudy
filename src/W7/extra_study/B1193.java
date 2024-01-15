package W7.extra_study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/1193
// 분수찾기 - 일반 수학- 실버5
public class B1193 {
    public static void main(String[] args) throws IOException {
        /*
        증가 하는 수add         1   2   3
        대각선 분자분모의 합sum  1+1 1+2 1+3
        처음은 0으로 시작한다고 가정
        */
        // 증가하는 수
        int add = 1;
        // 분자 분모의 합
        int sum = 1 + add;
        // 여태까지의 총 갯수
        int cnt = 1;
        // 이 전까지 갯수
        int temp = 0;


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());

        while(true){
            if (x <= cnt){
//                System.out.println(add);
//                System.out.println(sum);
//                System.out.println(cnt);
                break;
            }
            temp = cnt;
            add++;
            sum = 1 + add;
            cnt += add;
        }

        // 짝수 대각선 =  add가 짝수일때는
        // 분자는 1부터 시작 (왼 <-오)
        if (x == 1){
            System.out.println(add + "/" + (sum-add));
        }
        else{
            if(add % 2 ==0){
                // 이 대각선에서 몇칸 움직여야?
                int n = x - temp;
                System.out.println(n + "/" + (sum - n));
            }
            else {
                // 홀수 대각선 = add가 홀수일때
                // 분자는 add부터 시작(왼 -> 오)
                int n = x - temp;
                System.out.println((sum-n) +"/" + n);
            }
        }
    }
}
