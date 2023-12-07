package W2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/10810
// 공 넣기 - 1차원 배열
/*    // 바구니 n개 - 번호 매겨져 있음
        // 1~n 적혀있는 공이 매우 많음
        // 가장 처음 바구니는 공이 들어있지 않고
        // 바구니에는 공을 1개만 넣을 수 있다.
        // m번 공을 넣으려고 한다.
        // 한번 공을 넣을 떄 넣을 바구니 범위를 정하고
        // 이미 공이 있는 경우에는 들어있던 공을 빼고 다시 바구니에 넣는다.
*/
public class B10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] NM = bf.readLine().split(" ");
        int n = Integer.parseInt(NM[0]);
        int m = Integer.parseInt(NM[1]);
        int[] arr = new int[n];
        for (int i = 0; i < m; i++) {
            String[] IJK = bf.readLine().split(" ");
            int  I = Integer.parseInt(IJK[0]);
            int  J = Integer.parseInt(IJK[1]);
            int  K = Integer.parseInt(IJK[2]);

            for (int j = I; j < J+1 ; j++) {
                arr[j-1] = K;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

/* 0 0 0 0 0
*  3 3 0 0 0
*  3 3 4 4 0
*  1 1 1 1 0
*  1 2 1 1 0
* */