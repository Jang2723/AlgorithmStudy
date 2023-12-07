package W2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/10809
// 알파벳 찿기
public class B10809 {
    public static void main(String[] args) throws IOException {
        // 알파벳 소문자로 이루어진 단어 s
        // 단어에 포함되어 있는 경우에는 처음에는 등장하는 위치를
        // 여러번 등장해도 처음 등장하는 위치
        // 포함되어 있지 않으면 -1 출력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int[] count = new int[26]; // 알파벳 수 만큼
        for (int i = 0; i < count.length; i++) {
            count[i] = -1; // -1로 초기화
        }
        for (int i = 0; i < s.length(); i++) {
            // a의 아스키 코드 = 97
            int c = s.charAt(i) - 97;
            // 처음 등장하는 위치 기록
            if (count[c] == -1){
                count[c] = i;
            }
        }

        for (int i = 0; i < count.length; i++) {
            System.out.print(count[i] +" ");
        }
    }
}
