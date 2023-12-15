package W3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/11721
// 옅개씩 끊어 제출하기
public class B11721 {
    public static void main(String[] args) throws IOException {
        // 알파벳 소문자와 대문자로만 이루어진 길이가 n인 단어
        // 한줄에 10개씩 끊어서 출력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder sb= new StringBuilder();
        int j=0;
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            j++;
            if ( j%10 == 0 || i == str.length()-1){
                System.out.println(sb);
                sb = new StringBuilder();
            }
        }
    }
}
