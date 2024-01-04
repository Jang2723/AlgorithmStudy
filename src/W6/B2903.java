package W6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/2903
// 중앙 이동 알고리즘- 일반수학- 브3
public class B2903 {
    public static void main(String[] args) throws IOException {
        /*
        정사각형을 이루는 점 4개를 고른다.
        1. 정사각형의 각 변의 중앙에 점을 하나 추가한다.
        2. 정사각형의 중심에 점을 하나 추가한다.
        초기에 위 과정을 거치면 4개의 정사각형이 새로 생긴다.
        n번 거친 후 점은 총 몇개?
        초기에는 4개 -> 첫번쨰 9개 -> 두번쨰 25개
       i= 0   2의 제곱   1   3의 제곱   2    5의 제곱
               (2^i + 1)의 제곱과 같다
        */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println((int)Math.pow(Math.pow(2,n)+1,2));
    }
}
