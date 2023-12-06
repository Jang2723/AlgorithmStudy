package W2;
//https://www.acmicpc.net/problem/10811
// 바구니 뒤집기 - 1차원 배열

import java.util.Scanner;

public class B10811 {
    public static void main(String[] args) {
        // 첫쨰 줄에 n과 m이 주어진다.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //바구니의 갯수

        // 바구니 숫자가 담긴 배열
        int[] arr = new int[n];

        // 처음 바구니의 순서 저장
        for (int i = 0; i < n; i++) {
            arr[i] =i+1; // 순서 저장
        }

        int m = sc.nextInt(); // 바구니를 역순으로 바꿀 횟수
        // 바구니 뒤집기
        for (int i = 0; i < m; i++) {
            // 범위 입력
            int left = sc.nextInt() -1; // -1은 배열이 0부터 시작하기 때문에
            int right = sc.nextInt() -1;

            while(left<right) {
                int temp = arr[left]; // 바꿀 첫 배열의 값만 저장
                arr[left++] = arr[right]; // 제일 끝의 값을 맨 앞으로 옮기기
                arr[right--] = temp; //
                // 1 2 3 4 역순해야 할 것이
                // temp = 1
                // arr[1] = 4
                // arr[4] = 1
                // left = 2, right = 3

                // temp = arr[2]= 2
                // arr[2] = arr[3] = 3
                // arr[3] = arr[2] = 2
                // left 3, right 2 -> while문 조건 벗어남
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
