package W7.extra_study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

// https://www.acmicpc.net/problem/25305
// 커트라인 - 브2
public class B25305 {
    /*
    N명의 학생,  점수가 가장 높은 K명 상받음
    커트라인은 상받은 사람들 중 점수가 가장 낮은 사람
    Arrays.sort에서 Collections.reverseOrder라는 역순 정렬을 사용하기 위해
    scoreInt 배열을 Integer로 선언해주었다.
    */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nk = br.readLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);

        String[] scores = br.readLine().split(" ");
        Integer[] scoreInt = new Integer[scores.length];
        for (int i = 0; i < scoreInt.length; i++) {
            scoreInt[i] = Integer.parseInt(scores[i]);
        }
        Arrays.sort(scoreInt, Collections.reverseOrder());
        System.out.println(scoreInt[k-1]);

    }
}
