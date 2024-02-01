package W9;
// https://www.acmicpc.net/problem/1436
// 영화감독 숌 - 브루틓포스 - 실5

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1436 {
    public static void main(String[] args) throws IOException {
        /*
        666 종말을 나타내는 수
        종말의 수 : 어떤수에 6이 적어도 3개 이상 연속으로 들어가는 수
        제일 작은 종말의 수 666
        그 다음           1666
                         2666 ...
        n번쨰 영화제목 : (n번쨰로 작은 종말의 수)
        */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int num = 666;
        int count =1;

        // num을 증가시키다가 666이 연속으로 나오는 숫자를 발견하면 count 증가
        // count가 증가할 떄의 num이 count번쨰로 작은 종말의 수
        while(count != n) {
            num++;
            if(String.valueOf(num).contains("666")) {
                count++;
            }
        }
        System.out.println(num);
    }
}
