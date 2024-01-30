package W9;
// https://www.acmicpc.net/problem/2798
// 블랙잭 -브루트포스- 브2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2798 {
    public static void main(String[] args) throws IOException {
        /*
        카드의 합이 21을 넘지 않는 한도내에서 카드의 합 최대
        딜러는 N장의 카드를 모두 숫자가 보이도록 바닥에 놓고
        딜러가 숫자 M을 크게 외친다.
        플레이어는 제한된 시간 안에 N장의 카드 중 3장의 카드를 고른다.
        M을 넘지 않으면서 M과 최대한 가깝게
        첫째 줄에 카드의 개수 N(3 ≤ N ≤ 100)  M(10 ≤ M ≤ 300,000)
        둘째 줄에는 카드에 쓰여 있는 수가 주어지며, 이 값은 100,000을 넘지 않는 양의 정수
        */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int [n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int result = search(arr, n, m);
        System.out.println(result);
    }


    // 탐색
    static int search(int[] arr, int n, int m){
        int result = 0;

        // 3장을 고를 예정, 총 개수에서 -2 한 만큼만 순회
        for (int i = 0; i < n -2; i++) {

            // 첫번째 카드 다음부터 n-1
            for (int j = i+1 ; j < n -1; j++) {
                for (int k = j+1; k < n; k++) {

                    // 3개의 카드 합 변수 temp
                    int temp = arr[i] + arr[j] + arr[k];

                    // m과 같으면 return
                    if (temp == m){
                        return temp;
                    }

                    // 세 카드의 합이 이전 합보다 크면서 m보다 작을경우 result 갱신
                    if (result < temp && temp < m){
                        result = temp;
                    }
                }
            }
        }

        // 모든 순회가 끝나면 return
        return result;
    }
}
