package W7.extra_study;

import javax.management.StringValueExp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/1357
// 뒤집힌 덧셈 - 브1
public class B1357 {
    public static void main(String[] args) throws IOException {
        /*
        x가 주어졌을 때 역순이 된 수를 얻을 수 있다.
        양의 정수 x,y가 주어졌을 때 x,y의 역수의 합의 역수를 출력하시오
        x,y <= 1000
        */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        StringBuffer xStr = new StringBuffer(str[0]);
        StringBuffer yStr = new StringBuffer(str[1]);
        // 문자열을 뒤집는 reverse()를 쓰기 위해서 String을 StringBuffer에 저장
        int x = Integer.parseInt(xStr.reverse().toString());
        int y = Integer.parseInt(yStr.reverse().toString());
        // 정수 값을 다시 스트링버퍼에 저장해주기 위해 문자열로 변환해주는 String.valueOf()사용
        StringBuffer xy = new StringBuffer(String.valueOf(x+y));
        // 10의 역수를 1로 출력하기 위해 정수형으로 변환해서 출력
        System.out.println(Integer.parseInt((xy.reverse().toString())));
    }
}
