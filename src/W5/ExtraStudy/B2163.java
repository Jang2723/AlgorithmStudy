package W5.ExtraStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/2163
// 초콜릿 자르기 - 브1
public class B2163 {
    public static void main(String[] args) throws IOException {
        /*
        n * m 크기의 초콜릿 - > 총 N * M개
        n * m개의 조각으로 쪼갤 예정
        1 * 1 크기로 쪼개려면 최소 몇번 쪼개야 하나?
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NM= br.readLine().split(" ");
        int n = Integer.parseInt(NM[0]);
        int m = Integer.parseInt(NM[1]);

        int now = 1;
        int cnt = 0;
        int allCut = n * m;
        while(now!= allCut){
            now++;
            cnt++;
        }
        System.out.println(cnt);
    }
}
