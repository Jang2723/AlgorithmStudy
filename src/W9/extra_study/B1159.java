package W9.extra_study;
// https://www.acmicpc.net/problem/1159
// 농구경기 - 브2
/*  성의 첫 글자가 같은 선수 5명을 선발하려고 한다.
 만약, 성의 첫 글자가 같은 선수가 5명보다 적다면,
 상근이는 내일 있을 친선 경기를 기권하려고 한다.
 첫째 줄에 선수의 수 N (1 ≤ N ≤ 150)이 주어진다.
 다음 N개 줄에는 각 선수의 성이 주어진다.
 (성은 알파벳 소문자로만 이루어져 있고, 최대 30글자이다)
 다섯 명을 선발할 수 없는 경우에는 "PREDAJA" (따옴표 없이)를 출력
 선발할 수 있는 경우에는 가능한 성의 첫 글자를 사전순으로 공백없이 모두 출력한다.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1159 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.valueOf(st.nextToken());
        int[] alpa = new int[26];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            char firstChar = str.charAt(0);
            alpa[firstChar-'a']++; // 'a'의 아스키코드97
        }

        StringBuilder sb = new StringBuilder();

        // 5개 이상 비교
        for(int i = 0; i < alpa.length; i++) {
            if(alpa[i] >= 5) {
                sb.append((char) (i + 'a'));
            }
        }

        if(sb.length() == 0) {
            System.out.print("PREDAJA");
        }
        else {
            System.out.print(sb);
        }
    }
}
