package W4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/1259
//팰린드롬 수
public class B1259 {
    public static void main(String[] args) throws IOException {
        // 어떤 단어를 앞에서 읽어도 뒤에서 읽어도 같은 단어
        // 입력의 마지막은 0이며 0은 문제에 포함되지 않는다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String str = br.readLine();
            StringBuilder sb = new StringBuilder(str);
            String strReverse = sb.reverse().toString();

            if (str.equals("0")) break;
            // 문자열 비교
            if (str.equals(strReverse)){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }
    }
 }

