package W3.extraStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/1152
// 단어의 개수
public class B1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int cnt = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i].isBlank()) continue;
            cnt++;
        }
        System.out.println(cnt);
    }
}
