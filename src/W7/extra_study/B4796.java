package W7.extra_study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/4796
// 캠핑 - 수학, 브1
public class B4796 {
    public static void main(String[] args) throws IOException {
        /*캠핑장을 연속하는 P일 중, L일동안만 사용할 수 있다.
        강산이는 이제 막 V일짜리 휴가를 시작했다.
         강산이가 캠핑장을 최대 며칠동안 사용할 수 있을까? (1 < L < P < V)
         L, P, V를 순서대로 포함하고 있다.
         마지막 줄에는 0이 3개 주어진다.
        */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int i = 1;
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            if (l == 0 && p == 0 && v == 0) break;
            int total = l * (v / p) + Math.min(l, v % p);
            // 출력 형태를 잘 일치시키지 않아서 실패할 때가 있음
            sb.append("Case " + i + ": " + total + "\n");
            i++;
        }
        System.out.print(sb);
    }
}
