package W9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/5073
// 삼각형과 세변 - 브3
public class B5073 {
    public static void main(String[] args) throws IOException {
        /*
         삼각형의 세 변의 길이가 주어질 때 변의 길이에 따라 다음과 같이 정의한다.
            - Equilateral :  세 변의 길이가 모두 같은 경우
            - Isosceles : 두 변의 길이만 같은 경우
            - Scalene : 세 변의 길이가 모두 다른 경우
         가장 긴 변의 길이보다 나머지 두 변의 길이의 합이 길지 않으면
         주어진 조건을 만족하지 못하면 Invalid 출력
         1000을 넘지 않는 정수 3개
         마지막 줄은 0 0 0 -> 계산하지 않는다.
         조건 잘 따지기!
        */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            int maxAB = Math.max(a,b);
            int max = Math.max(maxAB, c);

            if( a == 0 && b == 0 && c == 0) break;
            // 세변의 길이가 모두 같은 경우
            if ( a == b && b == c ){
                System.out.println("Equilateral");
            }
            // 세변의 길이가 모두 다른 경우
            else if (a != b && a != c && b != c) {
                if (max >= ((a + b + c) - max)) {
                    System.out.println("Invalid");
                } else {
                    System.out.println("Scalene");
                }
            }
            // 두 변의 길이가 같은 경우
            else{
                if (max >= ((a + b + c) - max)) {
                    System.out.println("Invalid");
                }else{
                    if(a == b){
                        System.out.println("Isosceles");
                    }
                    else if (a == c) {
                        System.out.println("Isosceles");
                    }
                    else{
                        System.out.println("Isosceles");
                    }
                }
            }
        }
    }
}
