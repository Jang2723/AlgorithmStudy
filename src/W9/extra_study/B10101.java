package W9.extra_study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/10101
// 삼각형 외우기 - 브4
public class B10101 {
    public static void main(String[] args) throws IOException {
        /*
        세 각의 크기가 모두 60이면, Equilateral
        세 각의 합이 180이고, 두 각이 같은 경우에는 Isosceles
        세 각의 합이 180이고, 같은 각이 없는 경우에는 Scalene
        세 각의 합이 180이 아닌 경우에는 Error
        */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        int z = Integer.parseInt(br.readLine());

        int sum = x + y + z;
        if (x == 60 && y == 60 && z == 60){
            System.out.println("Equilateral");
        }else{
            if (sum == 180){
                // 두 각이 같은 경우
                if (x == y || y == z || x == z)
                    System.out.println("Isosceles");
                    // 가튼 각이 없는 경우
                else{
                    System.out.println("Scalene");
                }
            }
            else{
                System.out.println("Error");
            }
        }

    }
}
