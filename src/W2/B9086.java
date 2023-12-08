package W2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/9086
// 문자열이 주어졌을 때 첫글자와 마지막 글자 출력
public class B9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = reader.readLine();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(str[i].charAt(0));
            System.out.println(str[i].charAt(str[i].length() -1));
        }
    }
}
