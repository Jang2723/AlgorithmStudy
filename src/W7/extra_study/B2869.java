package W7.extra_study;
// https://www.acmicpc.net/problem/2869
// 달팽이는 올라가고 싶다 - 일반수학1- 브1
/*
이 달팽이는 높이가 V미터인 나무 막대를 올라갈 것이다.
달팽이는 낮에 A미터 올라갈 수 있다.
하지만, 밤에 잠을 자는 동안 B미터 미끄러진다.
또, 정상에 올라간 후에는 미끄러지지 않는다.
달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸리는지 구하는 프로그램을 작성하시오.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class B2869 {
    public static void main(String[] args) throws IOException {
        // 첫쨰줄에 세 정수 a,b,v공백으로 주어진다. (1 ≤ B < A ≤ V ≤ 1,000,000,000)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        // 등차수열을 이용해 풀기
        // 정상에 도달하기 위해 필요한 일수 계산
        int day = (v - b - 1) / (a - b) + 1;
        System.out.println(day);
    }
}

/* 처음에는 StringTokenizer이 아닌 String[] 에 공백기준으로 입력 받아서 int에 각각 나눠줬는데
시간초과로 방법을 찾다가 StringTokenizer을 발견했다.
 시간초과 코드
        // 총 높이 h
        int h = 0;
        int day = 0;
        while (h < v) {
            h += a;
            day++;

            if (h >= v) {
                break;
            }
            h -= b;
        }
 */