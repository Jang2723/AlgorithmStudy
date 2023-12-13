package W3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/2908
// 상수가 2개 (ex : 734 893) 입력되면 거꾸로 읽어서 큰 수(437)를 출력하시오
public class B2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str=br.readLine().split(" ");
        String[] reverse=new String[str.length];
        int[] num = new int[reverse.length];

        for (int i = 0; i < str.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j=str[i].length()-1; j>=0; j--) {
                sb.append(str[i].charAt(j));
            }
            reverse[i] = sb.toString();
            num[i] = Integer.parseInt(reverse[i]);
        }

        int max=0;
        for (int i = 0; i < num.length; i++) {
            if(max < num[i]) max = num[i];
        }
        System.out.println(max);
    }
}
