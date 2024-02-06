package W9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/3009
// 네번째 점 - 브3
public class B3009 {
    public static void main(String[] args) throws IOException {
        // 세 점이 주어졌을 때 축에 평행한 직사각형을 만들기 위해서 필요한 네번째 점을 찾아라
        // 세 점의 좌표가 한줄에 하나씩 주어진다. (1보다 크고 1000보다 작거나 같은 정수)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] box = new int[3][2];
        for (int i = 0; i < 3; i++) {
            String[] str = br.readLine().split(" ");
            box[i][0] = Integer.parseInt(str[0]);
            box[i][1] = Integer.parseInt(str[1]);
        }
        int x;
        int y;
        // x좌표가 남는것 찾기
        if (box[0][0] == box[1][0]){
            // 이 둘이 같으면 box[2][0]의 값이 x의 값
            x = box[2][0];
        }
        else if (box[0][0] == box[2][0]) {
            x = box[1][0];
        }
        else{
            x = box[0][0];
        }
        // y좌표가 남는 것 찾기
        if (box[0][1] == box[1][1]){
            // 이 둘이 같으면 box[2][0]의 값이 x의 값
            y = box[2][1];
        }
        else if (box[0][1] == box[2][1]) {
            y = box[1][1];
        }
        else{
            y = box[0][1];
        }
        System.out.println(x+" "+y);

    }
}
