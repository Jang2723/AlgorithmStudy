package W5;

// https://www.acmicpc.net/problem/10798
// 세로읽기 - 2차원 배열-브1

/* 영어 대분자, 소문자, 숫자0~9
 수평 일렬로 단어 만든다.
 다섯개의 단어를 만든다. 단어의 글자수는 서로 다를 수 있다.
 한 줄에는 한 단어, 최대 15글자, 공백x
 세로로 읽을 떄 자리에 없다면 읽지 않고 그 다음 글자를 계속 읽는다.
세로로 읽은 글자를 공백없이 출력 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        char[][] ch = new char[5][15];
        int maxsize = 0;
        // str에 첫단어 저장, ch에 첫 단어를 한 글자씩 배열에 저장
        for (int i = 0; i < ch.length; i++) {
            str = br.readLine();
            if (maxsize < str.length()) maxsize = str.length();

            for (int j = 0; j < str.length(); j++) {
                ch[i][j]  = str.charAt(j);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < maxsize; i++) {
            for (int j = 0; j < 5; j++) {
                if(ch[j][i] == '\0') continue;
                sb.append(ch[j][i]);
            }
        }
        System.out.println(sb);
    }
}
