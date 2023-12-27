package W5.ExtraStudy;


// https://www.acmicpc.net/problem/1076
// 저항 - 브2
/*
처음 2개의 색은 저항의 값, 마지막 색은 곱해야 하는 값
yellow, violet, red => 4,7,100 = 4700
3줄에 걸쳐서 색이 주어진다.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1076 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] resistance = {
                {"black","0","1"},
                {"brown","1","10"},
                {"red","2","100"},
                {"orange","3","1000"},
                {"yellow","4","10000"},
                {"green","5","100000"},
                {"blue","6","1000000"},
                {"violet","7","10000000"},
                {"grey","8","100000000"},
                {"white","9","1000000000"}
        };

        String[] input = new String[3];
        for (int i = 0; i < 3; i++) {
            input[i] = br.readLine();
        }
        // test case 3: white, white,white 일 경우 출력 값이 int의 범위를 넘어간다.
        long oma = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            if (i < 2){ // 값을 찾기
                for (int j = 0; j < resistance.length; j++) {
                    if (input[i].equals(resistance[j][0])){
                        sb.append(resistance[j][1]);
                    }
                }
            }
            else{ // 곱
                for (int j = 0; j < resistance.length; j++) {
                    if (input[i].equals(resistance[j][0])){
                        oma = Long.parseLong(sb.toString()) * Long.parseLong(resistance[j][2]);
                    }
                }
            }
        }
        System.out.println(oma);
    }
}
