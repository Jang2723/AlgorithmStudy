package W3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/5622
// 다이얼
public class B5622 {
    public static void main(String[] args) throws IOException {
        // 1번 걸려면 2초 소요 -> n번 걸려면 n+1초
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int count = 0;
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)){
                case 'A':
                case 'B':
                case 'C':
                    num= 2;
                    break;
                case 'D':
                case 'E':
                case 'F':
                    num = 3;
                    break;
                case 'G':
                case 'H':
                case 'I':
                    num = 4;
                    break;
                case 'J':
                case 'K':
                case 'L':
                    num = 5;
                    break;
                case 'M':
                case 'N':
                case 'O':
                    num = 6;
                    break;
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    num = 7;
                    break;
                case 'T':
                case 'U':
                case 'V':
                    num = 8;
                    break;
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    num = 9;
                    break;
                default:
                    num = 1;
                    break;
            }
            count += num + 1;
        }
        System.out.println(count);
    }
}


