package W5.ExtraStudy;

// https://www.acmicpc.net/problem/1100
// 하얀 칸- 문자열 브2
/*
체스판은  8 * 8 크기, 컴정과 하얀칸이 번갈아 색칠
가장 왼쪽 위 칸은 (0,0) - 하얀색
흰색
i   j
0 : 0 2 4 6
1 : 1 3 5 7
2 : 0 2 4 6 -> i와 j를 더한 값을 2로 나눈 나머지가 0일 때 흰색
체스판의 상태가 주어졌을 때 하얀 칸 위에 말이 몇개?
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class B1100 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt=0;
        for (int i = 0; i < 8; i++) {
            String temp = br.readLine();
            for (int j = 0; j < 8; j++) {
                if (temp.charAt(j) == 'F' && (i+j) %2 == 0){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
