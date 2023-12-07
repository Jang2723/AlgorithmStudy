package W2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/10813
// 공바꾸기
public class B10813 {
    public static void main(String[] args) throws IOException {
        /*
        바구니 n개, 1~n 번호가 써있음
        처음엔 공이 1개씩 들어있고 공과 바구니 번호가 일치한다.
        m 번 공을 바꾸려고 한다.
        바꿀 바구니 2개 선택하고 공을 바꾼다.
        m번 후 들어있는 공의 번호를 순서대로 구하시오
        */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NM = br.readLine().split(" ");
        int n = Integer.parseInt(NM[0]);
        int m = Integer.parseInt(NM[1]);
        int[] arr = new int[n+1]; // 0사용x

        // 처음 바구니에 공 넣기
        for (int i = 1; i <= n; i++) {
            arr[i] = i; // 바구니가 1번부터 있으니 공도 1번부터 있다.
        }
        //        1,2 -> 2,1,3,4,5
        //        3,4 -> 2,1,4,3,5
        //        1,4 -> 3,1,4,2,5
        //        2,2 -> 3,1,4,2,5
        // m번 공을 바꾸기
        for (int i = 0; i < m; i++) {
            String[] AB = br.readLine().split(" ");
            int a = Integer.parseInt(AB[0]);
            int b = Integer.parseInt(AB[1]);
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;

        }

        for (int i = 1; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
