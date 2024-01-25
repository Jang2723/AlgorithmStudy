package W8.extra_study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/14215
// 세 막대 - 브3
public class B14215 {
    public static void main(String[] args) throws IOException {
        /*
        길이가 a, b, c인 세 막대를 가지고 있고, 각 막대의 길이를 마음대로 줄일 수 있다.
        - 각 막대의 길이는 양의 정수이다
        - 세 막대를 이용해서 넓이가 양수인 삼각형을 만들 수 있어야 한다.
        - 삼각형의 둘레를 최대로 해야 한다.
        a, b, c가 주어졌을 때, 만들 수 있는 가장 큰 둘레를 구하는 프로그램
        첫째 줄에 a, b, c (1 ≤ a, b, c ≤ 100)가 주어진다.
        */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        //가장 긴 변의 길이가 다른 변의 길이의 합보다 작아야 한다
        //이 조건을 지키는 경우 세 변의 합을 출력하면 되고
        //그렇지 않을 경우 가장 긴 변의 길이를 줄여서 출력
        int maxN = 0;
        if(a>b){
            if(b>c) maxN = a;
            else maxN = Math.max(a, c);
        }
        else maxN = Math.max(b, c);

        if(a+b+c-maxN > maxN) System.out.println(a+b+c);
        else System.out.print((a+b+c-maxN)*2-1);
    }
}
