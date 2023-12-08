package W2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

// https://www.acmicpc.net/problem/27866
public class B27866 {
    public static void main(String[] args) throws IOException {
//단어와 정수i가 주어졌을 떄 i번쨰 글자를 출력해라
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        int n = Integer.parseInt(reader.readLine());
        System.out.println(str.charAt(n-1));
    }
}
